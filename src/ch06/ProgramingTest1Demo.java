package ch06;

public class ProgramingTest1Demo {

	public static void main(String[] args) {
		Circle cir = new Circle(5);
		ColoredCircle col = new ColoredCircle(10, "빨간색");

		cir.show();
		col.show();

	}

}

class Circle {
	int radius;

	Circle() {
	}

	Circle(int radius) {
		this.radius = radius;
	}

	void show() {
		System.out.println("반지름이 " + radius + "인 원이다.");
	}
}

class ColoredCircle extends Circle {
	String color;

	ColoredCircle() {
	}

	ColoredCircle(int radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	@Override
	void show() {
		System.out.println("반지름이 " + radius + "인 " + color + " 원이다.");
	}

}
