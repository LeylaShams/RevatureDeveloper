package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		System.out.println("Welcome to the unit converter tool.");
		System.out.println("Please choose from the menu. ");
		
		int menuSelection = 0;
		
		while (menuSelection > 4) {
			
			if (menuSelection == 1) {
				System.out.println("1 for converting Cups to Teaspoons.");
				
			}else if (menuSelection == 2) {
				System.out.println("2 for converting Miles to Kilometers.");
				
			}else if (menuSelection == 3) {
				System.out.println("3 for converting US Gallons to Imperial Gallons.");
				
			}else if (menuSelection == 4) {
				System.out.println("4 for Quit!");		
			}
			menuSelection++;	
		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please type in a line and hit Enter.");
		String line = scanner.nextLine();
		System.out.println("You have typed: " + line);
		System.out.println("please type the quantity of the unit. ");
		
		String line2 = scanner.nextLine();
		System.out.println("You have typed: " + line2);
		scanner.close();
		
		
		
		
		scanner = new Scanner(line2);
		
		switch (line) {
			case "1" :
				System.out.println(line2 + " cups equals " + Integer.parseInt(line2) * 48 + " teaspoons.");
				
				break;
		
				case "2" : 
					System.out.println(line2 + " miles equals to " +  Integer.parseInt(line2) * 1.60934 + " Kilometers.");
					break;
		
				case "3" : 
					System.out.println(line2 + " US Galones equals to " +   Integer.parseInt(line2)* 0.832674 + " Imperial Galons.");
					break;
		
				case "4": 
					System.out.println("Quit");	
			
		}
		scanner.close();
		
		}
}
	






			
