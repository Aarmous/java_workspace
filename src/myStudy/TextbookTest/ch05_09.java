package myStudy.TextbookTest;

import java.util.Arrays;
import java.util.Scanner;

public class ch05_09 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String msg = """
				ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
				1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
				ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
				선택>
				""";
		String me = ""; // 메뉴
		int c = 0; // 학생수
		int[] sco = null;
		while (true) {
			System.out.println(msg);
			me = in.nextLine();
			if (me.equals("5")) {
				System.out.println("프로그램 종료");
				break;
			} else if (me.equals("1")) {
				System.out.println("학생수> ");
				c = Integer.parseInt(in.nextLine());
				sco = new int[c];
			} else if (me.equals("2")) {
				for (int i = 0; i < c; i++) {
					System.out.printf("점수[%d]> ", i + 1);
					sco[i] = Integer.parseInt(in.nextLine());
				}
			} else if (me.equals("3")) {
				for (int j = 0; j < c; j++) {
					System.out.printf("학생[%d] : %d 점\n", j + 1, sco[j]);
				}
			} else if (me.equals("4")) {
				int first = Arrays.stream(sco).max().getAsInt();
				System.out.println("최고 점수 : " + first);
				int sum = 0;
				for (int i : sco) {
					sum += i;
				}
				double avg = sum / (double) c;
				System.out.println("평균 점수 : " + avg);
			}

		}

	}

}
