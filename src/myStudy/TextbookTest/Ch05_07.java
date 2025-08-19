package myStudy.TextbookTest;

public class Ch05_07 {

	public static void main(String[] args) {
		// 배열 내용 중, 최대값 구하
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2 };
		for(int i=0; i<array.length; i++) {
			if(max<array[i]) {
				max = array[i];
			}	
		}
		System.out.println("max: " + max);

	}

}
