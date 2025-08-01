package Chapter05;

public class ArrayDemo {

	public static void main(String[] args) {
		// 배열 초기화 방법 1
//		int[] scores = { 92, 100, 85, 78, 69, 76, 88, 90, 100, 70 };
		// 배열 초기화 방법 2
//		int[] scores = new int[] { 92, 100, 85, 78, 69, 76, 88, 90, 100, 70 };
		// 배열 초기화 방법 3
		int[] scores;
		scores = new int[] { 92, 100, 85, 78, 69, 76, 88, 90, 100, 70 };

		// for 로 만든 코딩
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}

		// for-each loop 로 만든 코딩
//		int sum = 0;
//		for (int score:scores) {
//			sum = sum + score;
//		}

		System.out.printf("학생 %d명의 점수의 합은 %d 입니다. \n", scores.length, sum);
		System.out.printf("학생 %d명의 점수의 평균은 %.2f 입니다. \n", scores.length, (sum / (double) scores.length));

		// 배열의 출력

	}

}
