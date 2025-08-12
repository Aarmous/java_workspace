package ch10;

public class UseThisDemo {

	public static void main(String[] args) {
		String hi = "hi!";

		UseThis u = new UseThis() {

			@Override
			public void use() {
				System.out.println(this);

			}

		};

		u.use();

	}

}

interface UseThis {
	void use();
}
