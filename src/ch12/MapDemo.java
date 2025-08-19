package ch12;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapDemo {

	public static void main(String[] args) {
		Stream<String> s1 = Stream.of("a1", "b1", "c1", "c2", "c3");
		Stream<String> map = s1.map(s -> s.toUpperCase());
		map.forEach(Util::print);
		System.out.println();
		System.out.println();

		Stream<Integer> intOf = Stream.of(1, 2, 2, 3, 4, 4, 5, 6, 7);
		Stream<Integer> map2 = intOf.map(n -> n * 2);
		map2.forEach(Util::print);
		System.out.println();
		System.out.println();

//		s1.forEach(Util::print); // Stream은 일회성이라, 한 번 흐르고 끝났으니, 여기서 또 하라 그러면 Error
		s1 = Stream.of("a1", "b1", "c1", "c2", "c3");
		Stream<String> num = s1.map(s -> s.substring(1)); // 원소의 인덱스 1만 취하겠다. (두번째 자리의 것만 취하겠다.)
		IntStream i = num.mapToInt(n -> Integer.parseInt(n)); // 위에서 짜른 숫자들을 int로 반환받기
		i.forEach(Util::print);

	}

}
