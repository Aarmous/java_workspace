package Chapter05;

public class BeforeEnumDemo {

	public static void main(String[] args) {
//		System.out.println(People.MALE);
//		System.out.println(People.FEMALE);
//		System.out.println(People.ONE);
//		System.out.println(People.TWO);
//
//		System.out.println(People.FEMALE == People.ONE);

		System.out.println(Gender.MALE);
		System.out.println(Gender.FEMALE);
		System.out.println(Num.ONE);
		System.out.println(Num.TWO);
//
//		String str = "FEMALE";
//		System.out.println(Gender.FEMALE.equals(str));

		People p = new People();
		p.age = 21;
		p.gender = Gender.MALE;

		if (p.age >= 18) {
			System.out.println("성인입니다.");

		}
		if (p.gender == Gender.MALE) {
			System.out.println("남성입니다.");
		}

	}

}

//class People {
//	// 정적 상수 = 클래스 상수
//	static final int MALE = 0;
//	static final int FEMALE = 1;
//	static final int ONE = 1;
//	static final int TWO = 2;
//
//	// 인스턴스 상수
//	final int KIND = 0;
//	final int NUM = 1;
//}

class People {
	int age;
	Gender gender;
}

//enum Gender {
//	MALE, FEMALE;
//}

//	< 출력할 때 MALE 가 아니라 남성 으로 출력되게 하는 방법 >
enum Gender {
	// 상수
	MALE("남성"), FEMALE("여성"); // 얘네는 힙영역에 들어가는 객체들이다.
	// 필드

	String gender;

	// 생성자
	Gender(String gender) {
		this.gender = gender;
	}

	// 메서드
	@Override
	public String toString() {
		return gender;
	}
}

enum Num {
	ONE, TWO
}
