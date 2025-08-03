package myStudy;

public class ScopeDemo {

	
	static void a() {
		int i = 50000000;
	}
	
	public static void main(String[] args) {
	for( int i = 0; i < 5; i++) {
		a();
		System.out.println(i);
	}

	}

}
