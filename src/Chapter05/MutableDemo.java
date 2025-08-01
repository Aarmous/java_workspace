package Chapter05;

public class MutableDemo {

	public static void main(String[] args) {
		Cat c1 = new Cat("나비");

		Cat c2 = c1; // 객체의 주소를 똑같이 공유하게 됨.

		System.out.println(c1 + ":" + c2);
		System.out.println(c1.getName()); // 나비
		System.out.println(c2.getName()); // 나비

		c2.setName("야옹이");
		System.out.println(c1.getName()); // "나"비 가 아니라 "야옹이" 로 나오는 side effect가 나온다. c1 c2 가 가변객체이기 때문에.
		System.out.println(c2.getName()); // 야옹이

		int i = 1;
		int j = i; // 1이라는 값을 복사해서 갖고 있음. 1이라는 숫자를 i와 j가 공유하는 게 아님.

		System.out.println(i + ":" + j);

		j = 3;
		System.out.println(i + ":" + j);
	}

}

class Cat {
	private String name;

	public Cat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

// < 불변객체 만드는 법(mutable => immutable) >  : final 을 추가하여 name을 변할수 없게. setName 을 지워서 name을 변경할 방법을 없앰. 
// 이제 위의 메인에서 c2 의 이름을 바꾸고 싶으면, c2 새로운 객체를 만들어야 한다. 
//class final Cat {  
//	private String name;
//
//	public Cat(String name) {
//		this.name = name;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//}
