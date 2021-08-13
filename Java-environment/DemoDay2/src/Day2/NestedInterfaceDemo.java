package Day2;

interface X {
	void print();
	interface Y {
			void display();
		}
	}

class Z implements X, X.Y {
	
	@Override
	public void print() {
		System.out.println("Hello");
	}
	@Override
	public void display() {
		System.out.println("drawing...");
	}
}

public class NestedInterfaceDemo {

	public static void main(String[] args) {
		
		Z x1 = new Z();
		x1.print();
		x1.display();

	}

}
