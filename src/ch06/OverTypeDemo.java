package ch06;

public class OverTypeDemo {

	public static void main(String[] args) {
		Vehicle v = new OldCar();
		System.out.println(v.name);
		v.whoami();
		Vehicle.move();
		v.move(); // move 메소드는 static 이기에 오버라이딩 되지 않아서, 여기선 자녀것이 아니라 부모것이 호출된다.

		OldCar oc = new OldCar();
		System.out.println(oc.name);
		oc.whoami();
		OldCar.move();
		oc.move();

		v = new SportsCar();
		v.whoami(); // 형태는 부모것을 호출하는 형태이지만, 결과는 자녀것을 호출하기에, 이런것을 "다형성"이라 한다.

		Vehicle[] vehicles = new Vehicle[2];
		vehicles[0] = new OldCar();
		vehicles[1] = new SportsCar();

		for (Vehicle vehicle : vehicles) {
			vehicle.whoami();
			vehicle.move();
		}

	}

}
