package myStudy.TextbookTest;

public class Ch07_07 {

	public static void main(String[] args) {
		Child child = new Child();
	}
}

class Parent {
	public String nation;

	public Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}

	public Parent(String nation) {
		super(); // 이게 생략되어 있음. 자식 클래스의 생성자 중, this("대한민국");가 없다면 자바가 super();를 자동 넣어줌.
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}

class Child extends Parent {
	public String name;

	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}

	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
