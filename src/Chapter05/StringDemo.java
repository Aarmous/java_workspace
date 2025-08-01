package Chapter05;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "J";
		String s2 = "C";

		String s3 = new String("J");
		String s4 = "j";

		System.out.println("s1 == s3 : " + (s1 == s3)); // 동일객체가 아니다. false - 주소가 다르니까
		System.out.println("s1.equals(s3) : " + s1.equals(s3)); // 동등 비교, true - 내용이 같다.

		System.out.println("s3.equalsIgnoreCase(s4) : " + s3.equalsIgnoreCase(s4)); // 대소문자 구분 없이 똑같다. true
		System.out.println("s1.compareTo(s2) : " + s1.compareTo(s2)); // 크기 비교, 사전 상 누가 앞에 있냐, +가 나오면 앞에가 크고,
		System.out.println("s2.compareTo(s1) : " + s2.compareTo(s1)); // -가 나오면 뒤에가 작다.
		System.out.println("s1.compareToIgnoreCase(s4) : " + s1.compareToIgnoreCase(s4)); // 대문자 소문자가 같다. 결과값:0

	}

}
