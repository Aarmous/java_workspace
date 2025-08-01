package ch03;

import java.util.Scanner;

public class EX_7 {

	public static void main(String[] args) {
		// while 문과 Scanner 의 nextLine() 메서드를 이용해서
		// 다음 실행 결과와 같이 키보드로부터 입력된 데이터로
		// 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성.
		// 단, 출금은 잔고보다 큰 금액은 할 수 없다.

		Scanner in = new Scanner(System.in);
		String msg = """
				ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
				1. 예금 | 2. 출금 | 3. 잔액조회 | 4. 종료
				ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
				""";
		String menu = "";
		long balance = 0;
		long money = 0;
		while (true) {
			System.out.println(msg);
			menu = in.nextLine();
			if (menu.equals("4")) {
				break;
			} else if (menu.equals("1")) {
				System.out.println("입금할 금액을 입력하시오 : ");
				money = Long.parseLong(in.nextLine());
				balance += money;
				System.out.printf("현재 잔액 : %d 원\n", balance);
			} else if (menu.equals("2")) {
				while (true) {
					System.out.println("출금할 금액을 입력하시오 : ");
					money = Long.parseLong(in.nextLine());
					if (money <= balance) {
						balance -= money;
						System.out.printf("현재 잔액 : %d 원\n", balance);
						break;
					} else {
						System.out.printf("잔액초과! 현재 잔액 : %d 원 \n", balance);
					}
				}
			} else if (menu.equals("3")) {
				System.out.printf("현재 잔액 : %d 원\n", balance);
			}
		}

		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// 1. 예금 | 2. 출금 | 3. 잔고조회 | 4. 종료
		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// 선택> 1
		// 예금액> 10000

		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// 1. 예금 | 2. 출금 | 3. 잔고조회 | 4. 종료
		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// 선택> 2
		// 예금액> 2000

		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// 1. 예금 | 2. 출금 | 3. 잔고조회 | 4. 종료
		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// 선택> 3
		// 예금액> 8000

		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// 1. 예금 | 2. 출금 | 3. 잔고조회 | 4. 종료
		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// 선택> 4
		// 프로그램 종료

	}

}
