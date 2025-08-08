package ch09;

import java.io.FileInputStream;

public class TryWithResourceDemo {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("file.txt");
		} catch (Exception e) {

		} finally {

		}
		// 위의 도식과 아래의 도식이 같다.
		// FileInputStream 이 AutoCloseable 을 구현했기에, 아래와 같이 finally 를 삭제하여 만들수 있다.

		try (FileInputStream fis = new FileInputStream("file.txt")) {
		} catch (Exception e) {

		}

		try (Res r = new Res()) {
			r.show();
		} catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
		} // close(); 를 호출한 적 없지만, 자동으로 호출한 것이다. (AutoCloseable을 구현했기 때문에)

	}

}

class Res implements AutoCloseable {

	void show() {
		System.out.println("리소스를 사용합니다.");
	}

	@Override
	public void close() throws Exception {
		System.out.println("리소스를 닫습니다.");
	}

}
