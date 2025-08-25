package dataStructure;

public class ArrList<E> {
	private E[] a; // E a[];
	private int size;

	public ArrList() {
		a = (E[]) (new Object[1]);// 최초로 크기가 1인 배열 생성해놓기(데이터는 없는 빈 배열)
		size = 0; // 빈 ArrList
	}

	// 삽입, 탐색, 삭제 연산 메서드 구현
	public boolean add(E e) { // 배열의 맨 마지막에 추가하는 연산
		if (length() == size()) {
			// 배열의 사이즈를 2배 증가시킨다. <==== (1. 여기 구현해보기)
			resize(length() * 2);
		}
		// 맨 마지막에 추가하고 배열의 size 를 증가시킨다. <==== (1. 여기 구현해보기)
		a[size] = e;
		size++;
		return true;
	}

	public boolean add(int index, E e) { // 배열의 중간, index 의 위치에 항목을 추가하는 연산
		if (length() == size()) {
			// 배열의 사이즈를 2배 증가시킨다. <==== (1. 여기 구현해보기)
			resize(length() * 2);
		}
		// index 의 위치에 항목을 추가하기 위해 index 부터 size - 1 까지의 항목들을 한칸씩 이동시킨다.
		// 이 때 맨 마지막 항목부터 이동시켜야 함 주의 !!!
		for (int i = size - 1; i >= index; i--) {
			a[i + 1] = a[i];
		}
		a[index] = e;
		size++;
		return true;
	}

	public E get(int k) {// k 번째 항목을 탐색하는 연산
		if (size == 0) { // underflow 의 경우에 프로그램 정지 ==> ArrayList 와 동일한 exception 찾아서 구현하기
			throw new IndexOutOfBoundsException();
		}
		return a[k];// k 번째 항목을 리턴, 단순히 읽기만 하면 된다.<==== (2. 여기 구현해보기)
	}

	public E remove() {// 맨 마지막 요소를 삭제하는 연산
		if (isEmpty()) {// underflow 의 경우에 프로그램 정지 ==> ArrayList 와 동일한 exception 찾아서 구현하기
			throw new IndexOutOfBoundsException();
		}
		// 맨 마지막 요소를 삭제하기 전 백업을 받고, 삭제한다. 배열의 size 를 감소시킨다. <==== (3. 여기 구현해보기)
		E removed = a[size - 1];
		a[size - 1] = null;
		size--;

		if (size > 0 && size <= length() / 4) {
			// 배열의 크기를 반으로 줄인다.
			resize(length() / 2);
		}
		return removed; // 백업 받아놓은 삭제된 요소를 반환한다. <==== (3. 여기 구현해보기)
	}

	public E remove(int index) {// index 번째 요소를 삭제하는 연산
		if (isEmpty()) {// underflow 의 경우에 프로그램 정지 ==> ArrayList 와 동일한 exception 찾아서 구현하기
			throw new IndexOutOfBoundsException();
		}
		// index 번째 요소를 삭제하기 전 백업을 받고, 삭제한다.
		E removed = a[index];
		a[index] = null;
		// index + 1 ~ size - 1 위치의 항목들을 한칸씩 앞으로 이동시킨다.
		// 이 때 맨 index + 1 항목부터 이동시켜야 함 주의 !!!
		for (int i = index + 1; i < size; i++) {
			a[i - 1] = a[i];
		}
		// 배열의 size 를 감소시킨다. <==== (3. 여기 구현해보기)
		size--;

		if (size > 0 && size <= length() / 4) {
			// 배열의 크기를 반으로 줄인다.
			resize(length() / 2);
		}
		return removed; // 백업 받아놓은 삭제된 요소를 반환한다. <==== (3. 여기 구현해보기)
	}

	private void resize(int length) {
		// 배열의 크기를 length 만큼 증가 혹은 감소시킨다.// <==== (4. 여기 구현해보기)
		System.out.println("before ==> 내부 부품 배열의 크기 " + length());
		E[] t = (E[]) (new Object[length]);

		// 기존배열의 값을 새로 만든 배열로 옮긴다.
		for (int i = 0; i < size(); i++) {
			t[i] = a[i];
		}
		// 기존배열을 없애고 새로만든 배열을 a 가 참조한다.
		a = t;
		System.out.println("after ==> 내부 부품 배열의 크기 " + length());
		// 자바의 ArrayList 는 Arrays.copyOf , arraycopy 등과 같은 방법으로 최적화되어 있다.
		// 우리는 반복문으로 옮겨보자
//		t = Arrays.copyOf(a, size);
		// 기존배열을 없애고 새로만든 배열을 a 가 참조한다. <==== (3. 여기 구현해보기, 코드가 길어지고 재사용되면 나중에 리팩토링 하기)
	}

	// 기타 편의 메서드 구현 //<==== (5. 여기 3개의 메서드 구현해보기)
	public int size() {
		return size;
	}

	private int length() {
		return a.length;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public String toString() {
		String list = "";
		for (int i = 0; i < size; i++) {
			if (i == size - 1) {
				list += a[i];
			} else {
				list += a[i] + ",";
			}
		}
		return "ArrList : [" + list + "]";
	}
}