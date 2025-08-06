package myStudy.TextbookTest;

import java.util.Arrays;

public class ch05_08 {

	public static void main(String[] args) {
		// 전체 합, 평균 구하기 
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};

	System.out.println(array[0][0]);
	System.out.println(array[0].length);
	System.out.println(Arrays.toString(array[0]));
		
	int sum = 0;
	int count = 0;
	for (int[] f : array) {
		for (int g : f) {
			sum += g;
			count++;
		}
	}
	
//	for (int a = 0; a<array.length; a++) {
//		for (int b = 0; b<array[a].length; b++) {
//		sum += array[a][b];
//		count++;
//		}
//	}
	
//	int sum0 = 0;
//	for (int i : array[0]) {
//		sum0 += i;
//	}
//	
//	int sum1 = 0; 
//	for (int j : array[1]) {
//		sum1 += j;
//	}
//	
//	int sum2 = 0;
//	for (int k : array[2]) {
//		sum2 += k;
//	}
//	
//	int sum = sum0 + sum1 + sum2;
	System.out.println("배열 전체 합 : " + sum); //881
	
	double avg;
//	int count = 0;
//	for(int l=0; l<array.length; l++) {
//		count += array[l].length;
//	}
	avg = sum/(double)count;
	System.out.println("배열 전체 평균 : " + avg); //88.1
	
	}

}
