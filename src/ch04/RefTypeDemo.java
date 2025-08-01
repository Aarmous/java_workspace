package ch04;

public class RefTypeDemo {

	public static void main(String[] args) {
		int i = 10;
		Ball myBall = new Ball();
		Ball yourBall = new Ball();

		System.out.println(myBall); // 4e50df2e
		System.out.println(yourBall); // 1d81eb93
		System.out.println(yourBall == myBall);

		myBall = yourBall;
		System.out.println(myBall); // 1d81eb93
		System.out.println(yourBall); // 1d81eb93
		System.out.println(yourBall == myBall);

	}

}

class Ball {

}
