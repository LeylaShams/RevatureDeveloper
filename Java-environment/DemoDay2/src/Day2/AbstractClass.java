package Day2;

abstract class calculator3 {
	
	//not absrtact method
	public void addNumber(int num1, int num2) {
		System.out.println("Sum: " + (num1 +  num2));
		
	}
	public void subNumber(int num1, int num2) {
		System.out.println("Sub: " + (num1 - num2));
	}
	
	// abstract methods
	public abstract void  mulNumber(int num1, int num2);
	public abstract void divNumber(int num1, int num2);
}
class Test3 extends calculator3 {
	
	@Override
	public void mulNumber(int num1, int num2) {
		System.out.println("Mul: " + num1*num2);
	}
	@Override
	public void divNumber(int num1, int num2) {
		System.out.println("Div: " + (num1/num2));
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.addNumber(20, 10);
		t.subNumber(20, 10);
		t.mulNumber(20, 10);
		t.divNumber(20, 10);
	}

}
