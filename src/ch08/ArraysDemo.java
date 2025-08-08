package ch08;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		String[] sArr = { "케이크", "애플", "도넛", "바나나" };
		Integer[] iArr = { 3, 4, 1, 7 };
		// Integer 가 int일 때는 밑에 print 메소드에서 Object를 받기에 에러가 난다.
		// 그래서 int를 Integer로 바꿔줘서, 자동 Wrapper클래스로 바꿔주기에,
		// int가 Object가 되어서, print 메소드가 잘 작동된다.

		Character[] cArr = { 'j', 'a', 'v', 'a' };

		print(sArr);
		print(iArr);

		Arrays.sort(sArr);
		print(sArr);

		System.out.println(Arrays.binarySearch(sArr, "애플"));
	}

	static void print(Object[] oArr) {
		System.out.print("[");
		for (Object object : oArr) {
			System.out.print(object + " ");
		}
		System.out.println("]");
	}

}
