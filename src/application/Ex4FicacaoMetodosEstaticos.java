package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;

public class Ex4FicacaoMetodosEstaticos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Whats the dollar price? ");
		double exchange = sc.nextDouble();
		
		System.out.println("How many dollars will be bought?");
		double quantity = sc.nextDouble();
		
		double amount = CurrencyConverter.convert(exchange, quantity);
		
		System.out.printf("Amount to be paid in reais: %.2f%n", amount);
		
		sc.close();
		
	}

}
