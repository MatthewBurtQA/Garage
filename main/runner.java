package com.qa.main;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//garage.class.
		
		Garage tierOne = new Garage();
		
		Porsche fastboi = new Porsche(150, true, true);
		Porsche Rocket = new Porsche(15000, true, false);
		
		fastboi.canLand();
		fastboi.canTakeOff();
		
		Rocket.canLand();
		Rocket.canTakeOff();
		
		tierOne.addVehicle(fastboi);
		tierOne.addVehicle(Rocket);

		tierOne.removeVehicle(Rocket);
		tierOne.toString();
		
		
		
		//tierOne.addVehicle();

	}

}
