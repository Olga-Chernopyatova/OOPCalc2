package oopcalc;

public class OOP2 extends calculator {

	public OOP2(double a, double b) {
		super(a, b);

	}

	public static void  main(String[] args) {
		
		calculator Sum1 = new calculator(7, 2);
		double result = Sum1.getSum();
		
		calculator Mult1 = new calculator(5, 5);
		double result1 = Mult1.getMultiply();

		
	}
}
