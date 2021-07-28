package day1;

public class Demo1 {
	//static variable
	static int z = 100; 
	
	//instance variable
	int x = 10;  
	
	public void addNumber() {
		
		// local variable
		int a = 10; 
		int b = 20;
		
		System.out.println(a+b);
	}
	public void subNumber() {
		
		int y = 5;
		System.out.println(y-5);
}
    public static void main(String[] args) {

    	Demo1 test = new Demo1();
    	test.addNumber();
    	test.subNumber();
    	System.out.println(z);
    }
}
