package myStudy.TextbookTest;

public class Ch06_15 {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		
		boolean result = memberService.login("hong", "12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
			} else {
				System.out.println("id 또는 password가 올바르지 않습니다.");
				}

	}

}   

class MemberService {
	boolean login(String id, String password) {
		return id=="hong" && password=="12345";
	}
		
	void logout(String id) {
		System.out.println(id + "님이 로그아웃되었습니다.");
	}
	
}
