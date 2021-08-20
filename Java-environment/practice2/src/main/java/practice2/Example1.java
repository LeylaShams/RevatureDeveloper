package practice2;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Example1 {
	
	public static void plusMinus(ArrayList<Integer>  arr) {
	    // Write your code here
	        ArrayList<Integer> temp1 = new ArrayList<Integer>() ;
	        ArrayList<Integer> temp2 = new ArrayList<Integer>() ;
	        ArrayList<Integer> temp3 = new ArrayList<Integer>() ;
	        for (int i = 0; i < arr.size(); i++) {
	            if(arr.get(i) > 0) {
	                temp1.add(arr.get(i) );
	                System.out.println(temp1.size()/arr.size()); 
	            }
	            else if (arr.get(i) < 0) {
	                temp2.add(arr.get(i) );
	                System.out.println(temp1.size()/arr.size());  
	            }
	            else if (arr.get(i) == 0) {
	                temp3.add(arr.get(i) );
	                System.out.println(temp1.size()/arr.size());  
	            }
	        }

	    }

	public static void main(String[] args) {
	    //ArrayList<> arr = {1, 1, 0, -1, -1}
	    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

	     
		//Example1 t = new Example1();
		plusMinus(numbers);
		
	}

}
