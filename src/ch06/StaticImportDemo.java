package ch06;

import static java.util.Arrays.sort;

import java.util.Arrays;

public class StaticImportDemo {

	public static void main(String[] args) {

		int[] data = { 5, 3, 1, 2 };

		System.out.println(Arrays.toString(data));
		sort(data); // 위에서 import 했기 때문에, Arrays.sort(data)와 똑같다.
		System.out.println(Arrays.toString(data));
		System.out.println(data);

	}

}
