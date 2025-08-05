package ch03;

import java.util.Scanner;

public class MultiIfDemo2 {

	public static void main(String[] args) {
//		< scanner 를 선언한다. >
		Scanner in = new Scanner(System.in);

//		< 점수를 입력하라는 출력문을 실행한다. >
		System.out.println("점수를 입력하세요 : (1 ~ 100) ");

//		< 점수를 입력 받는다. >
		int score = in.nextInt();
		String grade = "";

//		< 다중 if 문으로 입력 받은 점수의 학점을 계산한다. >
		if (score >= 90 && score <= 100) {
			if (score >= 90 && score < 95) {
				grade = "A0";
			} else {
				grade = "A+";
			}
		} else if (score >= 80 && score < 90) {
			if (score >= 80 && score < 85) {
				grade = "B0";
			} else {
				grade = "B+";
			}
		} else if (score >= 70 && score < 80) {
			if (score >= 70 && score < 75) {
				grade = "C0";
			} else {
				grade = "C+";
			}
		} else {
			grade = "F";
		}

//		< 학점을 출력한다. >
		System.out.println("당신의 학점은 " + grade + "입니다.");

	}

}
