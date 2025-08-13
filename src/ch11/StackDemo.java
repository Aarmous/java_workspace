package ch11;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		System.out.println(stack.size());
		System.out.println(stack.empty());

		System.out.println();
		stack.push("사과");
		stack.push("바나나");
		stack.push("체리");
		System.out.println(stack.size());
		System.out.println(stack.empty());
		System.out.println(stack.search("체리")); // 가장 늦게 넣은 녀석의 인덱스가 1이다.

		System.out.println();
		while (!stack.empty()) {
			System.out.println(stack.pop());
		}
		System.out.println(stack.size());
		System.out.println(stack.empty());

		System.out.println();
		Stack<Integer> s2 = new Stack<>();
		s2.add(10);
		s2.add(20);
		s2.add(0, 100);
		// stack의 부모 collection의 메소드여서, 여기서 사용할 순 있지만, stack의 특성을 어기는 방법이기에 웬만하면 쓰지 마라

		while (!s2.empty()) {
			System.out.println(s2.pop());
		}

	}

}
