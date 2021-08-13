package Day2;

abstract class Shape {
	public double width;
	public double height;
	public double radius;
	public float pie = 3.14f;
	
	public abstract void getArea();
}
class Rectangle extends Shape {
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public void draw(){
		System.out.println("rectangle drawing...");
	}
	@Override
	public void getArea() {
		System.out.println("Area: " + width*height);
	}
}
	
class Circle extends Shape {
	
	public Circle(double radius) {
		this.radius = radius;
	}
	public void draw() {
		System.out.println("circle drawing...");
	}
	@Override
	public void getArea() {
		System.out.println("Area: " + radius*radius*pie);
	}	
}	

public class AbstractClass2 {

	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle(4, 3);
		Circle cir = new Circle(4.12);
		
		rec.getArea();
		cir.getArea();
		
        rec.draw();
        cir.draw();
		

	}
}

