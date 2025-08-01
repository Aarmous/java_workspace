package chapter04sec07;

public class UtilDemo {

	public static void main(String[] args) {
		int result = Util.fourTimes(4);
		System.out.println(result);

	}

}

class Util {
	static int fourTimes(int i) {
		return 4 * i;
	}

	private Util() {

	}
}
