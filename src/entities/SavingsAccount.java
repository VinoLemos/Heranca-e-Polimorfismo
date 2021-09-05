package entities;

// Esta classe herda todos os métodos e funções da classe Account.
public class SavingsAccount extends Account{
	
	private Double interestRate;//Taxa de juros
	
	public SavingsAccount() {
		super();
	}
//Objeto SavingsAccount criado herdando atributos da superclasse Account
	public SavingsAccount(Integer account, String holder, Double balance, Double interestRate) {
		super(account, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
// Saldo da conta com taxa de juros aplicado	
	public void updateBalance() {
		balance += balance*interestRate;
	}

	public void withdraw(double amount) {
		balance -= amount;	
	}
}
