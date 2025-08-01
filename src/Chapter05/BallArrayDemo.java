package Chapter05;

public class BallArrayDemo {

	public static void main(String[] args) {

		Ball[] arr = new Ball[5];
		arr[0] = new Ball("빨강");
		arr[1] = new Ball("노랑");

		for (Ball ball : arr) {
			System.out.println(ball);
		}

	}

}

class Ball {
	String color;

	public Ball(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return color;
	}

}
