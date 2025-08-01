package myLab;

public class Ex7Bank {

	public static void main(String[] args) {
		do {
			
			} while (money > balance) {
				
				}
		
		
		
	
		while(true) {
			System.out.println("출금할 금액을 입력하시오 : ");
			money = Long.parseLong(in.nextLine());
			if(money<=balance) {
				balance -= money;
				System.out.printf("현재 잔액 : %d 원\n", balance);
				break;
			} else {
				System.out.println("잔액초과!");
			}
		}
		
		

	}

}
