package ch05;

import java.util.Arrays;

public class EX_4 {

	public static void main(String[] args) {

//		< 가위 바위 보를 10번 랜덤으로 출력하는 프로그램>

		String[] name = { "가위", "바위", "보" };
		System.out.println(name);
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.asList(name).indexOf("가위"));
		System.out.println(name[2]);

		for (int i = 0; i < 10; i++) {
			int index = (int) (Math.random() * 3);
			System.out.println((i + 1) + ". " + name[index]);
		}

	}

}
