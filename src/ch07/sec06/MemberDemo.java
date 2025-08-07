package ch07.sec06;

public class MemberDemo {

	class Eagle extends Bird {
		@Override
		void move() {
			System.out.println("Eagle 날아간다.");
		}

		void sound() {
			System.out.println("Eagle 내는 소리");
		}
	}

	Eagle e = new Eagle();

	public static void main(String[] args) {
		MemberDemo m = new MemberDemo();
		m.e.move();

	}

}
