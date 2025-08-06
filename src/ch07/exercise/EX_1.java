package ch07.exercise;

public class EX_1 {

	public static void main(String[] args) {

	}

}

abstract class Abstract {
	int i;

	public Abstract(int i) {
		this.i = i;
	}

	abstract void show();
}

class Concrete {
	int j;

	public Concrete(int i, int j) {
//		super(i);
		this.j = j;
	}

	private void show() {
		// TODO Auto-generated method stub

	}

}
