package ch12;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceDemo {

	public static void main(String[] args) {
		System.out.println("숫자열 1,2,3,4 의 합은 : ");
		List<Integer> list = List.of(1, 2, 3, 4);
		Stream<Integer> stream = list.stream();
		Integer reduce = stream.reduce(0, (x, y) -> x + y);
		System.out.println(reduce);
		System.out.println("-----------\n");

		System.out.println("숫자열 1,2,3,4 의 합은 : (Integer 메소드 활용)");
		stream = list.stream();
		Integer reduce0 = stream.reduce(0, Integer::sum);
		System.out.println(reduce0);
		System.out.println("-----------\n");

		System.out.println("숫자열 1,2,3,4 의 곱은 : ");
		stream = list.stream();
		Integer reduce2 = stream.reduce(1, (a, b) -> a * b);
		System.out.println(reduce2);
		System.out.println("-----------\n");

		System.out.println("숫자열 1,2,3,4 의 곱은 : (reduce Optional 활용)");
		stream = list.stream();
		Optional<Integer> reduce3 = stream.reduce((a, b) -> a * b);
		System.out.println(reduce3.get());
		System.out.println("-----------\n");

	}

}
