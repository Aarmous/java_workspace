package ch07.sec06;

public class AnonymousDemo {

	Bird b = new Bird() { // 이름없는 자식 객체를 생성하는 법, 자녀클래스에 이름도 없고 아무것도 없기에, 부모이름의 객체를 먼저 만들어, 부모객체몸을 빌려 이름없는
							// 자녀클래스를 실행시킨다.
		@Override
		void move() {
			System.out.println("이름없는 새가 날아간다.");
		};

		void sound() { // 이렇게 만들어봤자, 어디에서도 쓸 수 없다.
			System.out.println("이름없는 새가 내는 소리");
		}
	};

	public static void main(String[] args) {
		AnonymousDemo a = new AnonymousDemo();
		a.b.move();
//		a.b.sound();  // 이렇게는 안된다. 

	}

}
