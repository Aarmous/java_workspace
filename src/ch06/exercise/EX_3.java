package ch06.exercise;

public class EX_3 {

	public static void main(String[] args) {
		Person[] persons = new Person[3];
		persons[0] = new Person("길동이", 22);
		persons[1] = new Student("황진이", 23, 100);
		persons[2] = new ForeignStudent("Amy", 30, 200, "USA");

		for (Person person : persons) {
			System.out.println(person.show());
		}
	}

}

class Person {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String show() {
		return String.format("사람[이름: %s, 나이 : %d]", name, age);
	}
}

class Student extends Person {
	private int num;

	public int getNum() {
		return num;
	}

	public Student(String name, int age, int num) {
		super(name, age); // 아! Person의 생성자 만들라고 호출하는거구나!
		this.num = num;
	}

	@Override
	public String show() {
		return String.format("사람[이름: %s, 나이 : %d, 학번: %d]", super.getName(), super.getAge(), num);
	}
}

class ForeignStudent extends Student {
	private String nat;

	public ForeignStudent(String name, int age, int num, String nat) {
		super(name, age, num);
		this.nat = nat;
	}

	@Override
	public String show() {
		return String.format("사람[이름: %s, 나이 : %d, 학번: %d, 국적 : %s]", super.getName(), super.getAge(), super.getNum(),
				nat);
	}

}
