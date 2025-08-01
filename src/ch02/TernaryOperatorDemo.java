package ch02;

public class TernaryOperatorDemo {

	public static void main(String[] args) {

//		< 조건연산자 >
//		int x = 1, y;
//
//		y = (x == 1) ? 10 : (5 / 0); // 쇼트서킷이 되어 (5/0)은 계산되지 않는다.
//
//		System.out.println(y);

		int a = 3, b = 3, c = 3;
		System.out.println(c);
		c = a * b / c % 2;
		System.out.println(c);
		c = a++ + --b * a; // 11 = 3 + 2 * 4
		System.out.println(c);

	}

}
