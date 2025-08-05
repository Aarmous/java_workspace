package ch06;

public class InheritanceDemo {

	public static void main(String[] args) {

		Parent p = new Parent();
		p.name = "부모";
		p.method1();

		Child c = new Child();
		c.name = "my parent";
		c.myName = "나 자신";
		c.method1();
		c.method2();
	}

}

class Parent {

	String name;

	void method1() {
		System.out.println("메서드 1 입니다.");
		System.out.println(name);
	}
}

class Child extends Parent {
	String myName;

	void method2() {
		System.out.println("메서드 2 입니다.");
		System.out.println(myName);
	}

}