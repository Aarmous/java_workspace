package ch18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBDemo_insert_PreparedStatement {

	public static void main(String[] args) throws SQLException {
		Connection conn = makeConnection();

		// 3. preparedstatement 인터페이스 사용
		String sql = "insert into book (bookid, bookname, publisher, price) values (?, ?, ?, ?)";

		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, 13);
		pstmt.setString(2, "올림픽");
		pstmt.setString(3, "당");
		pstmt.setInt(4, 10000);

		// 4. sql 문 실행
		if (pstmt.executeUpdate() == 1) {
			System.out.println("레코드 수정 성공");
		} else {
			System.out.println("레코드 수정 실패");
		}
		// 5. 연결 종료
		pstmt.close();
		conn.close();

	}

	public static Connection makeConnection() {
		String url = "jdbc:mysql://localhost:3306/madang?serverTimezone=Asia/Seoul";
		Connection conn = null;

		// 1. 드라이버 로드
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("데이터베이스 연결 중....");
			// 2. 데이터베이스 연결
			conn = DriverManager.getConnection(url, "root", "1111");
			System.out.println("데이터베이스 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버를 찾지 못했습니다.");
		} catch (SQLException e) {
			System.out.println("데이터베이스 연결 실패");
		}

		return conn;
	}

}
