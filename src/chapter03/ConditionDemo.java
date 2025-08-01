package chapter03;

public class ConditionDemo {

	public static void main(String[] args) {
		int x = 10;
		String str = "Yes";

//		if (x >= 10 && x > 0) {
//			System.out.println(1);
//			System.out.println(2);
//			System.out.println(3);
//			System.out.println(4);
//			
//		if (str.equals("Yes")) {
//			System.out.println(1);
//			System.out.println(2);
//			System.out.println(3);
//			System.out.println(4);

		if (str.equalsIgnoreCase("yes")) {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
		}

	}

}
