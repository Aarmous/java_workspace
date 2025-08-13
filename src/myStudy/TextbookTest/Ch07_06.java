package myStudy.TextbookTest;

public class Ch07_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Parentss {
	public String name;

	public Parentss(String name) {
		this.name = name;
	}
}

class Childss extends Parentss {
	public int studentNo;

	public Childss(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}

}
