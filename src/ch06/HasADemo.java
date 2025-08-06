package ch06;

public class HasADemo {

	public static void main(String[] args) {
		Engine e = new Engine();
		Engine e2 = new Engine();
		Car c = new Car();
//		c.engine = e;
//		c.setEngine(e2); 
	}

}

class Engine {

}

class Car {
	private Engine engine;

	// 생성자 ==> 생성시에 부품을 주입 ==> 생성자 주입
	public Car() {
		this.engine = new Engine();
	}

	public Engine getEngine() {
		return engine;
	}

	// 설정자(setter) ==> 생성 한 후에 부품을 주입/변경 ==> 설정자 주입
//	public void setEngine(Engine engine) {
//		this.engine = engine;
//	}
}