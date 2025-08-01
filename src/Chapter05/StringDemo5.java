package Chapter05;

public class StringDemo5 {

	public static void main(String[] args) {
		String formatStr = String.format("%s %d", "JDK", 14);
		System.out.println(formatStr);

		String joinStr = String.join(", ", "apple", "banana", "cherry", "durian");
		System.out.println(joinStr);

		// 문자열을 숫자로 바꿀때
//		Integer.parseInt(joinStr)
//		Long.parseLong(joinStr)
//		Double.parseDouble(joinStr)

		// 숫자를 문자열로 변경 valueOf() , 숫자 + " "
		String v1 = String.valueOf(false);
		String v2 = String.valueOf(10);
		String v3 = String.valueOf(3.14);

		System.out.println(v1 + v2 + v3);

		// 텍스트 블록
		String html = "<html>\n" + "    <body>\n" + "    </body>\n" + "</html>\n";
		System.out.println(html);

		String html2 = """
					<html>
						<body>
						</body>
					</html>
				""";
		System.out.println(html2);

	}

}
