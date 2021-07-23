package fixtures;

import game.Player;

public class Room extends Fixture {
	
	public Room[] exits;
	
	public Room(String name, String shortDescription, String longDescription) {
		
		
		this.exits = new Room[3];
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
	
	public Room[] getExits() {
		return exits;
		
	}
	public Room getExit(String direction) {
		return Player.currentRoom;
		
	}	
	 
		
	}
	

