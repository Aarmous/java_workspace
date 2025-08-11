package ch09;

public class GenericMethod2 {

	public static void main(String[] args) {
		Integer[] iArr = { 1, 2, 3, 4, 5 };
		showArray(iArr);

		Double[] dArr = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		showArray(dArr);

		Character[] cArr = { 'a', 'b', 'c' };
//		showArray(cArr);  // Character는 Number의 자녀가 아니기에, 불가능 

	}

	public static <T extends Number> void showArray(T[] arr) {
		for (T t : arr) {
			System.out.println(t);
		}
	}

}
