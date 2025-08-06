package ch06.sec08;

public class Circle {
	int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Circle c) {
			return this.radius == c.radius;
		}
		return false;
	}

}
