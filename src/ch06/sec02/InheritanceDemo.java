package ch06.sec02;

public class InheritanceDemo {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.findArea();
		c.findRadius();

		Ball b = new Ball();
		b.findArea();
		b.findRadius();
		b.findVolume();
		b.findColor("빨간");

	}

}
