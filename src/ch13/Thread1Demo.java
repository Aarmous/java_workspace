package ch13;

public class Thread1Demo {

	public static void main(String[] args) {

		// Runnable 인터페이스를 직접 구현 객체로 활용하여 Thread 만들기

		Thread thread = new Thread(new MyRunnable());
		thread.start();

		System.out.println(Thread.currentThread().getName());
		System.out.println("hello");

		Thread thread1 = new Thread(new MyRunnable());
		thread1.start();

	}

}

// Thread에게 작업을 시킬 때, 작업할 내용
class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("안녕");

	}

}
