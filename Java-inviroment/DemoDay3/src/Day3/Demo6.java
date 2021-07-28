package Day3;

public class Demo6 {

	public static void main(String[] args) {
		String str = "Hello" + "World";
		System.out.println(str);

		String str2 = 10 + 20 + 30 + "sum" + 50 + 50;	
		System.out.println(str2);
		
		String str3 = (new StringBuilder())
				.append("Hello!").append(" World").toString();
		System.out.println(str3);
	}

}
