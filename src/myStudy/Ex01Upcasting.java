package myStudy;

public class Ex01Upcasting {

	public static void main(String[] args) {
		Book book = null;
		book = new Book();
		book.setTitle("자바 기본문법");
		System.out.println(book.getTitle());

		book = new EBook(); // Upcasting
		// book.setFontColor("블랙");
		// System.out.println(book.getFontColor());
		book.setTitle("자바 자료구조");
		System.out.println(book.getTitle());

	}
}

class Book {
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}

class EBook extends Book {
	private String fontColor;

	public String getFontColor() {
		return fontColor;
	}

	public void setFontColor(String fontColor) {
		this.fontColor = fontColor;
	}

	@Override
	public void setTitle(String title) {
		title = "[EBOOK]" + title;
		super.setTitle(title);
	}
}
