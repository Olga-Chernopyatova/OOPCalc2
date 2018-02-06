package oopcalc;

import java.util.Scanner;

public class oopCalc2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);

		double a;
		double b;
		double result;
		
		System.out.println("Enter 1st number");
		a = scanner.nextDouble ();
		System.out.println("Enter 2nd number");
		b = scanner.nextDouble ();
		
	    System.out.println("Choose the operation");
		System.out.println("1 Add 2 Substract 3 Multiply 4 Divide");

		
		class calculator extends oopCalc2 {
			public calculator(int input) {
				super();
				this.input = input;
			}

			int input = scanner.nextInt();
		
			
			switch (input) {
			case 1: Add();
			case 2: Substract();
			case 3: Multiply();		
			case 4: Divide();
			}
						
			double Add() {	
			
			double result = a + b; 
			return result;
				
			System.out.println("Result is  " + result );
			}
			
			double Substract() {

			double result = a - b;
			return result;
				
			System.out.println("Result is  " + result );
}

			double Multiply() {
			
			double result = a * b;
			return result;
				
			System.out.println("Result is  " + result );
}

			double Divide() {
				
				catch (b=0) {
			System.out.println("You can't divide into 0!");	
				}
			
			double result = a / b;
			return result;
				
			System.out.println("Result is  " + result );
				}}
	}}


