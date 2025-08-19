package ch12.exercise;

import java.util.stream.Stream;

public class EX_02 {

	public static void main(String[] args) {

//		다음 프로그램의 실행 결과는 무엇인가?
//
//		Stream.of(“a1”, “a2”, “a3”)
//		.map(s -> s.substring(1))
//		.mapToInt(Integer::parseInt)
//		.max()
//		.ifPresent(System.out::println);

//		정답 : 3?   // 정답!

		Stream.of("a1", "a2", "a3").map(s -> s.substring(1)).mapToInt(Integer::parseInt).max()
				.ifPresent(System.out::println);
		System.out.println("------------------\n"); // 3 출력

		Stream.of("a1", "a2", "a3").map(s -> s.substring(1)).forEach(System.out::println); // 1,2,3 출력

//		map(s -> s.substring(1)) 
//		문자열 각 문자의 첫 글자를 없애고 나머지 글자만 남김. 
//		ex) a1, a2, a3 에서 
//  		map(s -> s.substring(1)) 을 실행하면, 
//  		a 를 삭제하고, 
//  		1, 2, 3 만 남겨준다. 

	}

}
