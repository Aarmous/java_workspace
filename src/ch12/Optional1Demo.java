package ch12;

import java.util.OptionalDouble;

public class Optional1Demo {

	public static void main(String[] args) {
		OptionalDouble d = divide(3.0, 3.0);
		System.out.println(d);
		System.out.println();

		OptionalDouble d1 = divide(3.0, 0);
		System.out.println(d1);

	}

	public static OptionalDouble divide(double x, double y) {
		return y == 0 ? OptionalDouble.empty() : OptionalDouble.of(x / y);
	}
}
