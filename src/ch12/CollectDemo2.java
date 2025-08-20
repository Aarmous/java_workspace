package ch12;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo2 {

	public static void main(String[] args) {
		System.out.println("Stream => List : collect(Collectors.toList())");
		Stream<Nation> ns = Nation.nations.stream();

		Stream<String> map = ns.map(n -> n.getName());
		Stream<String> limit = map.limit(3);
		List<String> collect = limit.collect(Collectors.toList());
		System.out.println(collect);
		System.out.println("-------------------------\n");

		System.out.println("Stream => Set : collect(Collectors.toSet())");
		ns = Nation.nations.stream();
		Set<String> collect2 = ns.map(Nation::getName).limit(3).collect(Collectors.toSet());
		System.out.println(collect2);
		System.out.println("-------------------------\n");

		System.out.println("Stream => Map : collect(Collectors.toMap(K, V))");
		ns = Nation.nations.stream();
		Map<String, Double> collect3 = ns.filter(Nation::isIsland)
				.collect(Collectors.toMap(Nation::getName, Nation::getPopulation));
		System.out.println(collect3);
		System.out.println("-------------------------\n");

	}
}
