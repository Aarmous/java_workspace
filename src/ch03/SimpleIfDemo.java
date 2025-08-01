package ch03;

import java.util.Scanner;

public class SimpleIfDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("정수를 입력하세요 : ");
		int num = in.nextInt();

		if (num % 2 == 0) {
			System.out.println("짝수입니다.");
		}

		if (num % 2 == 1) {
			System.out.println("홀수입니다.");
		}
		System.out.println("종료");
	}

}
