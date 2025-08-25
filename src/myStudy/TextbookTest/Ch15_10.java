package myStudy.TextbookTest;

import java.util.TreeSet;

public class Ch15_10 {

//	TreeSet에 Student 객체를 저장할 때, 
//	Student의 score 필드값을 기준으로 자동 정렬되도록 구현하고 싶습니다. 
//	TreeSet의 last() 메소드를 호출했을 때 
//	가장 높은 score의 Student 객체가 리턴되도록 
//	Student 클래스에서 밑줄 친 곳과 비어있는 곳에 코드를 작성해보세요.
//	
//	실행 결과
//	최고 점수: 96
//	최고 점수를 받은 아이디: blue

	public static void main(String[] args) {
		TreeSet<Student1510> treeSet = new TreeSet<Student1510>();
		treeSet.add(new Student1510("blue", 96));
		treeSet.add(new Student1510("hong", 86));
		treeSet.add(new Student1510("white", 92));

		Student1510 student = treeSet.last();

		System.out.println("최고 점수: " + student.score);
		System.out.println("최고 점수를 받은 아이디: " + student.id);

	}

}

class Student1510 {
	public String id;
	public int score;

	public Student1510(String id, int score) {
		this.id = id;
		this.score = score;
	}

}
