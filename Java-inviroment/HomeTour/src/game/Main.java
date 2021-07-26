package game;

import java.util.Scanner;
import fixtures.Room;

public class Main {
	
	public static Room[] rooms = new Room[3];
	static RoomManager roomManager = new RoomManager();
	
	private static void printRoom(Player player) {
		System.out.println("=================================================");
		System.out.println(" ::::: Current Room ::::: ");
		System.out.println("Room: " + player.getCurrentRoom().getName());
		System.out.println("Short description: " + 
		player.getCurrentRoom().getShortDescription());
		System.out.println("Long description: " +
		player.getCurrentRoom().getLongDescription());
		
	}

	private static String[] collectInput() {
		
		Scanner scan = new Scanner(System.in);
		
		//get input from user
		System.out.println("Welcome to the Home Tour program!");
		System.out.println("You can move around the house in Three direction. ");
		System.out.println("Please type: 'Go North, South or East' and then hit the enter...");
		String line = scan.nextLine();
		System.out.println("You have typed " + line);
		
		//test if the user is in the right direction!
		if (wrongDirection(line)) {
			try {
				throw new WrongDirectionException();
			} catch (WrongDirectionException e) {
				e.printStackTrace();
			} finally {
				scan.close();
	            }  
	    //close resources
        scan.close();
		}
        return line.split(" ");
	}
	public static boolean wrongDirection(String str) {
		str = str.toLowerCase();
		String[] test = str.split(" ");
		return !(test[1].equals("north") || test[1].equals("south")|| test[1].equals("east"));
	}
		
	
	private static void parse(String[] command, Player player) {
		
		String words = command[1];
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
		//collectInput();
		Player player = new Player();
		
		roomManager.init();
		
		Main.rooms = roomManager.getAllRooms();

		parse(collectInput(), player);
		//printRoom(player);
		
	}

}
