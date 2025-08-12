package ch10;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		IntPredicate even = x -> x % 2 == 0; // 짝수 홀수 구하는 거
		System.out.println(even.test(3) ? "짝수" : "홀수");
		System.out.println(even.test(4) ? "짝수" : "홀수");

		System.out.println();
		BiPredicate<Integer, Integer> bp = (x, y) -> x > y;
		System.out.println(bp.test(3, 5) ? "앞 숫자가 크다" : "뒤 숫자가 크다");
		System.out.println(bp.test(8, 5) ? "앞 숫자가 크다" : "뒤 숫자가 크다");

		System.out.println();
		Predicate<String> p = x -> x.equals("");
		System.out.println(p.test("hello") ? "빈 문자열" : "찬 문자열");
		System.out.println(p.test("") ? "빈 문자열" : "찬 문자열");

	}

}
