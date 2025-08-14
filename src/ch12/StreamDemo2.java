package ch12;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {
		int[] ia = { 1, 2, 3, 4, 5 };
		IntStream is = Arrays.stream(ia);
		IntStream ils = IntStream.of(ia);

		System.out.println();
		String[] sa = { "a", "b", "c", "d", "e" };
		Stream<String> ss = Stream.of(sa);

		System.out.println();
		double[] da = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		DoubleStream ds = DoubleStream.of(da);

		System.out.println();
		Random r = new Random(); // 로또 번호 추출기
		IntStream ints = r.ints(1, 45);
		ints.limit(6).forEach(n -> System.out.println(n));

		System.out.println();
		IntStream iterate = IntStream.iterate(1, i -> i + 2);
		iterate.limit(3).forEach(n -> System.out.println(n));

		System.out.println();
		IntStream range = IntStream.range(1, 10);
		range.forEach(n -> System.out.println(n));
	}

}
