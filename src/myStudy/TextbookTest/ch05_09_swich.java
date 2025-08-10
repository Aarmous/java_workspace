package myStudy.TextbookTest;

import java.util.Arrays;
import java.util.Scanner;

public class ch05_09_swich {

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
			switch (me) {
            case "1" -> {
                System.out.print("학생수> ");
                c = Integer.parseInt(in.nextLine());
                sco = new int[c];
            }
            case "2" -> {
                if (sco == null) {
                    System.out.println("먼저 학생 수를 입력하세요.");
                    break;
                }
                for (int i = 0; i < c; i++) {
                    System.out.printf("점수[%d]> ", i + 1);
                    sco[i] = Integer.parseInt(in.nextLine());
                }
            }
            case "3" -> {
                if (sco == null) {
                    System.out.println("먼저 점수를 입력하세요.");
                    break;
                }
                for (int j = 0; j < c; j++) {
                    System.out.printf("학생[%d] : %d 점\n", j + 1, sco[j]);
                }
            }
            case "4" -> {
                if (sco == null) {
                    System.out.println("먼저 점수를 입력하세요.");
                    break;
                }
                int first = Arrays.stream(sco).max().getAsInt();
                System.out.println("최고 점수 : " + first);
                int sum = 0;
                for (int i : sco) {
                    sum += i;
                }
                double avg = sum / (double) c;
                System.out.println("평균 점수 : " + avg);
            }
            case "5" -> {
                System.out.println("프로그램 종료");
                return; // break 대신 return을 사용하면 즉시 main 종료
            }
            default -> System.out.println("올바른 번호를 선택하세요.");
        }

		}

	}

}
