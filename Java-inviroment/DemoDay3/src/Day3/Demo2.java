package Day3;

public class Demo2 {

	public static void main(String[] args) {
		String str = "Hello";
				
		// we are using concat() method to append the string at the end;
		str.concat("world");
		
		// will print Hello only bcoz strings are immutable object
		System.out.println(str);
		
		String str1 = "Hello";
		str1 = str1.concat("World");
		System.out.println(str1);

	}

}
