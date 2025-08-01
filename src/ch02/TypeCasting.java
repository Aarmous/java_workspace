package ch02;

public class TypeCasting {

	public static void main(String[] args) {
		// 묵시적, 자동 형변환 : 값 손실 없음
		double d1 = 5 * 3.14; // 연산에서 피연산자의 타입이 자동으로 형변환 5 => 5.0
		double d2 = 1; // 1 => 1.0 으로 자동 형변환
		double d = 3.14f;

		System.out.println(d1 + " 과 " + d2);

		// 명시적, 강제 형변환 : 값 손실 있음
		float f = (float) 3.14; // 3.14f 랑 같은 거
		byte b = (byte) 300; // 44

		System.out.println(f + ",  " + b + ",  " + d); // ctrl + alt + 방향키

		// 숫자를 문자로, 문자를 숫자로
		char c = 3 + '0'; // '0' 은 48 48+3=51
		int i = '3' - '0'; // '3' 은 51 51-48=3

		// 숫자를 문자열로, 문자를 문자열로
		String s = 3 + "";
		String s1 = '3' + "";

		System.out.println("문자 c : " + c + "," + i);
		System.out.println("문자열 s :" + s + "," + s1);

		// 문자열을 문자로
		System.out.println(s1.charAt(0));
		System.out.println("hello".charAt(1));
		System.out.println("안녕하세요".charAt(1));

		// 문자열을 숫자로(int, long, double)
		String str = "300";
		int value1 = Integer.parseInt(str);
		System.out.println(value1 + 1);

		str = "3000000000000"; // _ , L 문자 형식 들어가면 안됨
		long value2 = Long.parseLong(str);
		System.out.println(value2 + 1);

		str = "3.14";
		double value3 = Double.parseDouble(str);
		System.out.println(value3);
	}

}
