package myStudy.TextbookTest;

public class Ch12_06 {

//	Member 클래스에서 Object의 toString() 메소드를 오버라이딩해서 MemberExample 클래
//	스의 실행 결과처럼 나오도록 작성해보세요.

//	실행 결과
//	blue: 이파란

	public static void main(String[] args) {
		Member1206 member = new Member1206("blue", "이파란");
		System.out.println(member);

	}

}

class Member1206 {
	private String id;
	private String name;

	public Member1206(String id, String name) {
		this.id = id;
		this.name = name;
	}

	// 여기에 코드를 작성하세요.
	@Override
	public String toString() {
		return String.format("%s: %s", id, name);
	}
}
