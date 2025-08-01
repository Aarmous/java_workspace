package chapter02;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

//		 < 수업 내용 >
//		System.out.print("정수 값을 입력하세요 : ");
//		int x = in.nextInt();
//		System.out.printf("당신이 입력한 값은 %d 입니다. \n", x);
//
//		System.out.print("실수 값을 입력하세요 : ");
//		float f = in.nextFloat();
//		System.out.printf("당신이 입력한 값은 %f 입니다. \n", f);

//		System.out.print("정수 값을 입력하세요 : ");
//		String s = in.nextLine();
//		System.out.printf("당신이 입력한 값은 %s 입니다. \n", s);
//		int number = Integer.parseInt(s);
//		System.out.printf("s + 10 은 %d 입니다. \n", number + 10);

//		 < 새로 해보기 >
//		System.out.print("정수 값을 입력하세요 : ");
//		int x = in.nextInt();
//		System.out.printf("당신이 입력한 값은 %d 입니다. \n", x);
//		System.out.printf("x + 10 은 %d 입니다. \n", x + 10);

//		 < 내가 해본거 >
//		System.out.print("실수 값을 입력하세요 : ");
//		float f = in.nextFloat();
//		System.out.printf("당신이 입력한 값은 %f 입니다. \n", f);
//		System.out.printf("f + 10 은 %-4.2f 입니다. \n", f + 10);

//		 < 선생님이 하신거 >
//		System.out.print("실수 값을 입력하세요 : ");
//		String s = in.nextLine();
//		System.out.printf("당신이 입력한 값은 %s 입니다. \n", s);
//		double number1 = Double.parseDouble(s);
//		System.out.printf("s + 10 은 %f 입니다. \n", number1 + 10);

//		< 7/29 화 오전 수업 > 
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.printf("%d * %d 은 %d 입니다.", x, y, x * y);

	}

}
