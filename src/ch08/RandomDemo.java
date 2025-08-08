package ch08;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random r = new Random();

		for (int i = 0; i < 3; i++) {
			System.out.println(r.nextInt(1, 7));
		}

		for (int i = 0; i < 3; i++) {
			System.out.println(r.nextDouble(100));
		}

	}

}
