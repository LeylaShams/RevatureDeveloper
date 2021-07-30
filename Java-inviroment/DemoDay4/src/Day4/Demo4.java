package Day4;
import java.util.ArrayList;
import java.util.Collections;
public class Demo4 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("Mark");
		names.add("Paul");
		names.add("Stacy");
		names.add("Ali");
		System.out.println(names.size());
		System.out.println(names);
		
		//for loop
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i))	;
		}
		// forEach
		for(String name: names) {
			System.out.println(name);
		}
		names.set(0, "Leyla");
		Collections.sort(names);
		//Lambda 
        names.forEach(name -> {
            System.out.println(name);
        });
		


	}

}
