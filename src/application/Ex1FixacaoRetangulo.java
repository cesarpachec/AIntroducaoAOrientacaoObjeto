package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Ex1FixacaoRetangulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle r = new Rectangle();
		
		System.out.println("Enter Rectangle width and hieght: ");
	    r.width = sc.nextDouble();
	    r.hieght = sc.nextDouble();
	    
	    System.out.println(r);
		
		sc.close();
		
	}

}
