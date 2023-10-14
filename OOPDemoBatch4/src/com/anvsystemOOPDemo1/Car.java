package com.anvsystemOOPDemo1;

public class Car extends Vehicle{

	int numGears;
	String category;
	int seatCapacity;
	
	void allocateSeatCapacity() {
		super.seatCapacity = this.seatCapacity;
	}
	void changeGear(int gearNum) {
		System.out.println("Gear changed to "+gearNum);
	}
	// DRY - Do NOT REPEAT YOURSELF
	void climateControl(int temp) {
		System.out.println("Cabin Temp Set to "+temp);
	}
	public static void main(String[] args) {
		Car i20 = new Car();
		i20.platformName = "cmb20"; 
		i20.model = "i20";
		i20.seatCapacity = 5;
		i20.allocateSeatCapacity();
		i20.startVechile();
		i20.changeGear(1);
		i20.climateControl(22);
		i20.stopVehicle();
	}
}
