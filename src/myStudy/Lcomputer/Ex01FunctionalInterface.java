package myStudy.Lcomputer;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Ex01FunctionalInterface {

	/*
	 * 문제 1. BiPredicate BinaryOperator IntConsumer IntFunction IntPredicate
	 * IntUnaryOperator IntBinaryOperator IntToDoubleFunction ToIntFunction
	 * ToIntBiFunction
	 * 
	 * 위 함수형 인터페이스들을 이용해 람다식을 작성하고 출력하세요.
	 */

	public static void main(String[] args) {
		System.out.println("< 익명클래스 >");
		Supplier<Integer> as = new Supplier<Integer>() {
			@Override
			public Integer get() {
				return (int) (Math.random() * 10);
			}
		};
		System.out.println(as.get()); // 0~10까지 랜덤 정수 출력

		System.out.println("< Supplier >");
		Supplier<Integer> s = () -> (int) (Math.random() * 10);
		System.out.println(s.get());
		System.out.println();

		System.out.println("< Consumer >");
		Consumer<Integer> c = i -> System.out.println(i);
		c.accept(7);
		System.out.println();

		System.out.println("< Function >");
		Function<Integer, Double> f = i -> i / 2.0;
		System.out.println(f.apply(5));
		System.out.println();

//		System.out.println("< Predicate >");
//		Predicate<Integer> p = i -> i == 22;
//		System.out.println(p.test(15));
//		Predicate<Integer> p2 = i -> i < 10;
//		Predicate<Integer> p3 = i -> i < 20;
//		Predicate<Integer> p4 = p.or(p2.negate().and(p3));
//		System.out.println(p4.test(19));
//		Predicate<String> p5 = Predicate.isEqual("ok");
//		System.out.println(p5.test("ok"));
//		System.out.println();
//		
//		System.out.println("< UnaryOperator >");
//		UnaryOperator<Integer> u = i -> i*10;
//		System.out.println(u.apply(7));
//		System.out.println();
//		
//		System.out.println("< BiConsumer >");
//		BiConsumer<String, Integer> bc = (str, i) -> System.out.println(str + ": " + i);
//		bc.accept("A", 7);
//		BiConsumer<String, Integer> bc2 = (str, i) -> System.out.println(str + "*10: " + (i * 10));
//		bc.andThen(bc2).accept("A", 8);
//		System.out.println();
//		
//		System.out.println("< BiFunction >");
//		BiFunction<Integer, Integer, Double> bf = (i1, i2) -> i1/(double)i2;
//		System.out.println(bf.apply(5, 2));
//		System.out.println();
//		
//		System.out.println("< IntSupplier >");
//		IntSupplier is = () -> (int)(Math.random()*20);
//		System.out.println(is.getAsInt());
//		System.out.println();
//		
//		System.out.println("< IntToLongFunction >");
//		IntToLongFunction it = i -> i*10000000000L;
//		System.out.println(it.applyAsLong(7));
//		System.out.println();
//		
//		System.out.println("< BooleanSupplier >");
//		boolean bool = true;
//		BooleanSupplier bs = () -> !bool;
//		System.out.println(bs.getAsBoolean());
//		System.out.println();
//		
//		System.out.println("< ObjIntConsumer >");
//		ObjIntConsumer<LocalDateTime> oi = (time, i) -> System.out.println(time.plusYears(i));
//		oi.accept(LocalDateTime.now(), 5);
//		System.out.println();
//		
//		System.out.println("< ToIntFunction >");
//		ToIntFunction<String> tif = str -> Integer.parseInt(str);
//		System.out.println(tif.applyAsInt("777") + 10);
//		System.out.println();

	}

}
