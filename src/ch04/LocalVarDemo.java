package ch04;

public class LocalVarDemo {

	public static void main(String[] args) {
		int a = 0;
		double b;
		// System.out.print(b); // Error - b의 값을 주지 않았다.
		// System.out.print(a + c); // Error - c라는 변수를 선언하지도 않았다.
		int c = 0;
		// public double d = 0.0; // Error - method 안의 지역변수에 public 를 하지 못한다.
		for (int e = 0; e < 10; e++) {
			// int a = 1; // Error - 위에 이미 선언했는데, 또 중복선언은 안 된다.
			System.out.println(e);
		}
	}
}
