package dataStructure;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetImplementation {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		
		hashSet.add("One");
		hashSet.add("Two");
		hashSet.add("Three");
		hashSet.add("Four");

		System.out.println(hashSet);
		
		/*append the specified element to the end of a hash set
		//HashSet is not ordered so we cannot insret at specified location
		or at the end! 	below an element is added to the end of a LinkedHasSet*/
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.addAll(hashSet);
		lhs.add("Five");
		System.out.println(lhs);
	
		//iterate through all elements in a hash list
		for (String element: hashSet) {
			System.out.println(element);
		}
		//get the number of elements in a hash set
		System.out.println(hashSet.size());
		//empty an hash set
		hashSet.clear();
		//or hashSet.removeAll(hashSet);
		System.out.println(hashSet);
		

	}

}
