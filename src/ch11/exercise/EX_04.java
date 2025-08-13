package ch11.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EX_04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> scores = new ArrayList<>();

		int score = 0;
		while (true) {
			System.out.println("점수를 입력하세요 : ");
			score = in.nextInt();
			if (score > 100) {
				System.out.println("점수를 다시 입력하세요 : ");
				score = in.nextInt();
			} else if (score < 0) {
				break;
			}
			scores.add(score);
//			
		}
		System.out.printf("전체 학생은 %d명이다.\n", scores.size());
		System.out.println("학생들의 성적 : " + scores);

		System.out.println();
		int max = Collections.max(scores);
		for (int i = 0; i < scores.size(); i++) {
			if (scores.get(i) >= (max - 10)) {
				System.out.println(i + "번 학생의 성적은 " + scores.get(i) + "점이며 등급은 A이다.");
			} else if ((max - 10) > scores.get(i) && scores.get(i) >= (max - 20)) {
				System.out.println(i + "번 학생의 성적은 " + scores.get(i) + "점이며 등급은 B이다.");
			} else if ((max - 20) > scores.get(i)) {
				System.out.println(i + "번 학생의 성적은 " + scores.get(i) + "점이며 등급은 C이다.");
			}
		}

	}

}
