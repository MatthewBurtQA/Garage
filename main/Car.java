package com.qa.main;

public abstract class Car extends Vehicle implements TakeOff, Land{
	
	private int doors = 0;
	private Boolean hasBoot = true;
	private Boolean retractingRoof = true;
	
	public Car(int doors, Boolean hasBoot, Boolean retractingRoof ){
		
		this.doors = doors;
		this.hasBoot = hasBoot;
		this.retractingRoof = retractingRoof;
		
	}
	
	
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public Boolean getHasBoot() {
		return hasBoot;
	}
	public void setHasBoot(Boolean hasBoot) {
		this.hasBoot = hasBoot;
	}
	public Boolean getRetractingRoof() {
		return retractingRoof;
	}
	public void setRetractingRoof(Boolean retractingRoof) {
		this.retractingRoof = retractingRoof;
	}
	
	public void TakeOff(){
		this.canTakeOff();
	}
	
	public void Land(){
		this.canLand();
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("Doors: " + this.doors + " Has a boot? " + this.hasBoot + " Retracting Roof" + this.retractingRoof);
		return super.toString();
	}
	

}
