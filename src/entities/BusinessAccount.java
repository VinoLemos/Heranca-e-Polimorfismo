package entities;
// Esta classe extende a classe Account.Ou seja, herda todos os dados, comportamentos e funções da classe Account.
public class BusinessAccount extends Account{

	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}
// Objeto BusinessAccount herdando todos os métodos e funções da classe Account, e adicionando o parametro loanLimit
	public BusinessAccount(Integer account, String holder, Double balance, Double loanLimit) {
		super(account, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
// O empréstimo tem o mesmo efeito que o depósito, ou seja, ele deposita uma quantia de dinheiro na conta	
	public void loan(Double amount) { 
// Caso o valor do empréstimo esteja abaixo do limite, ele será realizado.
		if (amount <= loanLimit) {
			balance += amount - 10.0;//Taxa de empréstimo
		}
	}

// Esta função é um exemplo de sobrescrita, onde você "herda" uma função da super classe e a modifica de acordo
// com a sua necessidade.
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
}
