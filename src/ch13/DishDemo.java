package ch13;

public class DishDemo {

	public static void main(String[] args) {
		Dish dish = new Dish();

		new Thread(new Cook(dish)).start();
		new Thread(new Customer(dish)).start();

	}

}

class Dish {
	private boolean empty = true;

	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
}

class Cook implements Runnable {
	private final Dish dish;

	public Cook(Dish dish) {
		this.dish = dish;
	}

	private void cook(int i) throws InterruptedException {
		synchronized (dish) {
			while (!dish.isEmpty()) {
				dish.wait();
			}
			dish.setEmpty(false);
			System.out.println(i + " 번째 음식이 준비되었습니다.");
			dish.notify();
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				cook(i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Customer implements Runnable {
	private final Dish dish;

	public Customer(Dish dish) {
		this.dish = dish;
	}

	private void eat(int i) throws InterruptedException {
		synchronized (dish) {
			while (dish.isEmpty()) {
				dish.wait();
			}
			dish.setEmpty(true);
			System.out.println(i + " 번째 음식을 먹었습니다.");
			dish.notify();
		}
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				eat(i);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
