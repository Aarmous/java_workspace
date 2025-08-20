package ch13;

import java.util.Random;

public class SharedDemo {

	public static void main(String[] args) {

		// 여러 Thread가 같은 car를 공유할 때, 서로 겹치는 일을 방지하기 위해 synchronized 를 사용
		// 여러 Thread가 synchronized(동기화) 되어 있어서,
		// Thread(1) 이 작업하고 있을 때, Thread(2) 가 끼어들수 없다. (can't interrupt)

		SharedCar car = new SharedCar();
		new CarThread("A", car, "부산").start();
		new CarThread("B", car, "서울").start();
		new CarThread("C", car, "대전").start();
	}

}

class SharedCar {
	public synchronized void drive(String name, String where) {
		System.out.println(name + " 님이 자동차에 탔습니다.");
		Random r = new Random();
		for (int i = 0; i < r.nextInt(1, 3); i++) {
			System.out.println(name + " 님이 자동차를 운전합니다.");
		}
		System.out.println(name + " 님이 " + where + " 에 도착했습니다.");
	}
}

class CarThread extends Thread {
	private String who;
	private SharedCar car;
	private String where;

	public CarThread(String who, SharedCar car, String where) {
		this.who = who;
		this.car = car;
		this.where = where;
	}

	@Override
	public void run() { // 작업할 일은?
		car.drive(who, where);
	}

}