package ch12;

import java.util.stream.IntStream;

public class LazyDemo {

	public static void main(String[] args) {
		IntStream is = IntStream.rangeClosed(1, 5); // 1,2,3,4,5 를 흘려보내기 위해 준비

		is.filter(x -> { // 1단계 : 짝수만 살리고 홀수 거르기
			System.out.println("filter " + x);
			return x % 2 == 0;
		}) // (filter) Predicate 를 구현체로 넣기
				.map(x -> { // 흘러온 짝수를 제곱 시키기
					System.out.println("map " + x);
					return x * x;
				}) // (map) IntUnaryOperator 를 구현체로 넣기
				.forEach(x -> System.out.println("foreach " + x)); // (foreach) Consumer 를 구현체로 넣기
	} // 1 / 2 2 4 / 3 / 4 4 16 / 5 를 출력

}
