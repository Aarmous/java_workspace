package ch10;

public class LambdaDemo {

	public static void main(String[] args) {
//		(a, b) -> a > b ? a : b;

		Object obj = new Object() {
			int max(int a, int b) {
				return a > b ? a : b;
			}

		};

//		int value = obj.max(2,3);  // Error

		MyFunction f = (a, b) -> a > b ? a : b;
		// 위에 한 줄 식과, 밑에 주석 여러 줄이 같은 식이다. (람다식)

//		MyFunction f = new MyFunction() {
//			@Override
//			public int max(int a, int b) {  //  익명 클래스 안에 있는 익명 메소드 
//				return a > b ? a : b;
//			};
//		};

		int value = f.max(3, 5);
		System.out.println(value);

		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

		PrintFunction pf = (name, i) -> System.out.println(name + "=" + i);
		// 위에 식과 아래 식은 똑같다. (람다식)
//		PrintFunction pf = new PrintFunction() { // 이름없는 클래스 (익명 클래스)
//
//			@Override
//			public void printVar(String name, int i) { // 이름없는 메소드 (익명 메소드)
//				System.out.println(name + "=" + i); // 내 맘대로 구현
//			}
//
//		};

		pf.printVar("hello", 3);

		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

		SquareFunction sf = (int x) -> x * x;

//		SquareFunction sf = new SquareFunction() {
//
//			@Override
//			public int square(int x) {
//				// TODO Auto-generated method stub
//				return x * x;
//			}
//			
//		};

		System.out.println(sf.equals(3));

		// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

		YourFunction yf = (a, b) -> a < b ? a : b;

	}

}

@FunctionalInterface // 이거는 밑에 추상 메소드로 1개만 가질 수 있다. (2개부터 Error)
interface MyFunction {
	int max(int a, int b);
}

@FunctionalInterface
interface PrintFunction {
	void printVar(String name, int i);
}

@FunctionalInterface
interface SquareFunction {
	int square(int x);
}

@FunctionalInterface
interface RollFunction {
	int roll();
}

@FunctionalInterface
interface YourFunction {
	int min(int a, int b);
}
