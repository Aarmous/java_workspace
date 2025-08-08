package ch08;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		String s = "a b c d";

		StringTokenizer st = new StringTokenizer(s);
		System.out.println(st);
		System.out.println(st.countTokens()); // 4개 있다.

		while (st.hasMoreTokens()) { // 다음꺼 있어? 읽어. 또 있어? 읽어. 있을때까지 읽어.
			// 토큰이 있는동안 계속 돌리고 읽어.
			System.out.println(st.nextToken());
		}

		String s1 = "a b, c d, e f";

		StringTokenizer st1 = new StringTokenizer(s1, ",");
		// 콤마를 구분점으로 하니까, 총 3개 들어있다.
		System.out.println(st1.countTokens()); // 3개
	}

}
