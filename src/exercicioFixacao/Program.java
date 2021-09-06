package exercicioFixacao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
/*
 * Este programa lerá N produtos fornecidos pelo usuário, e ao final mostrará a etiqueta de preço de cada
 * produto na ordem em que foram digitados.
 */
	public static void main(String[] args) throws Exception {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
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
// Case switch que verifica se o produto é comum, usado ou importado			
			switch (type) {
			case 'c':
		//Retorna nome e preço caso seja comum
				products.add(new Product(name, price));
				break;
				
			case 'u':
		//Retorna nome, preço e data de fabricação caso seja usado
				System.out.print("Manufacture date: ");
				Date manufactureDate = sdf.parse(sc.next());
				
				products.add(new UsedProduct(name, price, manufactureDate));
				break;
			case 'i':
		//Retorna nome, preço e taxa de importação caso seja importado
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				
				products.add(new ImportedProduct(name, price, customsFee));
				break;
			}
			
		}
		
		System.out.println();
		System.out.println("Price Tags");
		
		for (Product prod : products) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();
	}

}
