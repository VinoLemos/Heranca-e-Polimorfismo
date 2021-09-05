package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;
/*
 * Este programa receberá dados de N funcionários, dados como nome, se ele é ou não um funcionário terceirizado,
 * quantas horas ele trabalhou/trabalha, e quanto ele ganha por hora. Caso ele seja terceirizado, ganhará um
 * adicional encima do que ganha por hora.
 * 
 * Ao final, o programa mostrará uma string com o nome do funcionário, e quanto ele recebeu naquele mês. 
 */
public class ExResolvido {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Employee> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of employees: ");
		int n = sc.nextInt();

// Ler os dados de cada funcionário		
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " Data: ");
			System.out.print("Outsourced employee?(Y/N)");//Pergunta se é terceirizado
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();// Consome a quebra de linha da string anterior
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			if (ch == 'Y') {//Exxecuta caso seja terceirizado
				System.out.print("Additional Charge: ");
				double additionalCharge = sc.nextDouble();;
				//Adiciona um novo funcionário na lista de funcionários, sem precisar criar variável do
				// tipo "Employee"
				list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
			} else {//Executa caso NÃO seja terceirizado
				//Esta forma de criar lista de objetos deixa o código mais limpo, e consome menos memoria
				list.add(new Employee(name, hours, valuePerHour));
			}
			
			System.out.println();

			

		}
		System.out.println("Payments: ");
		System.out.println();
		for (Employee emp : list) {
			System.out.println(emp.toString());
		}
		sc.close();
	}
}
