
public class ExampleOne {
	
	public int factorial(int num) {
		if (num <= 0) {
			return 0;
		}
		if (num == 1) {
			return num;
		}
		return num * factorial(num-1);
	}
	
	
	
	
	public static void main(String[] args) {
		
	    //create some dummy data for our method
		int n = 5;

        //call your methods here
		ExampleOne test = new ExampleOne();
		int result = test.factorial(n);
		System.out.println(result);
	}
	
}
