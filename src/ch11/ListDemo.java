package ch11;

import java.util.Arrays;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		String[] animal1 = { "사슴", "호랑이", "바다표범", "곰" };
		List<String> animal2 = Arrays.asList(animal1);
		// animal2 는 add도 안되고, remove도 안된다.
//		animal2.add("앵무새");  // collection 의 메소드 : 맨 뒤에 추가
//		animal2.add(1, "앵무새");  //  list 의 메소드 : 해당 인덱스에 추가 
		animal2.set(0, "앵무새"); // 0번째에 있는 내용을 "앵무새"로 셋팅해라.
		for (int i = 0; i < animal2.size(); i++) {
			System.out.println(animal2.get(i)); // "사슴"이 "앵무새"로 바껴서 출력
		}

		System.out.println();
		animal2.sort((o1, o2) -> o1.length() - o2.length());
		for (int i = 0; i < animal2.size(); i++) {
			System.out.println(animal2.get(i)); // 글자 갯수의 오름차순으로 출력
		}

		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
//		numbers.set(0, 10); 
		// List.of로 만든 녀석은 set도 안되고 sort도 안된다. (add, remove 다 안된다.)
	}

}
