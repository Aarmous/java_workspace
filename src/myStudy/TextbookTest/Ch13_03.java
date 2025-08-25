package myStudy.TextbookTest;

public class Ch13_03 {

	public static void main(String[] args) {

//		ContainerExample 클래스의 main() 메소드는 
//		Container 제네릭 타입을 사용하고 있습니다.
//		main() 메소드에서 사용하는 방법을 참고해서 
//		Container 제네릭 타입을 선언해보세요.

		Container<String, String> container1 = new Container<String, String>();
		container1.set("홍길동", "도적");
		String name1 = container1.getKey();
		String job = container1.getValue();
		System.out.println(name1 + job);

		Container<String, Integer> container2 = new Container<String, Integer>();
		container2.set("홍길동", 35);
		String name2 = container2.getKey();
		int age = container2.getValue();
		System.out.println(name2 + age);

	}

}

class Container<K, V> {
	private K key;
	private V value;

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	public void set(K key, V value) {
		this.key = key;
		this.value = value;
	}

}
