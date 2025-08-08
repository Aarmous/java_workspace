package ch08.exercise;

import java.util.Random;

public class EX_4 {

	public static void main(String[] args) {
		System.out.println(new Dice().roll());

	}

}

class Dice {
	int roll() {
		Random r = new Random();
		return r.nextInt(1, 7);
	}

}
