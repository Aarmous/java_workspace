package ch04;

public class CircleDemo {

	public static void main(String[] args) {
		Circle myCircle = new Circle();
		myCircle.setRadius(10);
		System.out.println("원의 반지금은 " + myCircle.getRadius());
		System.out.println("원의 넓이는 " + myCircle.findArea());

		Circle c1 = new Circle(2);
		System.out.println("원의 반지금은 " + c1.getRadius());
		System.out.println("원의 넓이는 " + c1.findArea());

	}

}

//class Circle { 
//	double radius;  // 0.0
//	double findArea() {
//	return 3.14 * radius * radius;  // this.radios 로 해도 된다. 
//	}
//}

//class Circle {
//	private double radius;
//
//	public double getRadius() {
//		return radius;
//	}
//
//	public void setRadius(double r) {
//		if (r <= 0) {
//			System.out.println("원의 반지름은 0보다 커야 합니다.");
//			return;
//		}
//		this.radius = r; // this 생략가능
//	}
//
//	public double findArea() {
//		return 3.14 * radius * radius;
//	}
//}

class Circle {
	// 멤버(필드)
	private double radius;

	// 생성자 - 이게 기본생성자여서, 없어지게 되면, 위에 new에서 Error가 뜬다.
	public Circle() {

	}

	// 생성자 오버로딩
	public Circle(double r) {
		if (r > 0) {
			this.radius = r;
		}
	}

	// Getter
	public double getRadius() {
		return radius;
	}

	// Setter

	public void setRadius(double r) {
		if (r <= 0) {
			System.out.println("원의 반지름은 0보다 커야 합니다.");
			return;
		}
		this.radius = r; // this 생략가능
	}

	// 멤버(메서드)

	public double findArea() {
		return 3.14 * radius * radius;
	}
}
