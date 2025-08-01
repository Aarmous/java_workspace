package chapter100;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {

		System.out.println("가위, 바위, 보 중에 하나를 입력하세요 : \n");
		Scanner in = new Scanner(System.in);
		String user = in.next();

		String[] rps = { "가위", "바위", "보" };
		int index = (int) (Math.random() * 3);
		String com = rps[index];

		System.out.println(user + com);

	}

}
