package ch11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo {

	public static void main(String[] args) {
		String[] fruits = { "포도", "수박", "사과", "키위", "망고" };
		List<String> list = Arrays.asList(fruits);

		System.out.println("그냥출력 : " + list);
		Collections.sort(list);
		System.out.println("오름차순 : " + list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("내림차순 : " + list);

		Collections.reverse(list);
		System.out.println("앞에 순서를 무조건 뒤집어 : " + list);

		// Collections.sort는 List만 사용 가능(set, map 다 안됨)
	}

}
