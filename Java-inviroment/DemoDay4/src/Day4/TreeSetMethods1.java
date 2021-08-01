package Day4;

import java.util.TreeSet;
public class TreeSetMethods1 {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		
		treeSet.add("Mark");
		treeSet.add("Paul");
		treeSet.add("Watson");
		treeSet.add("Apple");
		
		for (String name: treeSet) {
			System.out.println(name);
		}

	}

}
