package Chapter05;

import java.util.Arrays;

public class FindMaxMinDemo {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 1, 4, 2 };

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		System.out.println(max);

		int min = arr[0];
		for (int j = 1; j < arr.length; j++) {
			if (min > arr[j]) {
				min = arr[j];
			}
		}

		System.out.println(min);
		System.out.println("가장 큰 값은 " + max + " , 가장 작은 값은 " + min);
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("가장 큰 값은 " + arr[arr.length - 1] + " , 가장 작은 값은 " + arr[0]);

	}

}
