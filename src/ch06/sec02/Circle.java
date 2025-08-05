package ch06.sec02;

public class Circle {
	private void secret() {
		System.out.println("비밀이다.");
	}

	protected void findRadius() {
		System.out.println("Circle의 반지름은 [10.0센티] 이다.");
	}

	public void findArea() {
		System.out.println("Circle의 넓이는 [PI * 반지름 * 반지름] 이다.");
	}
}
