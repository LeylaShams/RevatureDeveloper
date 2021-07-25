package com.example.exceptions;

import java.util.Scanner;

public class Simulation {
	
	public static void getInput() {
		
		Scanner scan = new Scanner(System.in);
		
		//get input from user
		System.out.println("Type in a number and press Enter...");
		String line = scan.nextLine();
		System.out.println("You have typed " + line);
		
		//test if number is even, throw exception if true
        if (isEven(line)) {
        	try {
        		throw new EvenNumberException();
        } catch(EvenNumberException e) {
        	e.printStackTrace();
        	//System.out.println("balh blah");
        }finally {
        	scan.close();
        }
	    //close resources
        scan.close();	
	}
	}
	
	public static boolean isEven(String num) {
		int value =  Integer.parseInt(num);
		
		return (value % 2 == 0);
		
	}

	public static void main(String[] args) {
		getInput();
		
		
	}

}
