package ch10;

import java.util.ArrayList;
import java.util.Collections;

public class SortLambdaDemo {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(5);
		arr.add(3);
		arr.add(7);

		Collections.sort(arr);

		System.out.println(arr); // 오름차순으로 출력

		// 내림차순으로 정렬하려면 두번째 매게변수인 Comparable FI를 구현해야 한다.
		// 숫자끼리 비교이기 때문에 (-) 연산자를 사용해서 구현

		Collections.sort(arr, (o1, o2) -> o2 - o1);

//		Collections.sort(arr, new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				return o2 - o1;
//			}
//			
//		};
		System.out.println(arr); // 내림차순으로 출력

		ArrayList<String> sArr = new ArrayList<>();
		sArr.add("c");
		sArr.add("a");
		sArr.add("d");

		Collections.sort(sArr); // 알파벳 오름차순으로 출력
		System.out.println(sArr);

		// 내림차순으로 문자열을 정렬하려면, 두번째 매게변수인 Comparable FI를 구현해야 한다.
		// 문자열끼리 비교하려면 ???

		Collections.sort(sArr, (o1, o2) -> o2.compareTo(o1));
		// 위에식이 람다식
//		Collections.sort(sArr, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o2.compareTo(o1);
//			}
//
//		});
		System.out.println(sArr); // 알파벳 내림차순으로 출력

		// Line 객체를 담고 있는 ArrayList 라면 어떻게 비교하지 ???

		Line l1 = new Line(10);
		Line l2 = new Line(7);

		System.out.println(l1.compareTo(l2));
		System.out.println(l2.compareTo(l1));

	}

}

class Line implements Comparable<Line> {
	int length;

	public Line(int length) {
		this.length = length;
	}

	@Override
	public int compareTo(Line line) {
		return this.length - line.length;
	}

	@Override
	public String toString() {
		return "Line[lenth=" + length + "]";
	}
}
