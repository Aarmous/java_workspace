package ch10;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> c1 = x -> System.out.println(x.toLowerCase());
		c1.accept("Hello, Java!");

		System.out.println();
		BiConsumer<String, String> bc = (x, y) -> System.out.println(x + " : " + y);
		bc.accept("Hello", "Java");

		System.out.println();
		IntConsumer c2 = i -> System.out.println(i * 2);
		c2.accept(10);

		System.out.println();
		ObjIntConsumer<String> oc = (s, i) -> System.out.println(s + " : " + i);
		oc.accept("hello", 3);

	}

}
