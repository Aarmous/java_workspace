package ch09;

public class UncheckedDemo2 {

	public static void main(String[] args) {
		int number = 1;
		try {
			int res = 5 / number; // Number 가 0이면, ArithmeticException

			String str = "";
			System.out.println(str.length()); // String 값이 null이면, NullPointerException

			int[] arr = new int[0];
			System.out.println(arr[3]); // ArrayIndexOutOfBoundsException

//		} catch (ArithmeticException e) {
////			e.printStackTrace();  // 빨간 글자 Exception 메시지가 뜬다. 
//			System.out.println("0으로 나눌 수 없습니다.");
//		} catch (NullPointerException e) {
//			System.out.println("문자열의 값이 없습니다.");
//		} catch (Exception e) {
//			System.out.println("알 수 없는 예외가 발생했습니다.");
//		}

		} catch (ArithmeticException | NullPointerException e) {
//			e.printStackTrace();  // 빨간 글자 Exception 메시지가 뜬다. 
			System.out.println("0으로 나눌 수 없거나, 문자열의 값이 없습니다.");
		} catch (Exception e) {
			System.out.println("알 수 없는 예외가 발생했습니다.");
		}

	}

}
