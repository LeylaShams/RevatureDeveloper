package day1;

class Calculator {
	
	int a = 10;
	int b = 20;
	
	public Calculator() {
		System.out.println("Parameter less constructor");
	}
	
	public Calculator(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public void addNumber() {
		System.out.println(a+b);
	}
}

public class Demo20 {

	public static void main(String[] args) {
		
		Calculator  cal1 = new Calculator();
		Calculator  cal2 = new Calculator(5, 2);
		cal2.addNumber();

	}

}
