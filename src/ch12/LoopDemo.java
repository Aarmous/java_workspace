package ch12;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class LoopDemo {

	public static void main(String[] args) {
		Nation.nations.stream().peek(Util::printWithParenthesis).filter(n -> n.isIsland())
				.forEach(Util::printWithParenthesis);
		System.out.println("\n-----------\n");

		// 숫자열의 최소값
		System.out.println("숫자열의 최소값 : ");
		IntStream is = IntStream.of(1, 2, 3, 4, 5);
		OptionalInt min = is.min();
		System.out.println(min.getAsInt());
		System.out.println("-----------\n");

		// 숫자열의 최대값
		System.out.println("숫자열의 최대값 : ");
		is = IntStream.of(1, 2, 3, 4, 5);
		OptionalInt max = is.max();
		System.out.println(max.getAsInt());
		System.out.println("-----------\n");

		// 숫자열의 평균값
		System.out.println("숫자열의 평균값 : ");
		is = IntStream.of(1, 2, 3, 4, 5);
		OptionalDouble avg = is.average();
		System.out.println(avg.getAsDouble());
		System.out.println("-----------\n");

		// 숫자열의 합계
		System.out.println("숫자열의 합계 : ");
		is = IntStream.of(1, 2, 3, 4, 5);
		int sum = is.sum();
		System.out.println(sum);
		System.out.println("-----------\n");

//	??	// 숫자열의 갯수
		System.out.println("숫자열의 갯수 : ");
		is = IntStream.of(1, 2, 3, 4, 5);
		long count = is.count();
		System.out.println(count);

	}

}
