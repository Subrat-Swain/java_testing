package com.anvsystemOOPDemo1;

public class Vehicle extends Platform{
	
	String make;
	String model;
	int seatCapacity;
	int numWheels;
	String fuelType;
	
	
	void startVechile() {
		System.out.println("Vehicle"+this.model+" started");
	}
	void stopVehicle() {
		System.out.println("Vehicle"+this.model+" stopped");
	}
}
