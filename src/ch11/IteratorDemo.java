package ch11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		Collection<String> list = Arrays.asList("다람쥐", "개구리", "나비"); // 이건 사이즈가 정해진 배열을 생성
//		list.add("라마");
//		list.add("나비");		// 정적배열이라, 추가 불가능
		System.out.println(list.size());

		System.out.println();
		Collection<String> list1 = new ArrayList<>(Arrays.asList("다람쥐", "개구리", "나비")); // 이건 동적 배열을 생성
		list1.add("라마");
		list1.add("나비"); // 동적배열이라, 추가 가능
		System.out.println(list1.size());

		System.out.println();
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println();
		Iterator<String> iterator1 = list1.iterator();
		while (iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}

		System.out.println();
		list1.remove("나비"); // 현재 "나비"가 2개 들어있는데, 앞에것을 지운다.
		Iterator<String> iterator2 = list1.iterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}

	}

}
