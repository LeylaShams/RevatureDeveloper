package Day4;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {
	
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
	
		names.add("Mark");
		names.add("Paul");
		names.add("Stacy");
		names.add("Watson");
		
		// getting element on a specified index
		System.out.println(names.get(1));
		
		// adding the element on a specific index
		names.add(1, "John");
		System.out.println(names);
		
		//merge two list
		ArrayList<String> newNames = new ArrayList<>();
        newNames.add("Rangel");
        newNames.add("Smith");
        names.addAll(newNames);
        System.out.println(names);
        
        // adding second list element to the specified position
        names.addAll(0, newNames);
        System.out.println(names);
        
        // remove
        names.remove(0);
        
        //Collections.sort(names);
        System.out.println(names);
        
        names.removeAll(newNames);
        System.out.println(names);
        
        // removing an element based on condition
        names.removeIf(name -> name.contains("Paul"));
        System.out.println(names);
        
	}
}
