package Day4;

import java.util.LinkedList;
import java.util.Iterator;

public class Demo7 {

	public static void main(String[] args) {
		
		
		LinkedList<String> names = new LinkedList<>();
		
		names.add("Mark");
		names.add("Paull");
		names.add("Watson");
		
		/*for(String name: names) {
			System.out.println(name);
		}*/
		
		Iterator iterator = names.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
