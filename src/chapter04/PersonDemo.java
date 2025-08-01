package chapter04;

public class PersonDemo {

	public static void main(String[] args) {
		Person p = new Person();
//		p.setAge(21);
//		p.setName("김민국");
//		p.setNationality("대한민국");
//		p.sayHello();
		p.setAge(21).setName("김민국").setNationality("대한민국").sayHello(); // chain 연속호출 방법
		// 기존의 void는 반환값이 없기 때문에 Person 으로 바꾸고, return this; 를 추가하여 p를 반환시킨다.
	}

}

class Person {
	private String name;
	private int age;
	private String nationality;

	public Person setName(String name) {
		this.name = name;
		return this;
	}

	public Person setAge(int age) {
		this.age = age;
		return this;
	}

	public Person setNationality(String nationality) {
		this.nationality = nationality;
		return this;
	}

	public void sayHello() {
		System.out.println(nationality + "에 사는 " + age + "살 " + name + "입니다.");
	}
}
