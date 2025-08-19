package ch12;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MatchDemo {

	public static void main(String[] args) {
		System.out.println("문자열 중, c로 시작하는 게 하나라도 있는가? ");
		boolean anyMatch = Stream.of("a1", "b1", "c1").anyMatch(s -> s.startsWith("c"));
		System.out.println(anyMatch);
		System.out.println("-----------\n");

		System.out.println("숫자열 원소들이 전부다 10의 배수야? ");
		boolean allMatch = IntStream.of(10, 20, 30).allMatch(n -> n % 10 == 0);
		System.out.println(allMatch);
		System.out.println("-----------\n");

		// 모든 국가의 인구수가 1억이 넘는다. ==> allMatch : false
		System.out.println("모든 국가의 인구수가 1억이 넘는다? ");
		Stream<Nation> ns = Nation.nations.stream();
		boolean allMatch2 = ns.allMatch(n -> n.getPopulation() > 100);
		System.out.println(allMatch2);
		System.out.println("-----------\n");

		// 모든 국가는 섬이 아니다. ==> anyMatch : true
		System.out.println("섬이 아닌 국가도 있다? ");
		Stream<Nation> ns1 = Nation.nations.stream();
		boolean allMatch22 = ns1.anyMatch(n -> n.isIsland());
		System.out.println(allMatch22);
		System.out.println("-----------\n");

		// 모든 국가의 이름은 일본이 아니다. ==> noneMatch : true
		System.out.println("모든 국가의 이름은 일본이 아니다? ");
		Stream<Nation> ns2 = Nation.nations.stream();
		boolean allMatch23 = ns2.noneMatch(n -> n.getName().equals("일본"));
		System.out.println(allMatch23);
		System.out.println("-----------\n");

		// 국가 리스트 중에서 섬인 나라 중에, 가장 처음에 찾은 나라를 출력하라.
		System.out.println("섬이 아닌 나라 중, 가장 처음 찾은 나라");
		Nation.nations.stream().filter(n -> !n.isIsland()).findFirst().ifPresentOrElse(Util::print,
				() -> System.out.println("없음"));
		System.out.println("\n-----------\n");

		// 국가 리스트 중에서 섬이 아닌 나라 중에, 아무 나라나 찾아서 출력하라.
		System.out.println("섬이 아닌 나라 중, 아무 나라");
		Nation.nations.stream().filter(n -> !n.isIsland()).findAny().ifPresentOrElse(Util::print,
				() -> System.out.println("없음"));
		System.out.println("\n-----------\n");

		// 인구수가 10억이 넘고, GDP가 1위인 나라를 찾아서 출력하라.
		System.out.println("인구수가 10억이 넘고, GDP가 1위인 나라 : ");
		Stream<Nation> filter = Nation.nations.stream()
				.filter(n -> (n.getPopulation() > 1000.0 && n.getGdpRank() == 1));
		filter.findAny().ifPresentOrElse(Util::print, () -> System.out.println("없음"));
	}

}
