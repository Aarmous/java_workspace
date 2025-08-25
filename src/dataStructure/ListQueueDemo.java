package dataStructure;

public class ListQueueDemo {

	public static void main(String[] args) {
		ListQueue<Integer> q = new ListQueue<>();

		System.out.println(q.poll());

		q.offer(10);
		System.out.println(q.size());
		q.offer(20);
		System.out.println(q.size());
		q.offer(30);
		System.out.println(q.size());

		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
	}

}
