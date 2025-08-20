package ch13;

public class Thread2Demo {

	public static void main(String[] args) {

		// Runnable 인터페이스를 익명 구현 객체로 활용하여 Thread 만들기

		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
				System.out.println("안녕");

			}

		});
		thread.start();

		System.out.println(Thread.currentThread().getName());
		System.out.println("hello");

	}

}
