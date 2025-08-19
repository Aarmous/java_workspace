package ch12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Map3Demo {

	public static void main(String[] args) {
		List<String> list1 = List.of("안녕, 자바!", "잘 가, C++!");
		Stream<String> s1 = list1.stream();
		String[] split = "안녕, 자바!".split(" ");
		Stream<String> s2 = Arrays.stream(split);
		s2.forEach(Util::print);

	}

}
