package ch10.exercise;

public class Account {
	private String accountNo;
	private String accountOwner;
	private long balance;

	public Account(String accountNo, String accountOwner, long balance) {
		this.accountNo = accountNo;
		this.accountOwner = accountOwner;
		this.balance = balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public String getAccountOwner() {
		return accountOwner;
	}

	public long getBalance() {
		return balance;
	}

	public void deposit(long balance) {
		this.balance += balance;
	}

	public void withdrawal(long balance) {
		this.balance -= balance;
	}

	@Override
	public String toString() {
		return String.format("%s \t %s \t %,d원", accountNo, accountOwner, balance);
	}

}
