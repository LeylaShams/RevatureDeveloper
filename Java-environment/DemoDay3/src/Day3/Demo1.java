package Day3;

public class Demo1 {

	public static void main(String[] args) {
		// creating string using java string literal
		String s1 = "Hello"; 
		
		char[] ch = { 'H', 'e', 'l', 'l', 'o' };
		
		
		//converting char array to string
		String s2 = new String(ch);
		
		// creating java string by using new keyword
		String s3 = new String("world");
		
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

	}

}
