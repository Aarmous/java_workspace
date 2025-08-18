package ch10.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankApplication_ch06_20_2 {

	/*
	 * // 요구사항 : 1. 계좌 생성할 때 반드시 초기 입금액을 0보다 크게 입력해야 한다. // 계좌번호는 유일해야 함. // - 비밀번호는
	 * 숫자 4자리로만 입력해야 함.(Optional) // 2. 예금은 금액 제한 없음 // 입금시 계좌번호만 알면 입금할 수 있음 // 3.
	 * 잔고보다 큰 금액은 인출할 수 없음 (마이너스 통장 X) // 출금시 계좌번호와 비밀번호가 일치해야만 인출할 수 있음(Optional)
	 * // 4. 예금주의 이름이나 계좌번호는 계좌 생성 후 변경할 수 없음 // 비밀번호는 계좌번호, 이름, 기존 비밀번호가 일치하는 경우에만
	 * 변경할 수 있음(Optional)
	 */
	static Scanner in = new Scanner(System.in);
	static Map<String, Account> accountList = new HashMap<>();

	public static void main(String[] args) {

		while (true) {
			showmenu();
			String menu = in.nextLine();
			switch (menu) {
			case "1" -> createAccount();
			case "2" -> viewAccounts();
			case "3" -> deposit();
			case "4" -> withdrawal();
			case "5" -> {
				System.out.println("프로그램 종료");
				return;
			}
			default -> System.out.println("메뉴 번호를 확인하세요.");
			}
		}
	}

	static void showmenu() {
		System.out.println("ㅡㅡㅡㅡㅡㅡ BankApplication ㅡㅡㅡㅡㅡㅡ");
		System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("메뉴 선택>");
	}

	static void createAccount() {
		String accountNo; // 새 계좌번호
		String input; // 입력받은 초기입금액
		long balance; // 초기입금액

		// 새 계좌번호 입력 받기 (예외 캐치)
		while (true) {
			System.out.println("생성할 계좌번호 : ");
			accountNo = in.nextLine(); // 새 계좌번호
			if (accountList.containsKey(accountNo)) {
				System.out.println("이미 존재하는 계좌번호입니다.");
			} else {
				break;
			}
		}

		// 계좌주 입력 받기
		System.out.println("계좌주 : ");
		String accountOwner = in.nextLine(); // 새 계좌주

		// 초기입금액 입력 받기 (예외 캐치)
		while (true) {
			System.out.println("초기입금액 : ");
			// 만약 입력값이 long타입의 양수라면, balance에 넣어라. 그렇지 않으면, 해당 메시지를 띄워라.
			input = in.nextLine(); // 입력받은 초기입금액
			if (balanceIsLong(input) && Long.parseLong(input) > 0) {
				balance = Long.parseLong(input);
				break;
			} else {
				System.out.println("입금액을 정확히 입력하세요.");
			}
		}

		// 입력받은 정보로 새 계좌 생성
		Account newAccount = new Account(accountNo, accountOwner, balance);

		// 새 계좌를 Map에 저장
		accountList.put(accountNo, newAccount);

		// 계좌 생성 성공 메시지
		System.out.println("계좌생성 성공 : \n" + accountList.get(accountNo));
	}

	static void viewAccounts() {
		System.out.println("ㅡㅡㅡㅡㅡㅡ 계좌 목록 ㅡㅡㅡㅡㅡㅡ");

		// Map 안의 모든 데이터 출력
		for (Account accounts : accountList.values()) {
			System.out.println(accounts);
		}
		System.out.println();
	}

	static void deposit() {
		String accountNo = findAccountId(); // 예금할 계좌번호 입력받기 (예외 캐치)
		String input; // 입력받은 예금액
		long money; // 검증되고 난 예금액

		// 예금액 입력받고, 예금시키기 (예외 캐치)
		while (true) {
			Account account = accountList.get(accountNo);
			System.out.println("금액 : ");
			input = in.nextLine();
			if (balanceIsLong(input) && Long.parseLong(input) > 0) { // 만일 입력받은 금액이 숫자이고 양수라면,
				money = Long.parseLong(input);
				account.deposit(money);
				break;
			} else { // 만일 입력받은 금액이 숫자가 아니거나 음수라면,
				System.out.println("금액을 정확히 입력해 주십시오.");
			}
		}

		// 예금 성공 메시지
		System.out.println("예금 성공 : \n" + accountList.get(accountNo));
	}

	static void withdrawal() {
		String accountNo = findAccountId(); // 출금할 계좌번호 입력받기 (예외 캐치)
		String input; // 입력받은 출금액
		long money; // 검증되고 난 출금액

		// 출금액 입력받고, 출금시키기 (예외 캐치)
		while (true) {
			Account account = accountList.get(accountNo);
			System.out.println("금액 : ");
			input = in.nextLine();
			if (balanceIsLong(input) && Long.parseLong(input) > 0) { // 만일 입력받은 금액이 숫자이고 양수라면,
				money = Long.parseLong(input);
				if (money > account.getBalance()) {
					System.out.println("잔액이 부족합니다.");
				} else {
					account.withdrawal(money);
					break;
				}
			} else { // 만일 입력받은 금액이 숫자가 아니거나 음수라면,
				System.out.println("금액을 정확히 입력해 주십시오.");
			}
		}

		// 출금 성공 메시지
		System.out.println("출금 성공 : \n" + accountList.get(accountNo));

	}

	// 입력받은 String이 숫자가 아닌 경우를 예외하는 메소드
	public static boolean balanceIsLong(String str) {
		try {
			Long.parseLong(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	// 예금할 계좌번호 입력받는 메소드 (예외 캐치)
	static String findAccountId() {
		while (true) {
			System.out.println("계좌번호 : ");
			String accountNo = in.nextLine();
			if (!accountList.containsKey(accountNo)) { // 만일 입력받은 계좌번호가 계좌목록에 존재하지 않는다면,
				System.out.println("해당계좌가 존재하지 않습니다.");
			} else { // 만일 입력받은 계좌번호가 계좌목록에 존재한다면,
				return accountNo;
			}
		}

	}

}
