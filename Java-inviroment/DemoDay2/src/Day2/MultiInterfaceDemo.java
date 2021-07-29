package Day2;

interface I1 {
	void print();
}
interface I2 {
	void display();
}
class Test5 implements I1, I2 {
	@Override
	public void print() {
		System.out.println("Method from first interface");
	}
	@Override
	public void display() {
		System.out.println("Method from second interface");	
	}
}


public class MultiInterfaceDemo {

	public static void main(String[] args) {
		
	}

}
