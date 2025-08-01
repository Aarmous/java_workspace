package ch05;

public class StringDemo3 {

	public static void main(String[] args) {
		String s1 = new String("Hi,");
		String s2 = new String(" Java");

		System.out.println("문자열 길이(s1) : " + s1.length()); // "Hi," 의 글자 수 = 3
		System.out.println(s1.charAt(1)); // "Hi," 의 두번째 글자 = i

		s1 = s1.concat(s2); // " Java" 를 "Hi," 의 뒤에 붙여라. = "Hi, Java"

		System.out.println(s1.concat(s2) + "!"); // " Java"를 "Hi, Java" 뒤에 붙여라. = "Hi, Java Java!"
		System.out.println(s1.toLowerCase() + "!"); // 전부 다 소문자로 = "hi, java!"
		System.out.println(s1.substring(4, 8) + "!"); // "Hi, Java"의 4,5,6,7,8 번째 문자를 호출 = Java!

		String s3 = " "; // 공백이 있는 문자열
		System.out.println(s3.isEmpty()); // 문자열 길이가 0이면 true = false
		System.out.println(s3.isBlank()); // 문자열 길이가 0 혹은 공백이 있으면 true = true

		String s4 = ""; // 공백이 없는 문자열
		System.out.println(s4.isEmpty()); // true
		System.out.println(s4.isBlank()); // 문자열 길이가 0이어서 true

		String s5 = "*-*";
		System.out.println(s5.repeat(10)); // 문자열을 10면 반복해서 출력

		System.out.println(s2.trim().indexOf("v")); //

		// String4Demo
//		int i = 7;
//		System.out.println("Java " + i);
//		System.out.println("Java " + 7);
//		System.out.println(7 + 1 + "Java " + 7 + 1); // 앞에는 숫자라 덧셈으로 8, java 부터는 문자열로 바껴서 7과 1은 문자열로 인식해 71

	}

}
