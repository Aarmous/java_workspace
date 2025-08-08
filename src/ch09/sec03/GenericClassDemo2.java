package ch09.sec03;

import java.util.ArrayList;

public class GenericClassDemo2 {

	public static void main(String[] args) {
		Cup<Beer> beerCup = new Cup<>();

//		beerCup.setBeverage(new Ball());  // Error 
		// Cup타입의 beerCup는 Generic에 의해 Beer타입만 담기 때문에, Ball 객체를 담을 수 없다.

//		beerCup.setBeverage(new Boricha());  // Error
		// Boricha 도 Beer 타입이 아니기에 담을 수 없다.

		beerCup.setBeverage(new Beer());
		Beer b = beerCup.getBeverage();
		b.drink();

		Cup<Boricha> boriCup = new Cup<>();
		boriCup.setBeverage(new Boricha());
		Boricha bc = boriCup.getBeverage();
		bc.eat();

		ArrayList<Integer> intArr = new ArrayList<>();
//		intArr.add("str");    
//		intArr.add(0.2f);  
		intArr.add(10); // 여긴 객체 타입만 들어갈 수 있는데, int가 Integer로 박싱(업캐스팅)이 되었다.

		int i = intArr.get(0); // 객체로 되었던 10이, int 타입으로 언박싱 되었다.
		System.out.println(i);

		ArrayList list = new ArrayList(); // 아무 타입이나 다 담을 수 있다. (그러나 이건 예전 스타일 : raw type)
		list.add(10);
		list.add(10.0);
		list.add("Hello");
		list.add(new Beverage());

		System.out.println(list);

		// 담을 땐 문제 없지만, 그러나 꺼낼 때가 문제다.
		Integer i2 = (Integer) list.get(3); // 원래 객체타입인데, Integer 타입으로 형변환 하라고? Error

	}

}

class Cup<T> {
	private T beverage;

	public T getBeverage() {
		return beverage;
	}

	public void setBeverage(T beverage) {
		this.beverage = beverage;
	}
}

class Beverage {

}

class Beer extends Beverage {
	void drink() {
		System.out.println("맥주를 마신다.");
	}
}

class Boricha extends Beverage {
	void eat() {
		System.out.println("보리차를 마신다.");

	}
}
