package day1;

public class PublicInstanceVariables {
	
	public String title;
	public String author;
	public int price;
	
	public void printInfo() {
		System.out.println("Book: Title = " + title +
				", Author = " + author + "Price: " + price);
	}
	public static void main(String[] args) {
		
		PublicInstanceVariables book1 = new PublicInstanceVariables();
		book1.title = "Java";
		book1.author = "Author 1, ";
		book1.price = 100;
		
		PublicInstanceVariables book2 = new PublicInstanceVariables();
		book2.title = "Angular";
		book2.author = "Author 2, ";
		book2.price = 200;
		
		book1.printInfo();
		book2.printInfo();
		

		

	}
}
