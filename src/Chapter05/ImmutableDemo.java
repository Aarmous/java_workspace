package Chapter05;

public class ImmutableDemo {

	public static void main(String[] args) {
		// String 은 불변 객체다. 그래서 side effect 가 일어나지 않는다.

		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println(str1 == str2); // 같은 주소를 공유해서 true 가 뜬다.

		str2 = "World"; // 원래는 같은 주소를 공유하다가, 새로운 주소로 새로 생성.

		System.out.println(str1 == str2); // 그래서 이제는 같이 않기에 false 가 뜬다.
		System.out.println(str1 + ":" + str2);

		String str3 = new String("Hello");
		String str4 = new String("Hello");
		System.out.println(str3 == str4); // 객체 주소가 서로 다르다.
		System.out.println(str3.equals(str4)); // 얘네 둘은 값이 같다. 그러나 같은 객체는 아니다.
	}

}
