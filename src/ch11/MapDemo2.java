package ch11;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		Map<String, Integer> map = Map.of("사과", 5, "바나나", 2, "포도", 10);
		Map<String, Integer> fruits = new HashMap<>(map);

		System.out.println(map);
		System.out.println(fruits);

		System.out.println();
		fruits.put("딸기", 6); // 추가   // HashMap 에서는 null을 넣을 수 있다. 
		fruits.put("사과", 1); // 수정
		System.out.println(fruits.size());
		System.out.println(fruits.keySet());
		System.out.println(fruits.values());
		System.out.println(fruits.entrySet());

		System.out.println();
		System.out.println(fruits.containsKey("사과"));

		System.out.println();
		fruits.forEach((x, y) -> System.out.println(x + " : " + y));

		System.out.println();
		Set<Map.Entry<String, Integer>> fE = fruits.entrySet();
		for (Map.Entry<String, Integer> entry : fE) {
			entry.setValue(10);  
			//Map에서는 key를 수정할 때 일일이 해야 하는데, 
			//Map을 Set으로 바꾼 다음에 setValue와 foreach를 사용하면 한번다 다 수정 가능
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		System.out.println();
		Map<String, Integer> fr1 = new HashMap<>(map);
		Map<String, Integer> fr2 = new Hashtable<>(map);

		fruits.put(null, 6); // 추가   // HashMap 에서는 null을 넣을 수 있다. 
		
		
	}

}
