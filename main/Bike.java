package com.qa.main;

public abstract class Bike extends Vehicle {

	private Boolean customPaint = true;
	private int ageRestriction;
	
	public Bike(Boolean customPaint, int ageRestriction){
		this.customPaint = customPaint;
		this.ageRestriction = ageRestriction;
	}
	
	
	
	public Boolean getCustomPaint() {
		return customPaint;
	}
	public void setCustomPaint(Boolean customPaint) {
		this.customPaint = customPaint;
	}
	public int getAgeRestriction() {
		return ageRestriction;
	}
	public void setAgeRestriction(int ageRestriction) {
		this.ageRestriction = ageRestriction;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//System.out.println("Doors: " + this.doors + " Has a boot? " + this.hasBoot + " Retracting Roof" + this.retractingRoof);
		System.out.println("Custom paint job?: " + this.customPaint + " age restriction is: " + this.ageRestriction );
		return super.toString();
	}

}
