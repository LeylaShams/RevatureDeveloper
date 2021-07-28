package Day2;

class Calculator2 {
	
	public void test() {
		System.out.println("1st method");
	}
	public void test(int a) {
		System.out.println("2nd method");
	}
	public void test(String a) {
		System.out.println("3rd method");
	}
	public void test(int a, String b) {
		System.out.println("4th method");	
	}
	public void test(String a, int b) {
		System.out.println("5th method");
	}
	/*public int test(){
		return 10;
	}*/
}


public class MethodOverloading {

	public static void main(String[] args) {
		
		Calculator2 cal = new Calculator2();
		cal.test();
		cal.test(5);
		cal.test("blah");
		cal.test(5, "blah");
		cal.test("blah", 5);
	}
}
