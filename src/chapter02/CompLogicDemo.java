package chapter02;

public class CompLogicDemo {

	public static void main(String[] args) {
		int x = 0, y = 1;
//		System.out.println(x < y); // true
//		System.out.println(x < y && x == 0); // true
//		System.out.println(x > y); // false

//		< 쇼트 서킷 (논리 &&) >  조건식 1이 false 이면, 조건식 2는 조사하지 않고 성능개선 
//		System.out.println(x > y && 5 / 0 == 0);  // 에러 안 뜸 (쇼트서킷 증명) 
//		System.out.println5 / 0 == 0 && (x > y); // 에러 뜸 

//		< 쇼트 서킷 (논리 ||) >  조건식 1이 true 이면, 조건식 2를 조사하지 않고 성능개선 
		System.out.println(x < y || 5 / 0 == 0); // 에러 안뜸 (쇼트서킷 증명)

	}

}
