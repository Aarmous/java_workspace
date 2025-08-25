package myStudy.TextbookTest;

public class Ch13_02 {

	public static void main(String[] args) {

//		ContainerExample 클래스의 main() 메소드는 
//		Container 제네릭 타입을 사용하고 있습니다.
//		main() 메소드에서 사용하는 방법을 참고해서 
//		Container 제네릭 타입을 선언해보세요.

		Container02<String> container1 = new Container02<String>();
		container1.set("홍길동");
		String str = container1.get();
		System.out.println(str);

		Container02<Integer> container2 = new Container02<Integer>();
		container2.set(6);
		int value = container2.get();
		System.out.println(value);

	}
}

class Container02<T> {
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}

}
