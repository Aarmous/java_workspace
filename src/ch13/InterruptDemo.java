package ch13;

public class InterruptDemo {

	public static void main(String[] args) {
		Runnable task = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("안녕");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		};
		Thread thread = new Thread(task);
		thread.setPriority(Thread.MAX_PRIORITY);
		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
