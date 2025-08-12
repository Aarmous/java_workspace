package ch10;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<Integer, Integer> f = a -> a + 10;
		System.out.println(f.apply(30));

		System.out.println();
		IntToDoubleFunction idf = x -> 2 / (double) x;
		System.out.println(idf.applyAsDouble(3));

	}

}
