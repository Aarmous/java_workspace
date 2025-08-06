package myStudy;

public class ForeachDemo {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println(arr[3]);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		for (int i : arr) {
			System.out.println(i);
		}

	}

}
