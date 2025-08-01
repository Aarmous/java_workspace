package ch03;

public class OverLoading {

	public static void main(String[] args) {
		int i = 1, j = 10, k = 20;
		System.out.println(max(i, j));
		System.out.println(max(i, j, k));

		long l1 = 1000000L, l2 = 2000000L, l3 = 3000000L;
		System.out.println(max(l1, l2));
		System.out.println(max(l1, l2, l3));
	}

	public static int max(int x, int y) {
		return (x > y) ? x : y;
	}

	public static double max(double x, double y) {
		return (x > y) ? x : y;
	}

	public static long max(long l1, long l2) {
		return (l1 > l2) ? l1 : l2;
	}

	public static int max(int x, int y, int z) {
		return max(max(x, y), z);
	}

	public static long max(long l1, long l2, long l3) {
		return max(max(l1, l2), l3);
	}

}
