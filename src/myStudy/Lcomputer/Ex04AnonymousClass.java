package myStudy.Lcomputer;

public class Ex04AnonymousClass {

	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setTitle("자바 익명클래스란");
		b1.setAuthor("엘컴퓨터학원");

		PrintService ps = new PrintServiceForPrinter();
		b1.printInfo(ps);
		System.out.println();

		b1.printInfo(new PrintService() {

			@Override
			public void print() {
				System.out.println("- FAX로 전송 -");
				System.out.println(b1.getTitle() + ", " + b1.getAuthor());
			}
		});
		System.out.println();

		b1.printInfo(new PrintService() {

			@Override
			public void print() {
				System.out.println("- 앱 알림으로 전송 -");
				System.out.println(b1.getTitle() + ", " + b1.getAuthor());
				System.out.println();
			}

		});

	}
}

interface PrintService {
	public abstract void print();
}

class PrintServiceForPrinter implements PrintService {

	@Override
	public void print() {
		System.out.println("- 프린터로 출력 -");
		System.out.println("책 인스턴스가 필요합니다.");
	}
}

class Book {
	String title;
	String author;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void printInfo(PrintService ps) {
		ps.print();
	}

}
