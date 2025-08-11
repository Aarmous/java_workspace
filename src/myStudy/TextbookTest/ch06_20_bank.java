package myStudy.TextbookTest;

import java.util.Scanner;

public class ch06_20_bank {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String msg = """
				ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
				1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료
				ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
				선택> 
				""";
		String menu = "";
		String[] account = new String[100];
		
		long balance = 0;
		long money = 0;
		while (true) {
			System.out.println(msg);
			menu = in.nextLine();
			if (menu.equals("5")) {
				System.out.println("프로그램 종료");
				break;
			} else if (menu.equals("1")) {
				System.out.println("""
						ㅡㅡㅡㅡㅡㅡ
						계좌생성
						ㅡㅡㅡㅡㅡㅡ
						계좌번호 : 
						""");
				account[] = in.nextLine(); // ?????  배열에 계좌번호 정보 입력 
				System.out.println("계좌주 : ");
				account[] = in.nextLine(); // ?????  배열에 계좌주 정보 입력 
				System.out.println("초기입금액 : ");
				account[] = Long.parseLong(in.nextLine()); // ?????  배열에 금액 정보 입력 
				System.out.println("결과 : 계좌가 생성되었습니다.");
				
//				money = Long.parseLong(in.nextLine());
//				balance += money;
//				System.out.printf("현재 잔액 : %d 원\n", balance);
				
				
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

	}

}
