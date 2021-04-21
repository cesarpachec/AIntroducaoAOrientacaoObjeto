package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramAula68ToString {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Product product = new Product();
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity in Stock: ");
		product.quantity = sc.nextInt();
		
		
		//Como a classe product sobrescreveu o método toString(), a chamada de product por um println fez com que
		//implicitamente se entendesse que deve-se usar o toString() sema  necessidade de especificação do método.
		System.out.println(product);
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println("Updated data: ");
		System.out.println(product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("Updated data: ");
		System.out.println(product);
		
		sc.close();
		
	}

}
