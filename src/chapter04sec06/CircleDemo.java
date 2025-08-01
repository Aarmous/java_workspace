package chapter04sec06;

public class CircleDemo {
// 생성자 오버로딩
	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.info();
		Circle c2 = new Circle(10.0);
		c2.info();
		Circle c3 = new Circle("빨강");
		c3.info();
		Circle c4 = new Circle(10.0, "파랑");
		c4.info();
	}

}

class Circle {
	double radius;
	String color;

	public Circle() {
//		this(1.0, "노랑");     생성자를 다른 코드보다 가장 먼저 써야 한다. 뒤에 쓰면 Error
		this.radius = 1.0;
		this.color = "노랑"; // this(1.0, "노랑"); 과 똑같다.

	}

	public Circle(double radius) {
//		this.radius = radius;
		this(radius, "노랑"); // 콘솔에 null을 없애는 방법
	}

	public Circle(String color) {
//		this.color = color;
		this(1.0, color);
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public void info() {
		System.out.printf("원의 반지름은 %.1f 이고 색깔은 %s 입니다. \n", radius, color);
	}
}