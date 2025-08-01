package chapter04sec07;

public class CircleDemo {

	public static void main(String[] args) {
		System.out.println(Circle.numOfCircles);
//		System.out.println(Circle.numCircles);   객체 생성 전이라 Error

		Circle c1 = new Circle(10.0);
		System.out.println(Circle.numOfCircles);
//		System.out.println(c1.numOfCircles); // 윗줄이랑 같은 값
		System.out.println(c1.numCircles);

		Circle c2 = new Circle(5.0);
		System.out.println(Circle.numOfCircles);
//		System.out.println(c2.numOfCircles); // 윗줄이랑 같은 값
		System.out.println(c2.numCircles);
		System.out.println(c1.radius);
	}
}

class Circle {
	// 인스턴스 변수
	double radius;
	int numCircles = 0;
	// 정적 변수(= static = class)
	static int numOfCircles = 0;

	// 생성자
	public Circle(double radius) {
		this.radius = radius;
		numCircles++;
		numOfCircles++;
	}

}
