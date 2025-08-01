package chapter100;

import java.util.Scanner;

public class Aaaaa {

	public static void main(String[] args) {

//		<< 학생들의 점수를 입력 받아, 점수의 합계와 평균을 구해주는 프로그램 >>

		Scanner in = new Scanner(System.in);
		int[] scores = new int[100];

		// 표준입력장치에서 원하는 숫자만큼 점수를 입력받아서 배열에 저장, 종료하려면 -1을 입력
		// 입력받은 학생이 몇명인지 count
		System.out.printf("학생들의 점수를 입력하시고, 입력이 완료되면 -1을 입력하세요 : \n");
		int score = 0;
		int count = 0;
		while (true) {
			score = in.nextInt();
			scores[count] = score;
			count++;
			if (score >= 0) {
				continue;
			}
			break;
		}

		// 배열에서 count 해놓은 학생 수만큼 점수를 꺼내서 합계를 구하고, 평균을 구하여 출력
		int sum = 0;
		sum = sum + scores[count];
		System.out.printf("학생 %d의 점수의 합은 : %d입니다. \n", count, sum);

	}
}

//<  점수 입력때마다 숫자 나오게 하려는 거 (미완 실패) >
//int i = 1;
//System.out.printf("학생들의 점수를 입력하시고, 입력이 완료되면 -1을 입력하세요. \n%d.", i++);
//int score = 0;
//while (i < 5) {
//	score = in.nextInt();
//	System.out.printf("%d.\n", i++);
//}
