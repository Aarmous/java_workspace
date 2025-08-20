package ch12;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import ch12.Nation.Type;

public class GroupByDemo {

	public static void main(String[] args) {
		System.out.println("Stream => Map : groupingBy(K)");
		System.out.println("Stream의 내용물들을 어떤 기준점으로 Map에 저장하는 방법");
		Stream<Nation> ns = Nation.nations.stream();
		Map<Type, List<Nation>> collect = ns.collect(Collectors.groupingBy(Nation::getType));
		System.out.println(collect);
		System.out.println("섬나라=... , 대륙=...");
		System.out.println("-------------------------\n");

		System.out.println("Stream => Map : groupingBy(K, V)");
		ns = Nation.nations.stream();
		Map<Type, Long> collect2 = ns.collect(Collectors.groupingBy(Nation::getType, Collectors.counting()));
		System.out.println(collect2);
		System.out.println("섬나라=4개 , 대륙=개");
		System.out.println("-------------------------\n");

		System.out.println("Stream => Map : partitioningBy(K)");
		ns = Nation.nations.stream();
		Map<Boolean, List<Nation>> collect3 = ns
				.collect(Collectors.partitioningBy(n -> n.getType() == Nation.Type.LAND));
		System.out.println(collect3);
		System.out.println("거짓(대륙 아닌거)=... , 사실(대륙인 거)=...");
		System.out.println("-------------------------\n");

		System.out.println("Stream => Map : partitioningBy(K, V)");
		ns = Nation.nations.stream();
		Map<Boolean, Long> collect4 = ns
				.collect(Collectors.partitioningBy(n -> n.getType() == Nation.Type.LAND, Collectors.counting()));
		System.out.println(collect4);
		System.out.println("거짓(대륙 아닌거)=4개 , 사실(대륙인 거)=개");
		System.out.println("-------------------------\n");

	}

}
