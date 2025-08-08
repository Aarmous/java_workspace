package ch09;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		try {
			method();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	static void method() throws InterruptedException { // Exception 을 main으로 던진다.
		method2();

	}

	static void method2() throws InterruptedException { // Exception 을 method로 던진다.
		Thread.sleep(100);
	}

}
