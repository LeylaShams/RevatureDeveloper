package calculator;

public class Calculator {
	double a;
	double b;
	
	public Calculator(double a, double b) {
		this.a = a;
		this.b= b;
	}
	public double addNum() {
		return a+b;
		//System.out.println(a+b);
	}
	public double subNum() {
		return a-b;
	}
	public double multNum() {
		return a*b;
	}
	public String toString() {
		return "addition: " + this.addNum() + " subtraction: " +
	this.subNum() + " Multi: " +  this.multNum();
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator(5, 2);
		//cal.addNum();
//		cal.subNum();
//		cal.multNum();
		System.out.println(cal);
	}

}
