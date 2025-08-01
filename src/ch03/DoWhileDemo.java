package ch03;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = -1;
		do {
			System.out.println("값을 입력하세요 : ");
			num = in.nextInt();
		} while (num > 0);
		System.out.println("종료!!!");
	}

}
