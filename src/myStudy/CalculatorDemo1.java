package myStudy;

class Calculator1 {
	static double PI = 3.14;
	int left, right;
	
	public void setOprands(int le, int ri) {
		this.left = le;
		this.right = ri;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left + this.right) / 2);
	}
}

public class CalculatorDemo1 {

	public static void main(String[] args) {
		
		Calculator1 c1 = new Calculator1();
		System.out.println(c1.PI);
		
		Calculator1 c2 = new Calculator1();
		System.out.println(c2.PI);
		
		System.out.println(Calculator1.PI);
		
		c1.setOprands(10, 20);
		c2.setOprands(30, 40);
		c1.sum();
		c2.avg();

	}

}
