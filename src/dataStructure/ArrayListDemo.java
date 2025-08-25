package dataStructure;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.remove(0);

		System.out.println(list.get(0));

		list.add(10);

		System.out.println(list.get(0));

		list.add(20);
		list.add(30);
		list.add(40);

		System.out.println(list);

		list.add(1, 50);
		System.out.println(list);

		list.remove(2);
		System.out.println(list);

		System.out.println(list.get(3));
	}

}