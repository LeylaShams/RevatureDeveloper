package dataStructure;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetImplementation {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<>();
		
		treeSet.add("Java");
		treeSet.add("Python");
		treeSet.add("SQL");
		treeSet.add("HTML");
		treeSet.add("JavaScript");
		treeSet.add("CSS");
		
		//iterate through all elements in a tree set
		Iterator iterator = treeSet.iterator();
		
		while( iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		//or just simply a for-each loop
		/* or for (String element: treeSet) {
			System.out.println(element);
		}*/
		
		//add all the elements of a specified tree set to another tree set.
		TreeSet<String> treeSet2 = new TreeSet<>();
		treeSet2.add("C++");
		treeSet2.add("R");
		treeSet2.add("Ruby");

		treeSet.addAll(treeSet2);
		System.out.println(treeSet);
		
		//create a reverse order view of the elements contained
		Iterator iterator2 = treeSet.descendingIterator();
		
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		/*
		for(String  element: treeSet) {
			System.out.println(element);
		}*/
		
		System.out.println("*******************");
		//get the first and last elements in a tree set
		System.out.println(treeSet.pollFirst());
		System.out.println(treeSet.pollLast());
		
	}

}
