package Day4;

import java.util.Map;
import java.util.Hashtable;

public class MapIterating2 {

	public static void main(String[] args) {
		Map<Integer, String> hashTable = new Hashtable<>();
		
		hashTable.put(1, "Mark");
		hashTable.put(2, "Paul");
		hashTable.put(3, "Watson");
		hashTable.put(4, "John");
		
		for(Map.Entry entry: hashTable.entrySet()) {
			System.out.println(entry.getKey()+ 
					" : " + entry.getValue());
		}
		

	}

}
