package myStudy.TextbookTest;

import java.util.HashMap;
import java.util.Map;

public class Ch15_09 {

	public static void main(String[] args) {

//		HashMap에 아이디(String)와 점수(Integer)가 저장되어 있습니다. 
//		실행 결과와 같이 평균 점수, 최고 점수, 최고 점수를 받은 아이디를 출력하도록 코드를 작성해보세요.
//		
//		실행 결과
//		평균 점수: 91
//		최고 점수: 96
//		최고 점수를 받은 아이디: blue

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null; // 최고 점수를 받은 아이디를 저장하는 변수
		int maxScore = 0; // 최고 점수를 저장하는 변수
		int totalScore = 0; // 점수 합계를 저장하는 변수

		// 여기에 코드를 작성하세요.

		System.out.println(map);
		System.out.println(map.size());

		for (Map.Entry<String, Integer> en : map.entrySet()) {
			int score = en.getValue();
			totalScore += score;

			if (score > maxScore) {
				maxScore = score;
				name = en.getKey();
			}
		}
		double avg = totalScore / map.size();

		System.out.println("평균 점수: " + avg);
		System.out.println("최고 점수: " + maxScore);
		System.out.println("최고 점수를 받은 아이디: " + name);

	}

}
