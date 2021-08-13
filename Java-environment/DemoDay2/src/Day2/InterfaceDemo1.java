package Day2;

interface IEmployee {
	
	void print();
	
}

class Employee2 implements IEmployee {
	
	@Override
	public void print() {
		System.out.println("First interface ever");
	}
	
}
public class InterfaceDemo1 {
	
	public static void main(String[] args) {
	
	Employee2 emp = new Employee2();
	emp.print();
}
}

