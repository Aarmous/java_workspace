package ch08.exercise;

public class EX_2 {

	public static void main(String[] args) {
		System.out.println(new Student("김삿갓")); // 학생[김삿갓]
		System.out.println(new Student("홍길동")); // 학생[홍길동]

	}

}

class Student {
	String name;

	public Student(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("학생[%s]", name);
	}
}
