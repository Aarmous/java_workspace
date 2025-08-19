package myStudy.TextbookTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ch17_07 {

	public static void main(String[] args) {

//		List에 저장되어 있는 Member 중에서 직업이 ‘개발자’인 사람만 별도의 List에 수집하려고 합니다. 
//		빈칸에 알맞은 코드를 작성해보세요.
//		public class Member {
//		private String name;
//		private String job;
//		public Member(String name, String job) {
//		this.name = name;
//		this.job = job;
//		}
//		public String getName() { return name; }
//		public String getJob() { return job; }
//		}
//
//		import java.util.Arrays;
//		import java.util.List;
//		import java.util.stream.Collectors;
//		public class Example {
//		public static void main(String[] args) {
//		List<Member> list = Arrays.asList(
//		new Member("홍길동", "개발자"),
//		new Member("김나리", "디자이너"),
//		new Member("신용권", "개발자")
//		);
//		List<Member> developers = list.stream()
//		[          빈     칸           ]
//		developers
//		.stream()
//		.forEach(m -> System.out.println(m.getName()));
//		}
//		}
//		실행 결과
//		홍길동
//		신용권

		List<Member2> list = Arrays.asList(new Member2("홍길동", "개발자"), new Member2("김나리", "디자이너"),
				new Member2("신용권", "개발자"));
		List<Member2> developers = list.stream().filter(a -> a.getJob().equals("개발자")).collect(Collectors.toList());

		developers.stream().forEach(m -> System.out.println(m.getName()));

	}

}

class Member2 {
	private String name;
	private String job;

	public Member2(String name, String job) {
		this.name = name;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public String getJob() {
		return job;
	}

}
