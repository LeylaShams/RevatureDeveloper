package game;

import java.util.Scanner;
import fixtures.Room;

public class Main {
	
	public static Room[] rooms = new Room[3];
	static RoomManager roomManager = new RoomManager();
	
	private static void printRoom() {
		
		//System.out.println(":::: Current Room :::: ");
		//System.out.println();
		
	}

	private static String[] collectInput() {
	
		//System.out.println("You can move around the house in Three direction: ");
		//System.out.println("Please type: 'Go North, South or East' and then hit the enter");
		
		Scanner scan = new Scanner(System.in);
		String phrase = scan.nextLine();
		
		
		while (scan.hasNextLine()) {
			  phrase = scan.nextLine();
		}
		String[] words = phrase.split(" ");
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
		
		System.out.println("You can move around the house in Three direction: ");
		System.out.println("Please type: 'Go North, South or East' and then hit the enter");
		
		Player p = new Player();
		
		roomManager.init();
		
		Main.rooms = roomManager.getAllRooms();

		Main.parse(collectInput(), p);
		Main.printRoom();
		//System.out.println(s.rooms[1].player.player);
			 
		
	}

}
