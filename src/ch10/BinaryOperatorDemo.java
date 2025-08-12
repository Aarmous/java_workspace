package ch10;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BinaryOperatorDemo {

	public static void main(String[] args) {
		BinaryOperator<Integer> o1 = (x, y) -> Math.min(x, y);
		System.out.println(o1.apply(3, 10));

		System.out.println();
		UnaryOperator<Integer> o2 = x -> Math.abs(x);
		System.out.println(o2.apply(-10));

	}

}
