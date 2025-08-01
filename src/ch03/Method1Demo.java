package ch03;

public class Method1Demo {

	public static void main(String[] args) {

		System.out.println("1부터 10까지 합은 " + hab(1, 10));
		System.out.println("10부터 100까지 합은 " + hab(10, 100));
		System.out.println("100부터 1000까지 합은 " + hab(100, 1000));
	}

	public static int hab(int start, int stop) {
		int sum = 0;
		for (int i = start; i <= stop; i++) {
			sum = sum + i; // sum += i;
		}
		return sum;

	}

}
