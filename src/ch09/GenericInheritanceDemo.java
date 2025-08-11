package ch09;

import java.util.ArrayList;

public class GenericInheritanceDemo {

	public static void main(String[] args) {
		ArrayList<Beverage> list1 = new ArrayList<>();
		list1.add(new Beverage());
		list1.add(new Beer());
		list1.add(new Boricha());

		beverageTest(list1);

		ArrayList<Beer> list2 = new ArrayList<>();
		list2.add(new Beer());
//		list2.add(new Beverage());
//		list2.add(new Boricha());
//
//		beverageTest(list2); 
		// Beverage와 Beer가 상속관계이지만, 그 타입으로 만든 배열끼리는 상속관계가 되지 않는다. 별개다.

	}

	public static void beverageTest(ArrayList<Beverage> list) {
		System.out.println(list);
	}

}
