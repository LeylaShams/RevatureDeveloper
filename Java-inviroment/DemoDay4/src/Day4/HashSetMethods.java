package Day4;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMethods {

	public static void main(String[] args) {
		
		// create HashSet and add elements
		HashSet<String> set = new HashSet<>();
		set.add("Mark");
		set.add("Paul");
		set.add("Watson");
		set.add("Mark");
		set.add(null);
		set.add(null);
		
		
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		// remove()
		set.remove("Mark");
		System.out.println(set);
		System.out.println("***********");
		//set.removeAll(set);
		set.clear();
		System.out.println(set);

	}

}
