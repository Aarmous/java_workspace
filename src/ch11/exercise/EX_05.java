package ch11.exercise;

import java.util.HashMap;
import java.util.Map;

public class EX_05 {

	public static void main(String[] args) {
		Map<String, String> map = Map.of("호랑이", "tiger", "표범", "leopard", "사자", "lion");
		Map<String, String> animals = new HashMap<>(map);

		System.out.println(map);
		System.out.println(animals);
		System.out.println();

		animals.forEach((x, y) -> System.out.println(x + " : " + y));

		System.out.println(animals);

//		animals.replaceAll(null);

	}

}
