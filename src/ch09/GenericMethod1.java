package ch09;

public class GenericMethod1 {

	public static void main(String[] args) {
		Integer[] iArr = { 1, 2, 3, 4, 5 };
		String[] sArr = { "a", "b", "c" };

		test(iArr); // 1 2 3 4 5 출력
		System.out.println(getLast(iArr)); // 5 출력

		test(sArr); // a b c 출력
		System.out.println(getLast(sArr)); // c 출력

	}

	public static <T> void test(T[] arr) {
		for (T t : arr) {
			System.out.println(t);
		}

	}

	public static <T> T getLast(T[] arr) {
		return arr[arr.length - 1];
	}

}
