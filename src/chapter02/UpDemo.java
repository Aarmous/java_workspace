package chapter02;

public class UpDemo {

	public static void main(String[] args) {
		int j, i = 3;

//		< 전위형 >
//		j = i++; // j=3, i=4 (밑에 두줄을 합쳐놓은 한줄) 
//		j = i;
//		i = i + 1;

//		< 후위형 >
		j = ++i; // j=4, i=4 (밑에 두줄을 합쳐놓은 한줄)
//		i = i + 1; 
//		j = i; 

		System.out.printf("%d, %d", j, i);

	}

}
