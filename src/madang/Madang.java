package madang;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Madang {

	public static void main(String[] args) throws SQLException {

		// 1. 관리자 : 새로운 책을 구매했을 때, 구매한 책의 내역을 입력한다.
		// 책이름, 출판사, 가격

		// 2. 관리자 : 새로운 고객이 찾아왔을 때, 고객 정보를 입력한다.
		// 고객명, 주소, 전화번호

		// 3. 관리자 : 기존 고객이 책을 구매했을 때, 주문 정보를 입력한다.
		// 고객, 책, 판매가격, 구매일자

		// 4. 메뉴 : 1) 책 (등록/조회/수정/삭제, 가격만 수정가능/주문내역이 존재하면 삭제 불가능)
		// 2) 고객 (등록/조회/수정/삭제, 주소와 전화번호만 수정가능//주문내역이 존재하면 삭제 불가능)
		// 3) 주문 (등록/조회/수정/삭제, 판매가격만 수정가능/당일 등록만 삭제 가능)
		// 0) 종료

		Scanner in = new Scanner(System.in);
		Connection conn = MakeConnection.getConnection();

		String menu = "";
		while (true) {
			System.out.println("1.도서 2.고객 3.주문 0.이전");
			System.out.print("menu > ");
			menu = in.nextLine();
			if (menu.equals("0")) {
				break;
			}
			switch (menu) {
			case "1" -> bookManagement(in, conn);
			case "2" -> customerManagement(in, conn);
			case "3" -> orderManagement(in, conn);
			}

		}

		conn.close();
		System.out.println("프로그램 종료입니다!");

	} // end of main

	private static Object bookManagement(Scanner in, Connection conn) throws SQLException {

		String menu = "";
		while (true) {
			System.out.println("도서관리 메뉴입니다!");
			System.out.println("1.등록 2.조회 3.수정 4.삭제 0.이전");
			System.out.print("menu > ");

			menu = in.nextLine();
			if (menu.equals("0")) {
				break;
			}
			switch (menu) {
			case "1" -> Book.createBook(in, conn);
			case "2" -> Book.listBook(conn);
			case "3" -> Book.updateBook();
			case "4" -> Book.deleteBook();
			}

		}

		return null;
	}

	private static Object customerManagement(Scanner in, Connection conn) {
		System.out.println("고객관리 메뉴입니다!");
		return null;
	}

	private static Object orderManagement(Scanner in, Connection conn) {
		System.out.println("주문관리 메뉴입니다!");
		return null;
	}

	// 화면 클리어 메서드
	public static void clearScreen() {
		try {
			// 파워쉘에서도 작동하는 방법
			if (System.getProperty("").toLowerCase().contains("windows")) {
				// 윈도우에서는 ProcessBuilder 사용
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				// 다른 OS에서는 ANSI 이스케이프 코드
				System.out.print("\033[H\033[2J");
				System.out.flush();
			}
		} catch (Exception e) {
			// 실패하면 단순히 줄바꿈으로 대체
			for (int i = 0; i < 30; i++) {
				System.out.println();
			}
		}
	}

} // end of class
