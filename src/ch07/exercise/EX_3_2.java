package ch07.exercise;

public class EX_3_2 {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(1, 2);
		Triangle t2 = new Triangle(1, 3);

		int result = t1.compareTo(t2);
//		if (result > 0) {
//			System.out.printf("삼각형 [width=%d, height=%d, 넓이=%.1f] 이 더 큽니다.", t1.width, t1.height, t1.area);
//		} else if (result < 0) {
//			System.out.printf("삼각형 [width=%d, height=%d, 넓이=%.1f] 이 더 큽니다.", t2.width, t2.height, t2.area);
//		} else {
//			System.out.printf("두 삼각형이 같습니다. [width=%d, height=%d, 넓이=%.1f]", t1.width, t1.height, t1.area);
//		}

		if (result > 0) {
			System.out.println(t1 + " 이 더 큽니다.");
		} else if (result < 0) {
			System.out.println(t2 + " 이 더 큽니다.");
		} else {
			System.out.println("두 " + t2 + " 이 같습니다.");
		}

//		System.out.println(t1);
//		System.out.println(t1.toString());
//		System.out.println(t1.width);

	}

}

class Triangle implements Comparable {
	int width = 0;
	int height = 0;
	double area = 0;

	public Triangle(int width, int height) {
		if (width > 0 && height > 0) {
			this.width = width;
			this.height = height;
			this.tArea();
		}
	}

	// 밑에 tArea 로 개선!
//	public double tArea() {
//		double area = (width * height) / 2.0;
//		return this.area = area;
//	}

	public void tArea() {
		this.area = (width * height) / 2.0;
	}

	@Override
	public int compareTo(Object o) { // 여기가 문제!
		if (o instanceof Triangle tri) {
			return (int) (this.area - tri.area);
		}
		return 0;
	}

	@Override
	public String toString() {
		return String.format("삼각형 [width=%d, height=%d, 넓이=%.1f]", width, height, area);
	}

}
