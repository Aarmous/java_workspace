package ch07.exercise;

public class EX_3_1 {

	public static void main(String[] args) {
		Line l1 = new Line(10);
		Line l2 = new Line(20);

		System.out.println(l1);

		int result = l1.compareTo(l2);
		if (result > 0) {
			System.out.println(l1 + " 이 더 깁니다.");
		} else if (result < 0) {
			System.out.println(l2 + " 이 더 깁니다.");
		} else {
			System.out.println(l1 + " 과" + l2 + " 길이가 같습니다.");
		}

		System.out.println(l1.toString());
		System.out.println(l1);
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
