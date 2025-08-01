package chapter03;

public class SwitchDemo {

	public static void main(String[] args) {

//		int number = 2;
//		switch (number) {
//		case 3:
//			System.out.println("*");
//		case 2:
//			System.out.println("*");
//		case 1:
//			System.out.println("*");
//		default:
//			System.out.println("*");
//		}

		String day = "일";
		dayCheck(day);

	}

	private static String dayCheckReturn(String day) {
		String gubun = switch (day) {
		case "월", "화", "수", "목", "금" -> "평일";
		case "토", "일" -> "주말";
		default -> "*"; // 리턴연산자로 활용하려면 디폴트를 반드시 포함
		};
		return gubun;
	}

	private static void dayCheck(String day) {
		switch (day) {
		case "월", "화", "수", "목", "금" -> System.out.println(day + "요일은 평일입니다.");
		case "토", "일" -> System.out.println(day + "요일은 주말입니다.");
		default -> System.out.println("*");
		}
		// switch (day) {
//		case "월":
//		case "화":
//		case "수":
//		case "목":
//		case "금":
//			System.out.println(day + "요일은 평일입니다.");
//			break;
//		case "토":
//		case "일":
//			System.out.println(day + "요일은 주말입니다.");
//			break;
//		default:
//			System.out.println("*");
//		}
	}

}
