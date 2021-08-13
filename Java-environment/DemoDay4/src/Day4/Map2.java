package Day4;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map2 {

	public static void main(String[] args) {
		Map<Integer, String> student = new HashMap<>();
		
		student.put(1, "Mark");
		student.put(2,  "Paul");
		student.put(3, "John");	
		
		for(Map.Entry entry: student.entrySet()) {
			System.out.println(entry.getKey()+ 
					" : " + entry.getValue());
		}

	}

}
