package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();

		q.offer(10);
		q.offer(20);
		q.offer(30);

		System.out.println("# Queue");
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}

	}

}
