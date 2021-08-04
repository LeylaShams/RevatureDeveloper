package day6;

interface Hello {
	public String greeting();
}
interface Welcome {
	public String greeting(String name);
}
interface Calculation {
	public int addNumber(int a, int b);
}
interface Say {
	public void sayHello(String name);
}

public class Lambda2 {

	public static void main(String[] args) {
		
		// without parameter
		Hello hello = () -> {
			return "welcome guest";
	};
		// with single parameter
		System.out.println(hello.greeting());
		
		Welcome w = (name) -> {
			return "Welcome" + name;
		};
		System.out.println(w.greeting("Paul"));
		
		// with multiple parameters
		Calculation calculation = (int a, int b) -> {
			return a+b;
		};
		System.out.println(calculation.addNumber(20, 30));
		
		// without return
		Say say = (name) -> {
			System.out.println("Hello" + name);	
		};
	}
}
