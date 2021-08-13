package Day2;

interface Drawable {
	
	
	void draw();
	
	default void print() {
		System.out.println("printing...");
	}
}
class Rect implements Drawable {
	@Override
	public void draw() {
		System.out.println("drawing...");
		
	}
}
public class InterfaceDefaultMethod {
	
	public static void main(String[] args) {
	
	Drawable obj1 = new Rect();
	 obj1.draw();
	 obj1.print();
	 
	}
}
