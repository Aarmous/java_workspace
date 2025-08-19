package ch12;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class ReduceDemo2 {

	public static void main(String[] args) {
		// Nation 의 nations 를 스트림으로 반환
		// GDP 가 20위 이내인 나라들의 인구 총합을 구하라. (단위 : 백만명)
		System.out.println("GDP가 20위 이내 나라들의 인구 총합 : (단위 : 백만명)");
		Stream<Nation> ns = Nation.nations.stream();
		Stream<Nation> filter = ns.filter(n -> n.getGdpRank() <= 20);
		DoubleStream mapToDouble = filter.mapToDouble(n -> n.getPopulation());
		double reduce = mapToDouble.reduce(0.0, (n1, n2) -> n1 + n2);
		System.out.println(reduce);
		System.out.println("-----------\n");

		// Nation 의 nations 를 스트림으로 반환
		// 섬나라에 사는 인구 총합을 구하라. (단위 : 백만명)
		System.out.println("섬나라에 사는 인구 총합 : (단위 : 백만명)");
		ns = Nation.nations.stream();
		Stream<Nation> filter2 = ns.filter(n -> n.isIsland());
		double reduce2 = filter2.mapToDouble(n -> n.getPopulation()).reduce(0.0, (n1, n2) -> n1 + n2);
		System.out.println(reduce2);

	}

}
