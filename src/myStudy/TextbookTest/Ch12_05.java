package myStudy.TextbookTest;

import java.util.HashSet;

public class Ch12_05 {

	public static void main(String[] args) {

		/*
		 * Object의 equals ()와 hashCode() 메소드를 오버라이딩해서 Student의 학번(studentNum)이 같으면 동등
		 * 객체가 될 수 있도록 Student 클래스를 작성해보세요 (hashCode() 메소드의 리턴 값은 studentNum 필드값으로 설정)
		 */

		// Student를 저장하는 HashSet 생성
		HashSet<Student> hashSet = new HashSet<Student>();

		// Student 저장
		hashSet.add(new Student("1"));
		hashSet.add(new Student("1")); // 같은 학번이므로 중복 저장이 안됨
		hashSet.add(new Student("2"));

		// 저장된 Student 수 출력
		System.out.println("저장된 Student 수: " + hashSet.size());
		System.out.println();

		System.out.println(hashSet);
		System.out.println();

		for (Student stu : hashSet) {
			System.out.println(stu.hashCode());
		}

	}

}

class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public String toString() {
		return studentNum;
	}

	// 여기에 코드를 작성하세요.
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student stu) {
			if (studentNum.equals(stu.studentNum)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}

}
