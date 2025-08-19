package ch12;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo {

	public static void main(String[] args) {
		System.out.println("전체 인구의 평균 : ");
		Stream<Nation> ns = Nation.nations.stream();
		Double collect = ns.collect(Collectors.averagingDouble(n -> n.getPopulation()));
		System.out.println(collect);
		System.out.println("------------------\n");

		System.out.println("나라 개수 : ");
		ns = Nation.nations.stream();
		Long collect2 = ns.collect(Collectors.counting());
		System.out.println(collect2);
		System.out.println("------------------\n");

		// 4개 나라를 추출해서, 나라이름을 '-'로 연결해서 String 으로 반환하기 (joining)
		System.out.println("4개 나라이름을 '-'로 연결해서 String 으로 출력 : ");
		ns = Nation.nations.stream();
		String collect3 = ns.limit(4).map(Nation::getName).collect(Collectors.joining(" - "));
		System.out.println(collect3);
		System.out.println("------------------\n");

		// 4개 나라를 추출해서, 나라이름을 '+'로 연결해서 String 으로 반환하기 (mapping)
		System.out.println("4개 나라이름을 '+'로 연결해서 String 으로 출력 : ");
		ns = Nation.nations.stream();
		String collect4 = ns.limit(4).collect(Collectors.mapping(Nation::getName, Collectors.joining(" + ")));
		System.out.println(collect4);
		System.out.println("------------------\n");

		// 인구수가 가장 많은 나라의 인구수를 출력하기 (collect(Collectors.maxBy())
		System.out.println("인구수가 가장 많은 나라의 인구수를 출력 : ");
		ns = Nation.nations.stream();
		Optional<Double> collect5 = ns.map(Nation::getPopulation).collect(Collectors.maxBy(Double::compareTo));
		System.out.println(collect5.get());

	}
}
