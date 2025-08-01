package ch03;

public class MyMathDemo {

	public static void main(String[] args) {
		MyMath math = new MyMath(); // 계산기 객체 생성
		System.out.println(math.add(2, 3));
		System.out.println(math.sub(2, 3));
		System.out.println(math.mult(2, 3));
		System.out.println(math.div(2, 3));
	}

}
