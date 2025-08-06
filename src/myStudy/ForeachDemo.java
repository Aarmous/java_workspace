package myStudy;

public class ForeachDemo {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println(arr[3]);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		for (int i : arr) {
			System.out.println(i);
		}
		
		// for문을 사용한 합 (밑에 foreach와 동일) 
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);

		// foreach문을 사용한 합 (위에 for와 동일) 
		int sum1 = 0;
		for (int num : arr) {
			sum1 += num;
		}
		System.out.println(sum1);
		
		
	}

}
