package ch11;

import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Map<String, Integer> fruits = Map.of("사과", 5, "바나나", 2, "포도", 10);

//		fruits.put("딸기", 5);  // 불변이라 추가 안됨 
//		fruits.put("사과", 5);  // 불변이라 수정 안됨
		System.out.println(fruits.size());
		System.out.println(fruits.keySet()); // key만 꺼내와서 출력해
		System.out.println(fruits.values());

		System.out.println();
		System.out.println(fruits.containsKey("사과"));

		System.out.println();
		fruits.forEach((x, y) -> System.out.println(x + " : " + y));

	}

}
