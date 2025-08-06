package ch06;

public class Vehicle {
	String name = "Vehicle 탈 것";

	void whoami() {
		System.out.println("Vehicle 나는 탈 것이다.");
	}

	static void move() {
		System.out.println("Vehicle 이동하다.");
	}

}

class OldCar extends Vehicle {
	String name = "OldCar 자동차";

	@Override
	void whoami() {
		System.out.println("OldCar 나는 자동차이다.");
	}

	static void move() {
		System.out.println("OldCar 달리다");
	}
}

class SportsCar extends Vehicle {
	String name = "SportsCar 자동차";

	@Override
	void whoami() {
		System.out.println("SportsCar 나는 스포츠 자동차이다.");
	}

	static void move() {
		System.out.println("SportsCar 쌩 달리다");
	}
}
