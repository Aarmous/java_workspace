package ch04sec07;

public class DiceDemo {

	public static void main(String[] args) {
		Dice dice = new Dice();
		for (int i = 0; i < 3; i++) {
			System.out.println(dice.roll()); // 결과 : 1 부터 6 사이의 값이 랜덤하게 출력
		}
	}
}

class Dice {
	public int roll() {
		return (int) (Math.random() * 6) + 1;
	}

}
