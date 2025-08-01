package Chapter05;

public class ObjectArgumentDemo {

	public static void main(String[] args) {
		Circle c1 = new Circle(10.0);
		Circle c2 = new Circle(10.0);

		zero(c1);
		System.out.println("원(c1)의 반지름 : " + c1.radius);

		zero(c2.radius);
		System.out.println("원(c2)의 반지름 : " + c2.radius);

	}

	static void zero(Circle c) {
		c.radius = 0.0;

	}

	static void zero(double r) {
		r = 0.0;
	}

}

class Circle {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double findArea() {
		return 3.14 * radius * radius;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("원의 넓이(반지름 : %.1f) = %.2f", radius, findArea());
	}
}
