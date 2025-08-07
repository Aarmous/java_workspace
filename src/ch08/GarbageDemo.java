package ch08;

public class GarbageDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			new Garbage(i);
			System.gc();
		}

	}

}

class Garbage {
	int no;

	public Garbage(int no) {
		this.no = no;
		System.out.printf("Garbage (%d)번 생성\n", no);

	}

	@Override
	protected void finalize() throws Throwable {
		System.out.printf("Garbage (%d)번 수거\n", no);
	}
}
