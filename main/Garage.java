package com.qa.main;

import java.util.*;

public class Garage extends Vehicle{
	private int carCost = 20_000;
	private int bikeCost = 10_000;
	
	private List<Vehicle> carHole = new ArrayList<> ();

	public List<Vehicle> getCarHole() {
		return carHole;
	}

	public void setCarHole(List<Vehicle> carHole) {
		this.carHole = carHole;
	}
	//add below method
	
	public boolean addVehicle(Vehicle vehicle){
		return this.carHole.add(vehicle); // needs fix
	}
	
	public boolean removeVehicle(Vehicle vehicle){
		return this.carHole.remove(vehicle);
	}
	
	@Override
	public String toString() {
		System.out.println(carHole.toString());
		
		return super.toString();
	}
	
	public void removeVehiclesByType(Class<?> clarse){
		List<Vehicle> toRemove = new ArrayList<>();
		
		
	}
	
	
	//method for calc cost
	// has checks (if) for if viechle type, calc bill different 
	


}
