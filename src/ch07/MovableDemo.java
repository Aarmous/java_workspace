package ch07;

public class MovableDemo {

	public static void main(String[] args) {
		Movable m = new Car();
		m.move(5);
//		m.show();  // 부모 타입이 된 자녀 객체 m 은 부모의 것은 다 보이지만, 자녀의 것은 안 보인다. 

		Car c = (Car) m; // 자녀 객체 m을 다운캐스팅
		c.move(10);
		c.show(); // 5+10
		// 자녀 객체 m을 자녀 타입으로 형변환 했기에, 이제는 자녀의 것이 보인다.

	}

}

interface Movable {
	void move(int s);
}

class Car implements Movable {
	private int pos = 0;

	@Override
	public void move(int x) {
		pos += x;
	}

	public void show() {
		System.out.println(pos + "m 이동했습니다.");
	}
}
