package madang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Book { // book : bookid, bookname, publisher, price
	public static void createBook(Scanner in, Connection conn) throws SQLException {

		System.out.println("등록할 도서 정보를 입력하세요. : ");
		System.out.println("도서 ID : ");
		int bookid = Integer.parseInt(in.nextLine());

		System.out.println("도서 이름 : ");
		String bookname = in.nextLine();

		System.out.println("출판사 : ");
		String publisher = in.nextLine();

		System.out.println("가격 : ");
		int price = Integer.parseInt(in.nextLine());

		// 1. SQL 문 준비 (물음표 ? 자리에 값 넣을 예정)
		String sql = "insert into book (bookid, bookname, publisher, price) values (?, ?, ?, ?)";

		// 2. PreparedStatement 객체 생성
		PreparedStatement stmt = conn.prepareStatement(sql);

		// 3. 값 설정 (물음표 순서대로 인덱스는 1부터 시작)
		stmt.setInt(1, bookid);
		stmt.setString(2, bookname);
		stmt.setString(3, publisher);
		stmt.setInt(4, price);

		// 4. SQL 실행
		if (stmt.executeUpdate(sql) == 1) {
			System.out.println("도서 추가 성공");
		} else {
			System.out.println("도서 추가 실패");
		}

		// 5. 연결 종료
		stmt.close();
	}

	public static void listBook(Connection conn) throws SQLException {

		String sql = "select * from book";
		PreparedStatement stmt = conn.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();

		while (rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print(rs.getString(2));
			System.out.print(rs.getString(3));
			System.out.println(rs.getInt(4));
		}

		stmt.close();
	}

	public static void updateBook() {

	}

	public static void deleteBook() {

	}

}
