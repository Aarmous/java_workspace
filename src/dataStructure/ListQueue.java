package dataStructure;

public class ListQueue<E> {

	// 필드
	private Node<E> front;
	private Node<E> rear;
	private int size;

	// 생성자
	public ListQueue() {
		front = rear = null;
		size = 0;
	}

	// offer, poll, peek
	public void offer(E item) { // 단일연결리스트의 addLast()
		Node<E> newNode = new Node<>(item, null);
		if (isEmpty()) {
			front = rear = newNode;
		} else {
			rear.next = newNode;
			rear = newNode;
		}
		size++;
	}

	public E poll() { // 단일연결리스트의 removeFrist() / underflow

		if (isEmpty()) {
			System.out.println("비었다.");
			return null;
		}
		// 지워지는 노드를 백업 받아놓음
		Node<E> removedNode = front;
		// head 를 갱신
		front = front.next;
		// 지워지는 노드 정리
		removedNode.next = null;
		if (size == 1) {
			rear = null;
		}
		size--;
		return removedNode.item;
	}

	public E peek() { // 맨앞 노드의 아이템을 반환 / underflow
		return null;
	}

	// size, isEmpty
	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	// Node
	private class Node<E> {
		E item;
		Node<E> next;

		public Node(E item, Node<E> next) {
			this.item = item;
			this.next = next;
		}
	}

	void addFirst(E item) {
		// 1단계 : 새로운 노드를 생성한 후 node의 값을 설정한다음
		// 새로 생성된 노드가 맨 앞으로 가도록 한다.
		Node<E> newNode = new Node(item, null);

		// 2단계 : 현재 데이터가 없는 경우, 즉 빈 리스트인 경우
		// front 와 rear 모두 newNode 가 되도록 처리한다.
		// 리스트에 데이터가 있을 경우에는 front 만 새로 추가된 노드로 변경해준다.
		if (isEmpty()) {
			rear = newNode;
		}
		newNode.next = front;
		front = newNode;

		// 3단계
		// 데이터가 하나 추가되었기 때문에 리스트의 사이즈를 하나 증가시킨다.
		size++;
	}

}
