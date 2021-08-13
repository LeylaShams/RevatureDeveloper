package Day4;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>();
		
		names.add("Mark");
		names.add("Paul");
		names.add("Watsun");
		System.out.println(names);
		
		// adding element at specified position
		names.add(0, "John");
		System.out.println(names);
		
		// adding second list
		LinkedList<String> newNames= new LinkedList<>();
		newNames.add("Stacy");
		newNames.add("Smith");
		
		//names.addAll(namesNew);
		names.addAll(newNames);
		System.out.println(names);
		
		names.addAll(0, newNames);
		System.out.println(names);
		
		// addFirst()
		names.addFirst("First");
		System.out.println(names);
		
		//addLast()
		names.addLast("Last");
		System.out.println(names);
		
        // remove()
        // remoteFirst()
        // removeLast()
        // removeFirstOccurrence()
        // removeLastOccurrence()
		
        names.add("John");
        names.add("Paul");
        System.out.println(names);
        
        names.removeFirstOccurrence("John");
        System.out.println(names);
        
        names.removeLastOccurrence("John");
        System.out.println(names);
        System.out.println("****************");
     // reverse elements
        System.out.println("original");
        System.out.println(names);
        System.out.println("****************");
     // traversing list element in reverse order
        for (int i = 0; i < names.size(); i++) {
        	System.out.println(names.get(i));
        	
        }
        System.out.println("****************");
        for(int i = names.size()-1; i >= 0; i--) {
        	System.out.println(names.get(i));
        }
        System.out.println("****************");
        Iterator iterator = names.descendingIterator();
        while (iterator.hasNext()) {
        	System.out.println(iterator.next());
        }
	}

}
