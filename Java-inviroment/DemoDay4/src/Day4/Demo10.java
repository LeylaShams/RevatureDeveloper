package Day4;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.HashSet;
public class Demo10 {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		set.add("one");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        
        Iterator<String> iterator = set.iterator();
        
        while( iterator.hasNext()) {
        	System.out.println(iterator.next());
        }
        /*
        for (String name: set) {
        	System.out.println(name);
        }
        */
		
        
        LinkedHashSet<String>  set2 = new LinkedHashSet<>();
        
        set2.add("one");
        set2.add("Two");
        set2.add("Three");
        set2.add("Four");
        set2.add("Five");
        
        System.out.println(set2);
         


	}

}
