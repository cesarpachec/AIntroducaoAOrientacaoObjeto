package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Ex3FixacaoStudentGrade {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student std = new Student();
		
		System.out.println("Name: ");
		std.name = sc.nextLine();
		
		System.out.println("Grade 1 = ");
		std.grade1 = sc.nextDouble();
		
		System.out.println("Grade 2 = ");
		std.grade2 = sc.nextDouble();
		
		System.out.println("Grade 3 = ");
		std.grade3 = sc.nextDouble();
		
		System.out.println(std);
		
		sc.close();
		
	}
	
}
