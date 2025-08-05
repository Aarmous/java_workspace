package ch06;

public class BoxDemo {

	public static void main(String[] args) {
		ColoredBox cb = new ColoredBox();
		// 부모 메소드 호출하려면? 부모 객체가 자동 생성되었다는데, 이름은 모르고....

	}

}

class Box {
	public Box() {
		System.out.println("Box 가 생성되었습니다.");
	}

	void print() {

	}

}

class ColoredBox extends Box {
	public ColoredBox() {
		System.out.println("ColoredBox 가 생성되었습니다.");
	}

	void clclcl() {

	}

}
