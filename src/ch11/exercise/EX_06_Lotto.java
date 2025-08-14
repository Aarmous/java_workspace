package ch11.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EX_06_Lotto {

	public static void main(String[] args) {
		// 1. 후보 숫자 생성
		List<Integer> nums = new ArrayList<>();
		for (int i = 1; i < 46; i++) {
			nums.add(i);
		}

		// 2. 숫자 섞기
		Collections.shuffle(nums);

		// 3. 앞에서 6개 추출 (복사해서 별도 리스트로 생성)
		List<Integer> lotto = new ArrayList<>(nums.subList(0, 6));

		// 4. 정렬
		Collections.sort(lotto);

		// 5. 출력
		System.out.println("행운의 번호 : " + lotto);

	}

}
