package day6;

interface Icar {
	
	void getCarModel();
	void getCarColor();
}

class Audi implements Icar {
	
	@Override
	public void getCarModel() {
		System.out.println("Audi A6");
	}
	@Override 
	public void getCarColor() {
		System.out.println("Black");
	
	}
}
class BMW implements Icar {
	
	@Override
	public void getCarModel() {
		System.out.println("5 Series");
	}
	@Override
	public void getCarColor() {
		System.out.println("White");
	}
}

class CarFactory {
	
	public static Icar getCarInstance(int id) {
		switch(id) {
		case 1:
			return new Audi();
			
		case 2:
			return new BMW();
			
		default:
			return null;
		}
	}
}


public class FactoryDesign {

	public static void main(String[] args) {
		
//      Audi car1 = new Audi();
//      car1.getCarModel();
//      car1.getCarColor();
//
//      Bmw car2 = new Bmw();
//      car2.getCarModel();
//      car2.getCarColor();

		Icar car1 = CarFactory.getCarInstance(2);
		car1.getCarModel();
		car1.getCarColor();



	}

}
