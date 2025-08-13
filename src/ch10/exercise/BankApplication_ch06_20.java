package ch10.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApplication_ch06_20 {

	/*
	 * // 요구사항 : 1. 계좌 생성할 때 반드시 초기 입금액을 0보다 크게 입력해야 한다. // 계좌번호는 유일해야 함. // - 비밀번호는
	 * 숫자 4자리로만 입력해야 함.(Optional) // 2. 예금은 금액 제한 없음 // 입금시 계좌번호만 알면 입금할 수 있음 // 3.
	 * 잔고보다 큰 금액은 인출할 수 없음 (마이너스 통장 X) // 출금시 계좌번호와 비밀번호가 일치해야만 인출할 수 있음(Optional)
	 * // 4. 예금주의 이름이나 계좌번호는 계좌 생성 후 변경할 수 없음 // 비밀번호는 계좌번호, 이름, 기존 비밀번호가 일치하는 경우에만
	 * 변경할 수 있음(Optional)
	 */

	public static boolean isLong(String str) {
		try {
			Long.parseLong(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String msg = """
				ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
				1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료
				ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
				메뉴 선택>
				""";

		String menu = "";

		List<Account> accountList = new ArrayList<>();

		while (true) {
			System.out.println(msg);
			menu = in.nextLine();
			if (menu.equals("5")) {
				System.out.println("프로그램 종료");
				break;
			}
			switch (menu) {
			case "1" -> {
				System.out.println("""
						ㅡㅡㅡㅡㅡㅡ
						계좌생성
						ㅡㅡㅡㅡㅡㅡ
						계좌번호 :
						""");
				String accountNo = in.nextLine();
				System.out.println("계좌주 : ");
				String accountOwner = in.nextLine();
				long balance;
				while (true) {
					System.out.println("초기입금액 : ");
					// 만약 입력값이 롱타입의 양수라면, 밸런스에 넣어라. 그렇지 않으면, 해당 메시지를 띄워라.
					String input = in.nextLine();
					if (isLong(input) && Long.parseLong(input) > 0) {
						balance = Long.parseLong(input);
						break;
					} else {
						System.out.println("입금액을 정확히 입력해 주십시오.");
					}
				}
				accountList.add(new Account(accountNo, accountOwner, balance));
				System.out.println("계좌가 생성되었습니다.");
			}

			case "2" -> {
				System.out.println("""
						ㅡㅡㅡㅡㅡㅡ
						계좌목록
						ㅡㅡㅡㅡㅡㅡ
						""");
				for (Account account : accountList) {
					System.out.println(account);
				}
			}

			case "3" -> {
				String accountNo;
				long balance;
				while (true) {
					System.out.println("""
							ㅡㅡㅡㅡㅡㅡ
							예금
							ㅡㅡㅡㅡㅡㅡ
							계좌번호 :
							""");
					accountNo = in.nextLine();
					int index = accountList.indexOf(accountNo);
					if (index != -1) {
						break;
					} else {
						System.out.println("계좌번호를 정확히 입력하시오.");
					}
				}

				while (true) {
					System.out.println("예금액 : ");
					String input = in.nextLine();
					if (isLong(input) && Long.parseLong(input) > 0) {
						balance = Long.parseLong(input);
						break;
					} else {
						System.out.println("예금액을 정확히 입력해 주십시오.");
					}
				}
//
//				for (Account account : accountList) {
//					if (account.getAccountNo().equals(accountNo)) {
//						account.deposit(balance);
//						break;
//					}
//				}
//			}
//			System.out.println("입금이 완료되었습니다.");

			}

			case "4" -> {
				System.out.println("""
						ㅡㅡㅡㅡㅡㅡ
						출금
						ㅡㅡㅡㅡㅡㅡ
						계좌번호 :
						""");
				String accountNo = in.nextLine();

				System.out.println("출금액 : ");
				long balance = Long.parseLong(in.nextLine());
				for (Account account : accountList) {
					if (account.getAccountNo().equals(accountNo)) {
						account.withdrawal(balance);
						break;
					}
				}
				System.out.println("출금이 완료되었습니다.");
			}

			default -> System.out.println("메뉴 번호를 확인하세요.");
			}

		}

	}

}
