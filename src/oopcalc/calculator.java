package oopcalc;

public class calculator {

	private double a;
	private double b;
	private double result;
	
	public calculator(double a, double b) {
		super();
		this.a = a;
		this.b = b;

	}

	public double getSum() {
		double result = a+b;
		System.out.println("a+b= " + result);
		return result;
	}
	public double getSubstract() {
		double result = a-b;
		System.out.println("a-b= " + result);
		return result;
	}
	public double getMultiply() {
		double result = a*b;
		System.out.println("a*b= " + result);
		return result;
	}
	public double getDivide() {
		double result = a/b;
		System.out.println("a/b= " + result);
		return result;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}


}
