package com.qa.main;

public abstract class Vehicle {
	
	private int wheels;
	private int seats;
	private int engineCylinders; 
	private int price;
	private String breed;
	
	
	
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getEngineCylinders() {
		return engineCylinders;
	}
	public void setEngineCylinders(int engineCylinders) {
		this.engineCylinders = engineCylinders;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}

}
