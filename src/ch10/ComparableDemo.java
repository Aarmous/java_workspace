package ch10;

import java.util.Arrays;

public class ComparableDemo {

	public static void main(String[] args) {
		RectAgle[] rectAgles = { new RectAgle(3, 5), new RectAgle(2, 10), new RectAgle(5, 7) };

		Arrays.sort(rectAgles); // 넓이 오름차순으로 정렬함 (compareTo)

		System.out.println(Arrays.toString(rectAgles)); // 넓이 오름차순으로 정렬

		/*
		 * Arrays.sort(rectAgles, new Comparator<RectAgle>() {
		 * 
		 * @Override public int compare(RectAgle o1, RectAgle o2) { return o2.height -
		 * o1.height; }
		 * 
		 * });
		 */
		// 위에 식을 밑에 람다식으로 변형. 같은 식임
		Arrays.sort(rectAgles, (o1, o2) -> o2.height - o1.height); // 람다식

		System.out.println(Arrays.toString(rectAgles)); // 높이 오름차순으로 정렬

	}

}

class RectAgle implements Comparable<RectAgle> {
	int width, height;

	public RectAgle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int findArea() {
		return width * height;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("사각형(폭=%d, 높이=%d)", width, height);
	}

	@Override
	public int compareTo(RectAgle o) {
		return this.findArea() - o.findArea();
	}
}
