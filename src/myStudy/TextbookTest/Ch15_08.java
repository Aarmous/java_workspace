package myStudy.TextbookTest;

import java.util.HashSet;
import java.util.Set;

public class Ch15_08 {

	public static void main(String[] args) {

//		HashSet에 Student 객체를 저장하려고 합니다. 
//		학번이 같으면 동일한 Student라고 가정하고
//		중복 저장이 되지 않도록 하고 싶습니다. 
//		Student 객체의 해시코드는 학번이라고 가정하고 
//		Student 클래스를 작성해보세요.
//		
//		실행 결과
//		저장된 객체 수: 2
//		1:홍길동
//		2:신용권

		Set<Student1508> set = new HashSet<Student1508>();
		set.add(new Student1508(1, "홍길동"));
		set.add(new Student1508(2, "신용권"));
		set.add(new Student1508(1, "조민우"));

		System.out.println("저장된 객체 수: " + set.size());

		for (Student1508 s : set) {
			System.out.println(s.studentNum + ":" + s.name);
		}

	}

}

class Student1508 {
	public int studentNum;
	public String name;

	public Student1508(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	// 여기에 코드를 작성하세요.
	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student1508 stu) {
			if (studentNum == stu.hashCode()) {
				return true;
			}
		}
		return false;
	}

}
