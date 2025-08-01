package ch05;

public class IncrementDemo {

	public static void main(String[] args) {
		int[] x = { 5 };
		System.out.println("메서드 호출 전 x[0] : " + x[0]);
		increment(x);
		System.out.println("메서드 호출 후 x[0] : " + x[0]);
	}

	public static void increment(int[] n) {
		System.out.println("increment 메서드 시작 n[0] : " + n[0]);
		n[0]++;
		System.out.println("increment 메서드 종료 n[0] : " + n[0]);

	}

}
