package dataStructure;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stk = new Stack<String>();

		stk.push("A");
		stk.push("B");
		stk.push("C");

		System.out.println("# Stack");
		while (!stk.empty()) {
			System.out.println(stk.pop());
		}

	}

}
