package dataStructure;

public class PerformanceDemo {
	public static void main(String[] args) {
		int size = 1000000;
		int[] arr = new int[size];

		System.out.println(sample(arr, size));

		int[] arr2 = new int[100];
		sum(arr2, arr2.length);
		int[] arr3 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		sequentialSearch(arr3.length, arr3, 8);

		int[][] arr4 = { { 1, 2, 3 }, { 2, 3, 4 }, { 3, 4, 5 } };
		sum2(arr4);

	}

	static int sample(int[] data, int n) {
		int k = n / 2;
		int result = data[k];
		System.out.println("수행횟수");
		return result;
	}

	static int sum(int[] data, int n) {
		int total = 0;

		for (int i = 0; i < n; i++) {
			total = total + i;
			System.out.println((i + 1) + "번 수행됨");
		}

		return total;
	}

	static int sequentialSearch(int n, int[] data, int target) {
		for (int i = 0; i < n; i++) {
			System.out.println((i + 1) + " 번 수행됨");
			if (data[i] == target) {
				return i;
			}
		}
		return -1;
	}

	static int sum2(int[][] data) {
		int total = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.println((j + 1) + " 번 수행됨");
				total = total + data[i][j];
			}
		}
		return total;
	}
}