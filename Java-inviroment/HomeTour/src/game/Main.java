package game;

import java.util.Scanner;
import fixtures.Room;

public class Main {
	
	public static Room[] rooms = new Room[3];
	
	private static void printRoom() {
		
		System.out.println(":::: Current Room :::: ");
		//will be continued

		
	}

	private static String[] collectInput() {
	
		System.out.println("You can move around the house in Three direction: ");
		System.out.println("Please type: 'Go North, South or East' and then hit the enter");
		
		Scanner scan = new Scanner(System.in);
		String phrase = scan.nextLine();
		while (scan.hasNextLine()) {
			  phrase = scan.nextLine();
		}
		
		System.out.println("test");// I know  the problem here, phrase is in block scope, struggling with Scanner class
		String[] words = phrase.split(" ");
		
		/*
		Scanner scan = new Scanner(System.in);
		String phrase = scan.nextLine();
		
		String[] words = phrase.split(" "); */
		scan.close();
		return words;
	
	}
		

	
	private static void parse(String[] command, Player player) {
		
		String words = command[0];
		words = words.toLowerCase();
		

			switch (words) {
				case "north":
					Player.currentRoom = rooms[0];
					break;
				case "south":
					Player.currentRoom = rooms[1];
					break;
				case "east":
					Player.currentRoom = rooms[2];			
		}
		}
		
		
	
	public static void main(String[] args) {
		
		
		Main s = new Main();
		Player p = new Player();
		//s.printRoom();
		Main.collectInput();
		Main.parse(collectInput(), p);
		//RoomManager roomManager = new RoomManager();
		
		
		 
		
	}

}
