package ch12;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		Integer i = null;
		Optional<Integer> e = Optional.empty();
		System.out.println(e);
		System.out.println(e.isEmpty());
		System.out.println();

		Optional<Integer> of = Optional.of(3);
		System.out.println(of);
		System.out.println(of.get());
		System.out.println();

		Optional<Integer> ofNullable = Optional.ofNullable(i);
		System.out.println(ofNullable);

		i = 10;
		ofNullable = Optional.ofNullable(i);
		System.out.println(ofNullable);
	}

}
