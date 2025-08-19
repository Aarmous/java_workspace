package myStudy.TextbookTest;

import java.util.Arrays;
import java.util.List;

public class Ch17_06 {

	public static void main(String[] args) {

//		List에 저장되어 있는 Member의 평균 나이를 출력하려고 합니다. 빈칸에 알맞은 코드를 작성해 보세요.
//		public class Member {
//		private String name;
//		private int age;
//		public Member(String name, int age) {
//		this.name = name;
//		this.age = age;
//		}
//		public String getName() { return name; }
//		public int getAge() { return age; }
//		}
//
//		import java.util.Arrays;
//		import java.util.List;
//		public class Example {
//		public static void main(String[] args) {
//		List<Member> list = Arrays.asList(
//		new Member("홍길동", 30),
//		new Member("신용권", 40),
//		new Member("감자바", 26)
//		);
//		double avg = list.stream()
//		[          빈     칸           ]
//		System.out.println("평균 나이: " + avg);
//		}
//		}
//		실행 결과
//		평균 나이: 32.0

		List<Member1> list = Arrays.asList(new Member1("홍길동", 30), new Member1("신용권", 40), new Member1("감자바", 26));

		double avg = list.stream().mapToInt(Member1::getAge).average().getAsDouble();

		System.out.println("평균 나이: " + avg);

	}

}

class Member1 {
	private String name;
	private int age;

	public Member1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
