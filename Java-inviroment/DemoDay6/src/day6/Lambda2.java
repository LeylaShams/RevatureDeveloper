package day6;

interface Hello {
	public String greeting();
}
interface Welcome {
	public String meeting(String name);
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
		//System.out.println(w.greeting("Paul"));

	}
}
