package game;

import fixtures.Room;

public class RoomManager {
	
	public Room[] rooms;
	public Room startingRoom;

	public void init() {
		
		rooms = new Room[3];
		
	    Room livingRoom = new Room(
			"Living room ",
			"A large room",
			"Cozy! Furnitures are comfortable and you see a few Chandeliers here");
	
	        
	    Room dinningRoom = new Room(
	    		"Dinning Room", "Bright and lovely",
	    		"Nice view to the backyard,"
	    		+ " You can also see the pool from dinning room.");
	
	    	
	    Room kitchen = new Room("Kitchen", "large and clean",
	    		"The room is well designed and It's full of modern cooking tools");
	    	
			this.rooms[0] = livingRoom;
	        this.rooms[1] = dinningRoom;
	        this.rooms[2] = kitchen;
	        
	        this.startingRoom = livingRoom;
	            
	}
	public Room[] getAllRooms() {
		return rooms;
		
	}
}
