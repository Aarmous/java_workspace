package ch06;

public class InheritanceDemo3 {

	// 계층적 상속을 구성하고, Override 를 한 사례

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.move();

		Eagle eagle = new Eagle();
		eagle.move();
		eagle.fly();

		Tiger tiger = new Tiger();
		tiger.move();
		tiger.run();

		Goldfish goldfish = new Goldfish();
		goldfish.move();
		goldfish.swim();
	}
}

class Animal {
	String eye;
	String mouth;

	void eat() {
	}

	void move() {
		System.out.println("동물은 움직인다.");
	}

}

class Eagle extends Animal {
	String wing;

	void fly() {
		System.out.println("독수리는 날아갑니다.");
	}

	@Override
	void move() {
		System.out.println("독수리는 날아갑니다.");
	}

}

class Tiger extends Animal {
	String leg;

	void run() {
		System.out.println("호랑이는 달립니다.");
	}

	@Override
	void move() {
		System.out.println("호랑이는 달립니다.");
	}
}

class Goldfish extends Animal {
	String fin;

	void swim() {
		System.out.println("금붕어는 헤엄칩니다.");
	}

	@Override
	void move() {
		System.out.println("금붕어는 헤엄칩니다.");
	}
}
