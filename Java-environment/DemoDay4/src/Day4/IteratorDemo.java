package Day4;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
		ArrayList<String> mList = new ArrayList<String>();
		
		mList.add("Mark");
		mList.add("Paul");
		mList.add("Watsun");
		
		//System.out.println(mList);
		
		// iterator
		Iterator iterator = mList.iterator();
		
		// hasNext() will check if iterator has the element
		// print the element and move the cursor to the next
		while(iterator.hasNext()) {
			System.out.println(iterator.next()); 
		}
		for (String name: mList) {
			System.out.println(name);
		}
	}
}
