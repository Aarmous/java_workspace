package ch03;

public class WhileDemo {

	public static void main(String[] args) {

		int count = 5;

		// 초기식
		int i = 0;
		while (i < count) {
			// 반복실행문
			System.out.println("loopi" + i);

			// 증강식
			i++;
		}

		for (int j = 0; j < count; j++) {
			System.out.println("loopj" + j);
		}

		int k = 0;
		while (true) {
			System.out.println("loopk" + k);
			k++;
			if (k >= count) {
				break;
			}
		}

	}

}







