package ch11;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> set = Set.of("포도", "수박", "사과", "키위", "망고");
		Set<String> fruits = new HashSet<>(set);
		System.out.println(fruits);

		System.out.println();
		fruits.add(null);
		System.out.println(fruits);

		System.out.println();
		fruits.remove("망고");
		System.out.println(fruits);

		System.out.println();
		TreeSet<String> fruits2 = new TreeSet<String>(set);
		System.out.println(fruits2);
		System.out.println(fruits2.lower("수박")); // "수박" 앞에 있는 걸 출력. => "사과"
		System.out.println(fruits2.higher("키위"));

	}

}
