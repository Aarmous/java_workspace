package ch06.exercise;

public class EX_6 {

	public static void main(String[] args) {
		Car c = new Car("파랑", 200, 1000, 5);
		c.show();

		Vehicle v = c;
		v.show();

	}

}

class Vehicle {
	String color;
	int speed;

	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}

	void show() {
		System.out.println("Vehicle : " + color + "색, " + speed + " 속도");
	}

}

class Car extends Vehicle {
	int displacement;
	int gears;

	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}

	@Override
	void show() {
		System.out.println("Car : " + color + "색, " + speed + " 속도, " + displacement + " 배기량, " + gears + " 기어단수");
	}
}
