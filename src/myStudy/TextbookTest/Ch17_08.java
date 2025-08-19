package myStudy.TextbookTest;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ch17_08 {

	public static void main(String[] args) {
		
//		List에 저장되어 있는 Member를 직업별로 그룹핑해서 Map<String,List<Member>> 객체로 생성하려고 합니다. 
//		키는 Member의 직업이고, 값은 해당 직업을 갖는 Member들을 저장하고 있는 List입니다. 
//		실행 결과를 보고 빈칸에 알맞은 코드를 작성해보세요.
//		public class Member {
//		private String name;
//		private String job;
//		public Member(String name, String job) {
//		this.name = name;
//		this.job = job;
//		}
//		public String getName() { return name; }
//		public String getJob() { return job; }
//		@Override
//		public String toString() {
//		return "{name:" + name + ", job:" + job + "}";
//		}
//		}
//		import java.util.Arrays;
//		import java.util.List;
//		import java.util.Map;
//		import java.util.stream.Collectors;
//		public class Example {
//		    public static void main(String[] args) {
//		        List<Member> list = Arrays.asList(
//		            new Member("홍길동", "개발자"),
//		            new Member("김나리", "디자이너"),
//		            new Member("신용권", "개발자")
//		        );
//
//		        Map<String, List<Member>> groupingMap = list.stream()
//				[          빈     칸           ]
//
//		        System.out.println("[개발자]");
//				[          빈     칸           ]
//
//		        System.out.println();
//
//		        System.out.println("[디자이너]");
//				[          빈     칸           ]
//		    }
//		}
//		[개발자]
//				{name:홍길동, job:개발자}
//				{name:신용권, job:개발자}
//
//				[디자이너]
//				{name:김나리, job:디자이너}
		
		List<Member2> list = Arrays.asList(
	            new Member2("홍길동", "개발자"),
	            new Member2("김나리", "디자이너"),
	            new Member2("신용권", "개발자")
	        );

//	        Map<String, List<Member2>> groupingMap = list.stream()
	        		list.stream().collect(Colle)

	        System.out.println("[개발자]");

	        System.out.println();

	        System.out.println("[디자이너]");
		
		
		
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

	@Override
	public String toString() {
		return "{name:" + name + ", job:" + job + "}";

	}

}
