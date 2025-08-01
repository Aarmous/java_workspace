package ch03;

public class IncrementDemo2 {

	public static void main(String[] args) {
		RefValue ref = new RefValue();
		ref.x = 10;
		System.out.println("main에서 increment 호출 전 ref.x = " + ref.x);
		changeReference(ref);
		System.out.println("main에서 increment 호출 후 ref.x = " + ref.x);
	}

	static void changeReference(RefValue ref) {
		System.out.println("increment 메서드 시작 ref.x = " + ref.x);
		ref.x = 1000;
		System.out.println("increment 메서드 종료 ref.x = " + ref.x);
	}
}

class RefValue {
	int x;
}

//	
//	< 나 혼자 시험 >
//	public static void main(String[] args) {
//		RefValue ref = new RefValue();
//		ref.x();
//	}
//
//}
//
//class RefValue {
//	void x() {
//		System.out.println("움직입니다.");
//	}
//}
