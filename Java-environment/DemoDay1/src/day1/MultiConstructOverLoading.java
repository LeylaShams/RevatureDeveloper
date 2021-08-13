package day1;

class Car {
	public String name;
	public String color;
	public int price;
	public String engyneType;
	
	public Car(String name, String color, int price, String engyneType) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.engyneType = engyneType;
	}
	
	public Car(Car carObj) {
		this.name = carObj.name;
		this.color = carObj.color;
		this.price = carObj.price;
		this.engyneType = carObj.engyneType;
	}
	
	public Car(Car carObj, int price) {
		this.name = carObj.name;
		this.color = carObj.color;
		this.price = price;
		this.engyneType = carObj.engyneType;	
	}	
}

public class MultiConstructOverLoading {
	
	Car car1 = new Car("Audi", "White", 10000, "Petrol");
	Car car2 = new Car(car1);
	Car car3 = new Car(car1, 2000);

}
