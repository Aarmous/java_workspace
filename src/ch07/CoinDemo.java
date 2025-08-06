package ch07;

public class CoinDemo {

	public static void main(String[] args) {
		System.out.println("Dime은 " + Coin.DIME + " 센트 입니다.");
		System.out.println("Quater는 " + Coin.QUATER + " 센트 입니다.");

	}

}

interface Coin {
	int PENNY = 1, NICKEL = 5, DIME = 10, QUATER = 25; // public static final 이 앞부분에 생략되어 있다.

}
