package ch07.sec03;

/**
 * (이 인터페이스에 대한 설명을 여기에 써놓는다.)
 */
public interface Controllable {
	void turnOn();

	void turnOff();

	default void repair() {
		show("장비를 수리한다.");
	}

	private void show(String s) {
		System.out.println(s);
	}

	static void reset() {
		System.out.println("장비를 초기화한다.");
	}
}
