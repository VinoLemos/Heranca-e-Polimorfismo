package entities;

public class Account {
	private Integer account;
	private String holder;
	protected Double balance;

	public Account() {
		
	}

	public Account(Integer account, String holder, Double balance) {
		this.account = account;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getAccount() {
		return account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	// Operação de saque
	public void withdraw(double amount) {
		balance -= amount;
		balance -= 5.0;
	}
	// Operação de depósito
	public void deposit(double amount) {
		balance += amount;
	}
	
	public String toString() {
		return "Account Holder: "
				+ getHolder()
				+ "; Account ID Number: "
				+ getAccount()
				+"; Account Balance: "
				+ getBalance();
	}
}
