package ch11;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

	public static void main(String[] args) {
		Map<Fruit, Integer> fruits = new HashMap<>();

		fruits.put(new Fruit("사과"), 3);
		fruits.put(new Fruit("바나나"), 5);
		fruits.put(new Fruit("딸기"), 10);

		fruits.put(new Fruit("사과"), 5);
		// 밑에 equals랑 hashCode를 구현하지 않으면, 새로운 사과 5를 만들고,
		// 구현하면, 기존 사과 3을 사과 5로 수정한다.

		System.out.println(fruits.size() + "개");
		System.out.println(fruits);

	}

}

class Fruit {
	String name;

	public Fruit(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj instanceof Fruit f) {
			return this.hashCode() == f.hashCode();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}
}
