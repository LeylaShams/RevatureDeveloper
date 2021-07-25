package fixtures;

import game.Player;

public class Room extends Fixture {
	
	public Room(String name, String shortDescription, String 
			longDescription) {
}
	public Room[] exits;
	
	public String getName() {
        return this.getName();
    }

    public void setName(String name) {
        this.name = name; 
    }	

	
	public String getShortDescription() {
		return this.shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	public String getLongDescription() {
		return this.longDescription;
		
	}
	public void setLongDescription(String shortDescription) {
		this.longDescription = longDescription;
		
	}
	
	
	public Room[] getExits() {
		return exits;
		
	}
	public Room getExit(String direction) {
		return Player.currentRoom;
		
	}	
	 
		
	}
	

