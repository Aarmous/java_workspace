package ch06.sec02;

public class Ball extends Circle {
	private String color;

	public Ball() {
	}

	@Override
	protected void findRadius() {
		System.out.println("Ball의 반지름은 [10.0센티] 이다.");
	}

	@Override
	public void findArea() {
		System.out.println("Ball의 넓이는 [4 * PI * 반지름 * 반지름] 이다.");
	}

	public void findColor(String col) {
		this.color = col;
		System.out.println("Ball의 색은 " + color + "색이다.");
	}

	public void findVolume() {
		System.out.println("Ball의 부피는 4/3 * [PI * 반지름 *반지름 * 반지름] 이다.");
	}
}
