package ch04sec07;

import java.util.Scanner;

public class DiceDemo2 {

	public static void main(String[] args) {
		// 사용자로부터 반복수행할 횟수 입력 받기
		Scanner in = new Scanner(System.in);
		System.out.println("반복수행할 횟수를 입력하세요 : ");
		int count = in.nextInt();
		Dice1 dice = new Dice1();
		// 사용자로부터 입력받은 횟수만큼 반복하기
		for (int i = 0; i < count; i++) {
			System.out.println(dice.roll()); // 결과 : 1 부터 6 사이의 값이 랜덤하게 출력
		}
	}
}

class Dice1 {
	public int roll() {
		return (int) (Math.random() * 6) + 1;
	}

}
