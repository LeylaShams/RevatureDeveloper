package Day2;

abstract class Test10 {
	public abstract void display1();
}
abstract class Test20 extends Test10{
	public abstract void display2();
}
abstract class Test30 extends Test20 {
	public abstract void display3();
}
class Output extends Test30 {
	@Override
	public void display1() {
		System.out.println("first");
	}
	@Override
	public void display2() {
		System.out.println("second");
	}
	@Override
	public void display3() {
		System.out.println("third");
	}
}

public class AbstractClass3 {
	
	public static void main(String[] args) {
		Output p = new Output();
		p.display1();
		p.display2();
		p.display3();
	}
}

