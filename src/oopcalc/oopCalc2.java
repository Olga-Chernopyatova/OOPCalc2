package oopcalc;

import java.util.Scanner;

public class oopCalc2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
	    System.out.println("Choose the operation");
		System.out.println("1 Add 2 Substract 3 Multiply 4 Divide");
		int input = scanner.nextInt();
		
		switch (input) {
		case 1: Add();
		case 2: Substract();
		case 3: Multiply();
		case 4: Divide();
	
		class add {
			private double Add() {

				double a;
				double b;
				double result;
				
				Scanner scanner = new Scanner (System.in);
				double num = scanner.nextDouble();
				
				System.out.println("Enter 1st number");
				a = scanner.nextDouble ();
				System.out.println("Enter 2nd number");
				b = scanner.nextDouble ();
				
				result = a + b;
				return result;
				
				System.out.println("Result is  " + result );
		
		}}}

		class Multiply extends Add {
			private double Multiply() {
				double a;
				double b;
				double result;
			
			result = a * b;
			return result;
				
			System.out.println("Result is  " + result );
}
	}
		class Substract extends Add {
			private double Substract() {
				double a;
				double b;
				double result;
			
			result = a - b;
			return result;
				
			System.out.println("Result is  " + result );
}
	}
		class Divide extends Add {
			private double Divide() {
				double a;
				double b;
				double result;
				
				catch (b=0) {
			System.out.println("You can't divide into 0!");	
				}
			
			result = a / b;
			return result;
				
			System.out.println("Result is  " + result );
			}
	}}
}
