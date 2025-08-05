package ch03;

public class NestedIfDemo {

	public static void main(String[] args) {
		// nested if
		String str = "abc";
		System.out.println(str);

//		if (str != null) {
//			if (str.length() == 0) {
//				System.out.println("빈 문자열입니다.");
//			} else {
//				System.out.println(str.length() + " 글자의 문자열입니다.");
//			}
//		}

		// 쇼트서킷 : 앞이 true면 뒤 진행, 뒤가 false면 뒤 진행 안함
		if (str != null && str.length() > 0) {
			System.out.println(str.length() + " 글자의 문자열입니다.");
		} else {
			System.out.println("빈 문자열입니다.");
		}
	}

}
