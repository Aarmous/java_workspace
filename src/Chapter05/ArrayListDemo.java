package Chapter05;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.println(arr.size());

		arr.add(10);
		System.out.println(arr.size());

		arr.add(20);
		System.out.println(arr.size());

		System.out.println(arr);

	}

}
