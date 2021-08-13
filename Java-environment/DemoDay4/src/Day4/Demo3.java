package Day4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demo3 {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>();
		
		colors.add("yellow");
		colors.add("red");
		colors.add("green");
		colors.add("pink");
		
		// before sorting
		System.out.println("before sorting...");
		for(String color: colors) {
			System.out.println(color);
		}
		
		// after sorting
		System.out.println("after sorting...");
		Collections.sort(colors);
		for (String color: colors) {
			System.out.println(color);
		}
		
		// List of numbers
		ArrayList<Integer> numbers = new 	ArrayList<>();
		numbers.add(8);
		numbers.add(2);
		numbers.add(4);
		numbers.add(6);
		
		// before sort
		System.out.println("before sorting...");
		for(int num: numbers) {
			System.out.println(num);
		}	
		// after sort
		Collections.sort(numbers);
		System.out.println("after sorting...");
		for(int num2: numbers) {
			System.out.println(num2);
		}
	}
	}


