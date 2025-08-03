package myStudy;

class Calculator4 {
	int left, right;
	
	public Calculator4() {}
	
    public Calculator4(int left, int right) {
    	this.left = left;
    	this.right = right;
    }
	
//    public void setOprands(int left, int right) {
//        this.left = left;
//        this.right = right;
//    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator extends Calculator4 {
    public SubstractionableCalculator(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorConstructorDemo4 {
    public static void main(String[] args) {
    	Calculator4 r = new Calculator4(50, 60);
    	r.sum();
    	r.avg();
    	
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}