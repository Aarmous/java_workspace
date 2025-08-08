package ch08;

public class WrapperClassDemo {

	public static void main(String[] args) {
		int i = 10;
		Integer I = new Integer(10);

		int j = I.intValue();
//		int j = I  // 원래는 윗 방법인데, 자바가 최적화되어서, 이런 문법으로 사용 가능하다.  

		String s = new String("Hello");

	}

}
