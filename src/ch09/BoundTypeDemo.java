package ch09;

public class BoundTypeDemo {

	public static void main(String[] args) {
		BoundCup<Beer> c1 = new BoundCup<>();
		// 앞에서 Beer로 <>를 만들었으면, 뒤에서 BoundCup 뒤에도 빈 <>을 붙인다.

		c1.setBeverage(new Beer());
		c1.setBeverage(null);

		BoundCup<Boricha> c2 = new BoundCup<>();

//		BoundCup<String> c3 = ner BoundCup<>();  // String는 Beverage의 상속자가 아니기에, 불가능
	}

}

class BoundCup<T extends Beverage> {
	private T beverage;

	public T getBeverage() {
		return beverage;
	}

	public void setBeverage(T beverage) {
		this.beverage = beverage;
	}

}