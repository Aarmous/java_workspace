package ch06;

public class DowncastDemo {

	public static void main(String[] args) {
//		Person p = new Person();
//		
//		Student s = p;   // 이런식으로 downcasting 불가 

		Student s = new Student();
		Person p = s; // upcasting, 자동 형변환
		System.out.println(p.name);
		p.whoAmI(); // 부모인 Person의 메소드 호출 사용
		p.work();
		// 자식인 Student의 메소드 호출 불가

		Student s2 = (Student) p; // downcasting, 명시적 형변환 (강제 형변환)
		System.out.println(s2.number);
		s2.work(); // 자식인 Student의 메소드 호출 사용

		Person[] pArr = new Person[4]; // 부모타입의 배열을 만들어, 자식들을 upcasting
		pArr[0] = new Student();
		pArr[1] = new Employee();
		pArr[2] = new SportsPlayer();
		pArr[3] = new Entertainer();

		downcast(pArr[0]);

		for (Person person : pArr) { // foreack문을 사용하여, upcasting 된 자식들을 다시 downcasting
			if (person instanceof Student s0) {
//				Student s0 = (Student) person; 
				s0.work(); // 자식의 메소드 호출 사용
				downcast(pArr[0]);
			} else if (person instanceof Employee e0) {
//				Employee e0 = (Employee) person; 
				e0.work(); // 자식의 메소드 호출 사용
			} else if (person instanceof SportsPlayer sp0) {
//				SportsPlayer sp0 = (SportsPlayer) person; 
				sp0.work(); // 자식의 메소드 호출 사용
			} else if (person instanceof Entertainer et0) {
//				Entertainer et0 = (Entertainer) person; 
				et0.work(); // 자식의 메소드 호출 사용
			}
			downcast(pArr[0]);
		}

		downcast(pArr[0]);

	}

	public static void downcast(Person p) {
		p.whoAmI();
	}

}
