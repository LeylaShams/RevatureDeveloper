package Day2;

abstract class Test100 {
	public abstract void display();
}
abstract class Test200 {
	public abstract void display();
}
abstract class Test300 {
	public abstract void display();
}

class Output2 extends Test300{
	
	public void display() {
		System.out.println("That's it!");
	}
}

public class AbstractClass4 {

	public static void main(String[] args) {
		Output2 p = new Output2();
		p.display();
	}

}
