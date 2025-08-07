package ch08;

public class StringBuilerDemo {

	public static void main(String[] args) {
		String s = "hi";
		String ss = "hello";

//		s = s + "!";

		System.out.println(s.hashCode());
		System.out.println(ss.hashCode());

		String s1 = new String("hello");
		String s2 = new String("hello");

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		StringBuilder sb = new StringBuilder("hello, world");
		System.out.println(sb);
		System.out.println(sb.hashCode());

		sb.append("!");
		System.out.println(sb);
		System.out.println(sb.hashCode());

		sb.replace(7, 11, "java");
		System.out.println(sb);
		System.out.println(sb.hashCode()); // 793589513 -> 메모리 상의 주소 값

	}

}
