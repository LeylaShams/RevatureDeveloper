package Day4;

import java.util.ArrayList;

public class Demo2 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Mark");
		names.add("Paul");
		names.add("Watsun");
		
		// get
		names.get(0);
		System.out.println(names);
		
		// set
		names.set(1, "Paul Smith");
		for(String name: names) {
			System.out.println(name);
		}
 
	}

}
