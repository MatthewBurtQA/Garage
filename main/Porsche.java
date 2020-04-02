package com.qa.main;

public class Porsche extends Car {

	public Porsche(int doors, Boolean hasBoot, Boolean retractingRoof) {
		super(doors, hasBoot, retractingRoof);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void canTakeOff() {
		// TODO Auto-generated method stub
		System.out.println("I CANNOT TAKE OFF UNLESS YA JUMP ME OVER SOMMAT");
	}

	@Override
	public void canLand() {
		// TODO Auto-generated method stub
		System.out.println("IF IM IN THE SKY, I CANT LAND. BY THE OMNISSIAH");
	}
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("Doors: " + this.getDoors() + " Has a boot? " + this.getHasBoot() + " Retracting Roof" + this.getRetractingRoof());
		return super.toString();
	}
	

}
