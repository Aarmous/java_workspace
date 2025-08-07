package ch08;

import java.util.Arrays;

public class SystemDemo {

	public static void main(String[] args) {
		int[] src = { 1, 2, 3, 4, 5, 6 };
		int[] dst = { 100, 200, 300, 400, 500, 600, 700 };

		System.arraycopy(src, 3, dst, 4, 3);
		System.out.println(Arrays.toString(dst));

		System.out.println(System.currentTimeMillis());
		System.out.println(System.nanoTime());
		System.out.println(System.getenv("JAVA_HOME"));

	}

}
