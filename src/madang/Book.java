package madang;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book {
	private int bookid;
	private String bookname;
	private String publisher;
	private int price;

	public Book(int id, String title, String author, int price) {
		this.bookid = id;
		this.bookname = title;
		this.publisher = author;
		this.price = price;
	}

	public static void createBook(Scanner in, Connection conn) throws SQLException {

		System.out.println("등록할 도서 정보를 입력하세요. : ");
		System.out.println("도서 ID : ");
		String bookid = in.nextLine();

		System.out.println("도서 이름 : ");
		String bookname = in.nextLine();

		System.out.println("출판사 : ");
		String publisher = in.nextLine();

		System.out.println("가격 : ");
		String price = in.nextLine();

		// 1. SQL 문 준비 (물음표 ? 자리에 값 넣을 예정)
		String sql = "insert into book (bookid, bookname, publisher, price) values (?, ?, ?, ?)";

		// 2. PreparedStatement 객체 생성
		PreparedStatement pstmt = conn.prepareStatement(sql);

		// 3. 값 설정 (물음표 순서대로 인덱스는 1부터 시작)
		pstmt.setString(1, bookid);
		pstmt.setString(2, bookname);
		pstmt.setString(3, publisher);
		pstmt.setString(4, price);

		// 4. SQL 실행
		if (pstmt.executeUpdate() == 1) {
			System.out.println("도서 추가 성공");
		} else {
			System.out.println("도서 추가 실패");
		}

		// 5. 연결 종료
		pstmt.close();
	}

	public static List<Book> listBook(Connection conn) throws SQLException {
		List<Book> bookList = new ArrayList<>();

		String sql = "select * from book";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();

		while (rs.next()) {
			int id = rs.getInt(1);
			String title = rs.getString(2);
			String author = rs.getString(3);
			int price = rs.getInt(4);

			Book book = new Book(id, title, author, price);
			bookList.add(book);
		}
		pstmt.close();
		return bookList;
	}

	public static void updateBook(Scanner in, Connection conn) throws SQLException {
		System.out.println("수정할 도서 ID : ");
		String bookid = in.nextLine();

		System.out.println("수정할 항목 (bookname/publisher/price) : ");
		String column = in.nextLine();

		System.out.println("수정할 내용 : ");
		String changeInput = in.nextLine();

		// 3. preparedstatement 인터페이스 사용
		String sql = "update book set " + column + " = ? where bookid = ?";

		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, changeInput);
		pstmt.setString(2, bookid);

		// 4. sql 문 실행
		if (pstmt.executeUpdate() == 1) {
			System.out.println("도서 수정 성공");
		} else {
			System.out.println("도서 수정 실패");
		}
		// 5. 연결 종료
		pstmt.close();
	}

	public static void deleteBook(Scanner in, Connection conn) throws SQLException {
		System.out.println("삭제할 도서 ID : ");
		int bookid = Integer.parseInt(in.nextLine());

		String sql = "delete from book where bookid = ?";

		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, bookid);

		// 4. sql 문 실행
		if (pstmt.executeUpdate() == 1) {
			System.out.println("도서 삭제 성공");
		} else {
			System.out.println("도서 삭제 실패");
		}
		// 5. 연결 종료
		pstmt.close();
	}

	@Override
	public String toString() {
		return "[" + bookid + "] " + bookname + " - " + publisher + " - " + price + "원";
	}
}
