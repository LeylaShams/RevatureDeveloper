package fixtures;

import game.Player;

public class Room extends Fixture {
	
	public Room[] exits = new Room[3];
	
	public Room(String name, String shortDescription, String longDescription) {
		super();
		
		this.exits = new Room[3]; 
	}
	
	public Room[] getExits() {
		return exits;
		
	}
	public Room getExit(String direction) {
		return Player.currentRoom;
		
	}	
	 
		
	}
	

