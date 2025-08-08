package ch09.exercise;

public class PT_3 {

	public static void main(String[] args) {

		// 아래 것과 같은 코딩 : foreach문 사용
		double[][] interests = { { 3.2, 3.1, 3.2, 3.0 }, { 2.9, 2.8, 2.7, 2.6 }, { 2.7, 2.6, 2.5, 2.7 } };

		double sum1 = 0.0; // 1년 네 분기의 합
		double sum2 = 0.0;
		int year = 0;
		for (double[] a : interests) {
			for (double b : a) {
				sum1 += b;
			}
			year++;
			System.out.printf("%d차년도 평균 이자율 = %.2f%%\n", year, sum1 / 4);
			sum2 += sum1;
			sum1 = 0;
		}
		System.out.printf("%d년간 평균 이자율 = %.2f%%\n", year, sum2 / 12);

		// 위에 것과 같은 코딩 : for문 사용
//		double[][] interests = { { 3.2, 3.1, 3.2, 3.0 }, { 2.9, 2.8, 2.7, 2.6 }, { 2.7, 2.6, 2.5, 2.7 } };
//		double[] sum1 = { 0.0, 0.0, 0.0 };
//		double sum2 = 0.0;
//
//		for (int i = 0; i < interests.length; i++) {
//			for (int j = 0; j < interests[i].length; j++) {
//				sum1[i] += interests[i][j];
//			}
//			System.out.printf("%d차년도 평균 이자율 = %.2f%%\n", i + 1, sum1[i] / 4);
//			sum2 += sum1[i];
//		}
//		System.out.printf("%d년간 평균 이자율 = %.2f%%\n", sum1.length, sum2 / 12);

	}

}
