package dataStructure;

import java.util.LinkedList;

public class LinkedListImplementation {

	public static void main(String[] args) {
		
		LinkedList<String> lst = new LinkedList<>();
		
		lst.add("Apple");
		lst.add("Banana");
		lst.add("Orange");
		lst.add("Melon");
		System.out.println(lst);
		
		//Adding specified element to the end of the LinkedList
		lst.addLast("Peach");
		System.out.println(lst);

		//iterating through all elements in a linked list
		for (String name: lst) {
			System.out.println(name);
		}
		
		System.out.println("**********************************");
		
		//iterating through all elements starting at the specified position
		for (int i = 2; i < lst.size(); i ++) {
			System.out.println(lst.get(i));
		}
		System.out.println("**********************************");
		
		//iterating a linked list in reverse order
		for (int i = lst.size() -1 ; i >= 0; i--) {
			System.out.println(lst.get(i));
		}
		System.out.println("***********************************");
		
		//insert the specified element at the specified position
		
		
		lst.add(2, "Grape");
		System.out.println(lst);
		

	}

}
