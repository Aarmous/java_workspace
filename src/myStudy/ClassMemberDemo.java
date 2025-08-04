package myStudy;

class C1{
    static int statVar = 1;
	int instVar = 2;
	static void statMetho_statVar(){
		System.out.println(statVar);
	}
	static void statMetho_instVar(){
//		System.out.println(instance_variable);  
		// 클래스 메소드에서는 인스턴스 변수에 접근 할 수 없다. 
	}
	void instMetho_statVar(){
		System.out.println(statVar);
		// 인스턴스 메소드에서는 클래스 변수에 접근 할 수 있다.
	}
	void instMetho_instVar(){		 
		System.out.println(instVar);
		
	}
}
class ClassMemberDemo {	
	public static void main(String[] args) {
		C1 c = new C1();
		// 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
		// 인스턴스 메소드가 정적 변수에 접근 -> 성공
		c.statMetho_statVar();  // 1(statVar)
		// 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
		// 정적 메소드가 인스턴스 변수에 접근 -> 실패
		c.statMetho_instVar();  // Error
		// 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
		// 인스턴스 메소드가 클래스 변수에 접근 -> 성공
		c.instMetho_statVar();  // 1(statVar)
		// 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공 
		// 인스턴스 메소드가 인스턴스 변수에 접근 -> 성공
		c.instMetho_instVar();  // 2(instVar)
		// 클래스를 이용해서 클래스 메소드에 접근 -> 성공
		// 클래스 메소드가 클래스 변수에 접근 -> 성공
		C1.statMetho_statVar();  // 1(statVar)
		// 클래스를 이용해서 클래스 메소드에 접근 -> 성공
		// 클래스 메소드가 인스턴스 변수에 접근 -> 실패
		C1.statMetho_instVar();  // Error
		// 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
//		C1.instance_static();  // Error
		// 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
//		C1.instance_instance();  // Error
	}
 
}