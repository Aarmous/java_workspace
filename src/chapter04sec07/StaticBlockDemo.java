package chapter04sec07;

public class StaticBlockDemo {

	// 정적(= static = 클래스) 변수
	static int sumOneToTen;
	static {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		sumOneToTen = sum;
	}
	int any = 0;

	// 정적(= static = 클래스) 메서드
	public static void main(String[] args) {
		System.out.println(sumOneToTen); // 클래스 메서드에서 클래스 변수를 사용
//		System.out.println(any);   - any는 아직 태어나지도 않은 애라, 불러올 수 없다. Error  - 클래스 메서느에서 인스턴스 변수를 사용할 수 없음
//		System.out.println(sum);   Error  - 클래스 메서드에서 지역 변수를 사용할 수 없음
	}

}
