package com.leyla.model;

public class Airplane extends FlyingVehicle{
	private short wheels;
	private short propellers;
	
	public Airplane(short wheels, short propellers) {
		this.wheels = wheels;
		this.propellers = propellers;
		
	}
	
	//getters and setters
	public short getWeels(){
		return this.wheels;
	}
	public void setWheels(short wheels) {
		this.wheels = wheels;
	}
	
	public short getPropellers() {
		return propellers;
	}
	public void setPropellers() {
		this.propellers = propellers;
	}
	
	public void turn() {
		System.out.println("Turning...");
	}
}
