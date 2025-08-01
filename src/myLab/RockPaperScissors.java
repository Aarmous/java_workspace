package myLab;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {

		System.out.println("가위, 바위, 보 중에 하나를 입력하세요 : \n");
		Scanner in = new Scanner(System.in);
		String user = in.next();
		System.out.println("나 : " + user);

		String[] rps = { "가위", "바위", "보" };
		int index = (int) (Math.random() * 3);
		String com = rps[index];
		System.out.println("컴퓨터 : " + com);

		if (user.equals(com)) {
			System.out.println("비겼습니다.");
		} else if ((user == "가위" && com == "보") || (user == "바위" && com == "가위") || (user == "보" && com == "바위")) {
			System.out.println("이겼습니다.");
		} else {
			System.out.println("졌습니다.");
		}
	}

}
