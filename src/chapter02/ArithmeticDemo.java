package chapter02;

public class ArithmeticDemo {

	public static void main(String[] args) {
//		long l = 100L;
//		int i = 10;
//
//		long result = l + i;
//		System.out.printf("%d 와 %d 의 + 연산 결과는 %d 입니다. \n", l, i, result);
//
//		double d = 100.0;
//		int i1 = 10;
//
//		double result1 = d + i1;
//		System.out.printf("%f 와 %d 의 + 연산 결과는 %f 입니다. \n", d, i1, result1);

////		< 오버플로우 >
//		int a = 1000000;
//		int b = 2000000;
//
//		int res = a * b;
//		System.out.printf("%d 와 %d 의 * 연산 결과는 %d 입니다. \n", a, b, res);
//
////		< 언더플로우 >
//		int a = -1000000;
//		int b = 2000000;
//
//		int res = a * b;
//		System.out.printf("%d 와 %d 의 * 연산 결과는 %d 입니다. \n", a, b, res);
//		

//		< 해결 >   a 와 b 중 하나를 long 으로 바꾸면, 자동형변환에 의해 결과값이 long으로 나온다. 
//		int a = 1000000;
//		int b = 2000000;
//
//		long res = (long) a * b;
//		System.out.printf("%d 와 %d 의 * 연산 결과는 %d 입니다. \n", a, b, res);
//
//		< 실수를 연산할 때 오차 나오는 예제 >  float 보다는 double 이 오차범위가 적지만, 그래도 double 에도 연산 오차범위가 있다. 
//		int apple = 1;
//		double pieceUnit = 0.1;
//		int number = 7;
//
//		double res2 = apple - pieceUnit * number;
//		System.out.println(res2);

//		< 나누기, 나머지 연산 (0, 0.0 나누거나 나머지 연산 주의 )>
//		int res3 = 5 / 0;
//		System.out.println(res3);

//		int zero = 0;
//		double zero1 = 0.0;
//		System.out.println(5 / zero1); // Infinity
//		System.out.println(5 % zero1); // NaN

//		< 정수와 정수의 나눗셈 > 문제
//		int res3 = 4 / 3;
//		double res6 = 4 / 3;
//		System.out.println(res3);
//		System.out.println(res6);

//		< 정수와 정수의 나눗셈 > 해결
		int res3 = 4 / 3;
		double res6 = 4 / (double) 3;
		System.out.println(res3);
		System.out.println(res6);

//		< 짝수 홀수 % 연산 >
//		int three = 3;
//		int res4 = three / 2;
//		System.out.println(res4);
//
//		int four = 4;
//		int res5 = four % 2;
//		System.out.println(res5);

	}

}
