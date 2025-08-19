package ch12;

import java.util.stream.Stream;

public class Map2Demo {

	public static void main(String[] args) {
//		Nation.nations 리스트를 스트림으로 생성한 후
//		나라이름만을 가지고 스트림으로 변환하고 
//		그 중 4개의 나라이름만 ( ) 로 감싸서 출력 
		System.out.println("나라이름만 뽑아서 출력");
		Nation.nations.stream().map(Nation::getName).forEach(Util::printWithParenthesis);
		System.out.println("\n-----");

//		Nation.nations 리스트를 스트림으로 생성한 후
//		각 나라의 인구 수만을 가지고 스트림으로 변환하고 
//		인구수를 (  ) 로 감싸서 출력하기 
		System.out.println("인구 수만 뽑아서 출력");
		Stream<Nation> nationsStream = Nation.nations.stream();
		Stream<Double> mapqq = nationsStream.map(n -> n.getPopulation());
		mapqq.forEach(t -> Util.printWithParenthesis(t)); // Util::printWithParenthesis
		System.out.println("\n-----");

//		Nation.nations 리스트를 스트림으로 생성한 후
//		각 나라의 GdpRank 만을 가지고 스트림으로 변환하고 
//		GdpRank 를  ( ) 로 감싸서 출력 
		System.out.println("GdpRank만 뽑아서 출력");
		Nation.nations.stream().map(Nation::getGdpRank).forEach(Util::printWithParenthesis);
		System.out.println("\n-----");
	}

}
