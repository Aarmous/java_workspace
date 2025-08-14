package ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleDemo {

	public static void main(String[] args) {
		List<Character> list = new ArrayList<>();
		for (char c = 'A'; c < 'H'; c++) {
			list.add(c);
		}

		System.out.println("최초의 리스트 : " + list);
		System.out.println();

		Collections.rotate(list, 3);
		System.out.println("3만큼 이동 리스트 : " + list);
		System.out.println();

		Collections.shuffle(list);
		System.out.println("셔플한 리스트 : " + list);

	}

}
