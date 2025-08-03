package myStudy;

public class ScopeDemo6 {

	static int i = 5; 
	
	static void a() {
		int i = 10; 
		b();
		System.out.println("a. " + i);  // second print : 10
	}
	
	static void b() {
		System.out.println("b. " + i);  // first print : 5
	}
	
	public static void main(String[] args) {
		a();
		System.out.println("main. " + i);  // third print : 5
	}

}
