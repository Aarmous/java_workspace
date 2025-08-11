package ch10;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class JavaFunctionalInterface {

	public static void main(String[] args) {
		Predicate<String> isEmptyStr = t -> (t != null && t.equals("")) ? true : false;

		System.out.println();

		Consumer<String> printString = s -> System.out.println(s);
		printString.accept("hello"); // hello 출력

	}

}
