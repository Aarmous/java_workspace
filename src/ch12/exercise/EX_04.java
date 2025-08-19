package ch12.exercise;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class EX_04 {

	public static void main(String[] args) {

//		6개의 수도("서울", "워싱턴", "베이징", "파리", "마드리드", "런던")를 포함하는 List
//		객체를 사용하여 다음을 수행하는 프로그램을 작성하라.
//
//		1) 스트림을 생성한다.
//		2) 스트림 원소를 정렬한다.
//		3) 첫 번째 원소를 찾아 출력한다.

		List<String> list = List.of("서울", "워싱턴", "베이징", "파리", "마드리드", "런던");
		Stream<String> stream = list.stream();
		Optional<String> first = stream.sorted().findFirst();
		System.out.println(first.get()); // 출력 : 런던

	}

}
