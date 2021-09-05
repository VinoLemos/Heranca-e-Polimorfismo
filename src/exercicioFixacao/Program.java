package exercicioFixacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
/*
 * Este programa lerá N produtos fornecidos pelo usuário, e ao final mostrará a etiqueta de preço de cada
 * produto na ordem em que foram digitados.
 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> products = new ArrayList<>();
		
		
		System.out.println("Enter the number of products");
		
		int prodQuant = sc.nextInt();
		
		for (int i = 0; i < prodQuant; i++) {
			System.out.println("Product #"+(1+i)+" data: ");
			System.out.print("Common, used, or imported? (c/u/i)");
			char type = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			products.add(new Product(name, price));
			
		}
		
		for (Product prod : products) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}

}
