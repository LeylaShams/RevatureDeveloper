package game;

import fixtures.Room;

public class RoomManager {
	
	
	public Room[] rooms = new Room[3];
	public Room startingRoom = rooms[0];

	public void init() {
	    Room livingRoom = new Room(
			"Living room ",
			"A large room",
			"Cozy! Furnitures are comfortable and you see a few Chandeliers here");
			this.rooms[0] = livingRoom;
	        this.startingRoom = livingRoom;
	        
	    Room dinningRoom = new Room(
	    		"Dinning Room", "Bright and lovely",
	    		"Nice view to the backyard,"
	    		+ " You can also see the pool from dinning room.");
	    	this.rooms[1] = dinningRoom;
	    	
	    Room kitchen = new Room("Kitchen", "large and clean",
	    		"The room is well designed and It's full of modern cooking tools");
	    	this.rooms[2] = kitchen;
	}
}
