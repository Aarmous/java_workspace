package ch05;

public class StringDemo2 {

	public static void main(String[] args) {
		String str = "Hello, World";

		System.out.println(str);

		System.out.println(str.toLowerCase()); // (1) 진짜 소문자로 다 바뀐게 아니라, 소문자로 바뀐걸 잠깐 보여주고 없어진 것
		System.out.println(str.toUpperCase()); // 대문자로 바뀐 것만 보여주고 사라짐.

		str = str.toUpperCase(); // (2) 이제는 전부 대문자로 바꾼걸 다시 str에 넣은 것. 이제는 다 대문자

		System.out.println(str); // (1)그래서 여기서 보면 다시 대문자. (2)이제는 진짜 대문자를 보여줌.

		System.out.println(str.substring(0, 5)); // 앞에 네 글자를 보여줘.
		System.out.println(str.substring(5)); // 네 글자 뒤부터 다 보여줘.

	}

}
