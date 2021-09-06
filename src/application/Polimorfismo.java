package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

@SuppressWarnings("unused")
public class Polimorfismo {
	public static void main(String[] args) {
		
//	Em programação orientada a objetos, o polimorfismo é o recurso que permite que variáveis de um mesmo tipo
//	mais genérico possam apontar para  objetos de tipos especificos diferentes, tendo assim comportamentos 
//	diferentes conforme cada tipo específico.
		
						//Objetos de tipos diferentes na memória
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023,"Maria", 1000.0, 0.01);
// Porém a variável é do mesmo tipo.
		
		//Sendo assim, ao chamar-mos a operaçao de saque, o comportamento será diferente para cada variável.
		
		x.withdraw(50);//Operação de saque da classe Account
		y.withdraw(50);//Operação de saque da classe SavingsAccount
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}
}
