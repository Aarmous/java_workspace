package ch04;

public class InheritanceDemo {

	public static void main(String[] args) {
		Animal2 animal = new Animal2();
		animal.eat();
		Tiger tiger = new Tiger();
		tiger.run();
		Bird bird = new Bird();
		bird.move();
	}

}

class Animal2 {
	// 주둥이
	String mouth;

	// 먹는다 eat()
	void eat() {
		System.out.println("먹습니다.");
	}

	// 움직인다 move()
	void move() {
		System.out.println("움직입니다.");
	}
}

class Tiger extends Animal2 {
	// 주둥이
	// 먹는다 eat()
	// 움직인다 move()
	// run()
	void run() {
		System.out.println("뜁니다.");

	}
}

class Fish1 extends Animal2 {
	// 주둥이
	// 먹는다 eat()
	// 움직인다 move()
	void swim() {
		System.out.println("헤엄칩니다.");
	}
	// 헤엄친다
//	void swim() {
//		System.out.println("헤엄칩니다.");

}

class Bird extends Animal2 {
	// 주둥이
	// 먹는다 eat()
	// 움직인다 move()
	@Override
	void move() {
		System.out.println("날아갑니다.");
	}
	// fly()
//	void fly() {
//		System.out.println("날아갑니다.");

}
