package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

/*
 * Herança é uma associação que permite que uma classe herde todos dados e comportamentos  de outra classe, 
 * reutilizando assim os atributos de métodos.
 * 
 *  Nesta classe há exemplos de herança.
 */

@SuppressWarnings("unused")
public class Heranca {

	public static void main(String[] args) {
								// número da conta, titular e saldo
		Account acc = new Account(1001, "Alex", 0.0);
												// número da conta, titular, saldo e limite para empréstimo
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING 		
		Account acc1 = bacc; //Atribui um objeto da subclasse BusinessAccount à uma variável do tipo superclasse Account
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new BusinessAccount (1004, "Anna", 0.0, 0.01);
		
//	Toda BusinessAccount é uma Account, e vice-versa. Por este motivo não ocorre nenhum erro ao atribuir uma BusinessAccount
// como valor de variável Account.		
		
		//DOWNCASTING
		//Como a conversão nao é natural, diferente do upcasting, é preciso fazer um casting manual.
		//Isso possibilitaria, por exemplo, utilizar a função loan (que existe apenas em BusinessAccount)
		//	em um objeto do tipo Account.
		BusinessAccount acc4 = (BusinessAccount)acc2;
		
		acc4.loan(100.0);//Empréstimo no valor de 100
/*		
		Uma SavingsAccount não é uma BusinessAccount, porém é uma Account
		
		BusinessAccount acc5 = (BusinessAccount)acc3;
		
		Para que tudo ocorra sem problemas é preciso testar se a variável acc3 é do tipo BusinessAccount
		
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan");
			
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 =  (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update Balance");

			System.out.println(acc1.toString());
		}
*/		
		acc3.withdraw(200.00);
		System.out.println(acc3.getBalance());
	}
}
