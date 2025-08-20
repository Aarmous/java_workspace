package ch13;

public class Thread3Demo {

	public static void main(String[] args) {

		// Runnable 인터페이스의 구현체(Thread)를 상속받은 자식 WorkerThread 를 따로 작성하고
		// 이를 활용하여 Thread 만들기

		Thread thread = new WorkerThread();
		thread.start();

		Thread thread1 = new WorkerThread();
		thread1.start();

		System.out.println(Thread.currentThread().getName());
		System.out.println("hello");

	}

}

class WorkerThread extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("안녕");
	}
}
