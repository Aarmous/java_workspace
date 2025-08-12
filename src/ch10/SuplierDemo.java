package ch10;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SuplierDemo {

	public static void main(String[] args) {
		Supplier<String> s = () -> new String("hello");
		System.out.println(s.get());

		System.out.println();
		DoubleSupplier ds = () -> Math.random();
		System.out.println(ds.getAsDouble());

		System.out.println();
		IntSupplier is = () -> (int) (Math.random() * 10);
		System.out.println(is.getAsInt());

	}

}
