package ch10;

import java.util.ArrayList;

public class CollectionFrameworkDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("");
		list.add("banana");
		list.add("cherry");

		list.forEach((s) -> System.out.println(s)); // Consumer 인터페이스의 구현체를 람다식으로 작성

		list.removeIf((s) -> s.length() == 0); // Predicate 인터페이스의 구현체를 람다식으로 작성
		list.forEach((s) -> System.out.println(s)); // 빈칸이었던 2번째가 지워지고, 애플 바나나 체리가 차례대로 출력된다.

		// [문제] ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// 숫자를 원소로 가지는 ArrayList 작성. 원소 4개 추가(2개 양, 2개 음)
		// 리스트에서 음수값은 삭제, 양수 전부를 출력

		ArrayList<Integer> iArr = new ArrayList<>();
		iArr.add(7);
		iArr.add(9);
		iArr.add(-5);
		iArr.add(-8);

		System.out.println(iArr.toString());

		iArr.removeIf(i -> i < 0);
		System.out.println(iArr.toString());
		iArr.forEach(i -> System.out.println(i));
		System.out.println();

		// [문제] ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// 객체(삼각형)을 원소로 가지는 ArrayList 작성.
		// 원소 3개 추가. 밑변과 높이가 3~~~ 인 객체.
		// 넓이가 20보다 작은 것은 삭제. 남은 원소 전부 출력.

		ArrayList<Tri> tArr = new ArrayList<>();
		tArr.add(new Tri(3, 6));
		tArr.add(new Tri(6, 7));
		tArr.add(new Tri(5, 5));

		tArr.forEach(d -> System.out.println(d));
		tArr.removeIf(d -> d.area < 20);
		System.out.println();
		tArr.forEach(d -> System.out.println(d));

	}

}

class Tri {
	int line;
	int height;
	double area;

	public Tri(int line, int height) {
		this.line = line;
		this.height = height;
		this.area = line * height / 2.0;
	}

	@Override
	public String toString() {
		return "Tri[area=" + area + "]";
	}
}
