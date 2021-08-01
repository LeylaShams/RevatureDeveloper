package Day4;

import java.util.TreeSet;
public class TreeSetMethods2 {

	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<>();
		set.add(6);
		set.add(5);
        set.add(65);
        set.add(21);
        set.add(11);
        set.add(2);
        set.add(15);

	
	for (int num: set) {
		System.out.println(num);
	}
	
    // pollFirst()
    // PostLast()
	
	System.out.println("Highest: " + set.pollLast());
	System.out.println("Lowest: " + set.pollFirst());

	}
}
