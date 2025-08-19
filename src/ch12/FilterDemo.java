package ch12;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		System.out.println("c로 시작하는 녀석들만 출력 : ");
		Stream<String> of = Stream.of("a1", "b1", "c1", "c2", "c3");
		Stream<String> filterOf = of.filter(s -> s.startsWith("c"));
		filterOf.forEach(Util::print);
		System.out.println("\n--------");

		System.out.println("c로 시작하는 녀석들 중, 세번째부터 출력 : ");
		Stream.of("a1", "b1", "c1", "c2", "c3").filter(s -> s.startsWith("c")).skip(2).forEach(Util::print);
		System.out.println("\n--------");

		System.out.println("숫자 배열 중, 짝수만 골라내어 중복 없이 출력 : ");
		IntStream intOf = IntStream.of(1, 2, 2, 3, 4, 4, 5, 6, 7);
		IntStream filterIntOf = intOf.filter(n -> n % 2 == 0); // 짝수만 골라내!
		IntStream distinct = filterIntOf.distinct();
		distinct.forEach(Util::printWithParenthesis);
		System.out.println("\n--------");

		System.out.println("인구가 1억 이상인 2개의 나라 : "); // 원래는 미국 중국 필리핀 세개인데, 두개만 출력해라!
//		List<Nation> nations = Nation.nations();
		Stream<Nation> nations = Nation.nations.stream();
		Stream<Nation> nationFilter = nations.filter(n -> n.getPopulation() > 100.0);
		nationFilter.limit(2).forEach(Util::printWithParenthesis); // 세번째 필리핀을 제외한 미국,중국이 출력

	}

}
