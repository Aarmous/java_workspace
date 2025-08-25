package myStudy.TextbookTest;

import java.util.ArrayList;
import java.util.List;

public class Ch15_07 {

	public static void main(String[] args) {

//		BoardDao 객체의 getBoardList() 메소드를 호출하면 
//		List<Board> 타입의 컬렉션을 리턴합니다. 
//		ListExample 클래스의 실행 결과를 보고, 
//		BoardDao 클래스와 getBoardList() 메소드를 작성해보세요.

//		< 실행결과 >
//		제목1-내용1
//		제목2-내용2
//		제목3-내용3

		BoardDao dao = new BoardDao();

		List<Board> list = dao.getBoardList();

		for (Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}

	}

}

class Board {
	private String title;
	private String content;

	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}
}

class BoardDao {

	public List<Board> getBoardList() {
		List<Board> l = new ArrayList<Board>();
		l.add(new Board("제목1", "내용1"));
		l.add(new Board("제목2", "내용2"));
		l.add(new Board("제목3", "내용3"));
		return l;
	}
}
