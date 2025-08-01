package ch03;

public class MyMath {

	long add(long a, long b) {
		return a + b;
	}

	long sub(long a, long b) {
		return a - b;
	}

	long mult(long a, long b) {
		return a * b;
	}

	long div(long a, long b) {
		if (b != 0) {
			return a / b;
		} else {
			return 0;
		}
	}

}