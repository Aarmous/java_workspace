package ch09;

import ch06.sec02.Ball;

public class GenericClassDemo {

	public static void main(String[] args) {
		Cup c = new Cup();

		c.setBeverage(new Beer());
		Object o = c.getBeverage();
		Beer b = (Beer) o;
		b.drink();

		Cup c1 = new Cup();

		c1.setBeverage(new Boricha());
		c1.setBeverage(new Beer());
		c1.setBeverage(new Ball());

		Object o1 = c1.getBeverage();
		if (o1 instanceof Beer b1) {
			b1.drink();
		}
		if (o1 instanceof Boricha b2) {
			b2.eat();
		}

	}

}

class Cup {
	private Object beverage;

	public Object getBeverage() {
		return beverage;
	}

	public void setBeverage(Object beverage) {
		this.beverage = beverage;
	}

	@Override
	public String toString() {
		return "Cup입니다.";
	}

}

class Beverage {

	@Override
	public String toString() {
		return "Beverage입니다.";
	}
}

class Beer extends Beverage {
	void drink() {
		System.out.println("맥주를 마신다.");
	}

	@Override
	public String toString() {
		return "Beer입니다.";
	}

}

class Boricha extends Beverage {
	void eat() {
		System.out.println("보리차를 마신다.");

	}

	@Override
	public String toString() {
		return "Boricha입니다.";
	}

}