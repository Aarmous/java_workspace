package ch07.exercise;

public class EX_3_1 {

	public static void main(String[] args) {
		Line l1 = new Line(10);
		Line l2 = new Line(10);

		System.out.println(l1); // 원래는 객체 주소가 출력되어야 하는데, 맨 밑에 toString 메소드에 의해, 객체의 값(반지름)이 출력된다.

		int result = l1.compareTo(l2);
		if (result > 0) {
			System.out.println(l1 + " 이 더 깁니다.");
		} else if (result < 0) {
			System.out.println(l2 + " 이 더 깁니다.");
		} else {
			System.out.println(l1 + " 과 " + l2 + " 길이가 같습니다.");
		}
//		if (result > 0) {
//			System.out.printf("Line [length = %d] 이 더 깁니다.", l1.length);
//		} else if (result < 0) {
//			System.out.printf("Line [length = %d] 이 더 깁니다.", l2.length);
//		} else {
//			System.out.printf("Line [length = %d] 과 Line [length = %d] 길이가 같습니다.", l1.length, l2.length);
//		}
	}

}

class Line implements Comparable {
	int length;

	public Line(int length) {
		this.length = length;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Line line) {
			return this.length == line.length;
		}
		return false;
	}

	@Override
	public int compareTo(Object obj) {
		if (obj instanceof Line line) {
			return this.length - line.length;
		}
		return 0;
	}

	@Override
	public String toString() {
		return String.format("Line [length = %d]", length);
	}
}
