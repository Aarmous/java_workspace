package ch11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<String> list = List.of("그랜저", "소나타", "아반떼", "제네시스", "소울");

		List<String> car1 = new ArrayList<>(list);
		car1.add("싼타페");
		System.out.println(car1);

		System.out.println();
		List<String> car2 = new ArrayList<>(list);
		car2.remove("제네시스");
		System.out.println(car2);

		System.out.println();
		System.out.println(car1.containsAll(car2)); // car2에 있는 게, car1에 다 있어? true

		System.out.println();
		car1.removeIf(c -> c.startsWith("소")); // "소"로 시작하는 건 다 지워
		System.out.println(car1);

		System.out.println();
		car1.replaceAll(c -> "New " + c); // "New"를 모든 원소에 다 추가해
		System.out.println(car1);

		System.out.println();
		car1.forEach(c -> System.out.println(c));

		System.out.println();
		car1.clear();
		System.out.println(car1);
		System.out.println(car1.isEmpty()); // car1이 비었어? 응, 비었어.

	}

}
