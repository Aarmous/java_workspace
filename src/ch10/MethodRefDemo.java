package ch10;

public class MethodRefDemo {

	public static void main(String[] args) {
		Pickable p;

//		p = (s, i) -> s.charAt(i);  // 이 식을 간소화 한 게 밑에 식
		p = String::charAt;

		System.out.println(p.pick("hello", 2));

		System.out.println();

		Utils utils = new Utils();
		int sum = utils.add(3, 5);

	}

}

@FunctionalInterface
interface Pickable {
	char pick(String s, int i);
}

class Utils {
	int add(int a, int b) {
		return a + b;
	}
}

@FunctionalInterface
interface Computable {
	int compute(int x, int y);
}