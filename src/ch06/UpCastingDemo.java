package ch06;

public class UpCastingDemo {

	public static void main(String[] args) {
		Student s = new Student();

		Person p = s; // Upcasting(자동 형변환) : 자식 객체
		System.out.println(p.name);
		p.whoAmI();

		downcast(s); // 출력 : "나는 사람이다."

		Employee e = new Employee();
		downcast(e);

		SportsPlayer sp = new SportsPlayer();
		downcast(sp);

		Person[] pArr = new Person[4];
		pArr[0] = new Student();
		pArr[1] = new Employee();
		pArr[2] = new SportsPlayer();
		pArr[3] = new Entertainer();
		// 위에 Person 으로 형변환 배열을 만들었기에, 밑에 세개의 메소드가 대체된다.
//		Student[] sArr = new Student[3];
//		Employee[] eArr = new Employee[3];
//		SportsPlayer[] spArr = new SportsPlayer[3];

		for (Person person : pArr) {
			person.whoAmI();
		}

	}

	public static void downcast(Person p) {
		p.whoAmI();
	}
	// 위에 downcast(Person p) 로 형변환 했기에, 밑에 두 메소드를 할 필요가 없다.
//	public static void downcast(Student s) {
//		
//	}
//	
//public static void downcast(Employee e) {
//		
//	}
}
