package ch04.sec07;

public class SingletonDemo {

	public static void main(String[] args) {
//		Singleton s = new Sinlgton();   -  밑에서 private 했기에, 여기서 객체를 못 만든다. 
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		System.out.println(s1); // Object에 있는 toString()에 정의된 바에 의해서 이름@111 가 출력이 됨.
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1 == s3 && s2 == s3);
	}

}

class Singleton {
	// static 변수
	private static Singleton singleton = new Singleton();

	// 생성자
	private Singleton() {

	}

	// static 메서드
	public static Singleton getInstance() {
		return singleton;
	}

}
