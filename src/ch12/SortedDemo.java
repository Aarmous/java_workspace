package ch12;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortedDemo {

	public static void main(String[] args) {
//		문자열을 스트림으로 변환하고, 그 문자열을 정렬해서 출력 
		Stream.of("d", "e", "a", "c", "b").sorted().forEach(Util::print);
		System.out.println("\n-----");

//		숫자를 스트림으로 변환하고, 숫자를 정렬해서 출력
		Stream.of(3, 5, 1, 7, 9).sorted().forEach(Util::print);
		System.out.println("\n-----");

//		숫자를 스트림으로 변환하고, 숫자를 역정렬해서 출력
		Stream.of(3, 5, 1, 7, 9).sorted(Comparator.reverseOrder()).forEach(Util::print);
//	??	Stream.of(3, 5, 1, 7, 9).sorted((o1, o2 -> o2 - o1).forEach(System.out::println);
		System.out.println("\n-----");

//		국가 이름 순서대로 출력 
		System.out.println("국가 이름 순서대로 출력");
		Stream<Nation> s = Nation.nations.stream();
		s.sorted(Comparator.comparing(Nation::getName)).forEach(Util::printWithParenthesis);
		System.out.println("\n-----");

//		국가 이름 역순으로 출력 
		System.out.println("국가 이름 역순으로 출력");
		Nation.nations.stream().sorted(Comparator.comparing(Nation::getName).reversed())
				.forEach(Util::printWithParenthesis);
		System.out.println("\n-----");

//		국가 GDP Rank 높은 순서대로 출력 
		System.out.println("국가 GDP Rank 높은 순서대로 출력");
		Stream<Nation> s1 = Nation.nations.stream();
		s1.sorted(Comparator.comparingInt(Nation::getGdpRank)).forEach(Util::printWithParenthesis);
		System.out.println("\n-----");

//		국가 인구 적은 순서대로 출력 
		System.out.println("국가 인구 적은 순서대로 출력");
		Nation.nations.stream().sorted(Comparator.comparingDouble(Nation::getPopulation))
				.forEach(Util::printWithParenthesis);
		System.out.println("\n-----");

//		국가 인구 많은 순서대로 출력 
		System.out.println("국가 인구 많은 순서대로 출력");
		Nation.nations.stream().sorted(Comparator.comparingDouble(Nation::getPopulation).reversed())
				.forEach(Util::printWithParenthesis);

	}

}
