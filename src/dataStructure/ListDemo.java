package dataStructure;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(); // 동적 배열
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println(numbers.size());
		numbers.add(4);
		numbers.add(5);

		System.out.println(numbers);

		numbers.remove(3); // 3번 인덱스에 있는 내용(4)을 지운다.
		System.out.println(numbers);

		LinkedList<Integer> numbers2 = new LinkedList<>();
		numbers2.add(10);
		numbers2.add(20);
		numbers2.add(30);
		System.out.println(numbers2.size());
		numbers2.add(40);
		numbers2.add(50);

		System.out.println(numbers2);

		numbers2.remove(3);
		numbers2.remove(new Integer(10));
		System.out.println(numbers2);

	}

}
