package com.anvsystems.javaOOPDemo;

public class Bike {
	
	String make;
	String model;
	String engineCapacity;
	String category;
	int maxNumberGears;
	int mileage;
	
	//Function - Methods
	// returnType nameOfFunction(arguments){
	// ...
	//}
	//ObjectName.nameOfMethod("..");
	
	/**
	 * Declare a class Bike
	 * Assign Properties to it
	 * declare methods startBike(), stopBike(), changeGear();
	 * startBike(), stopBike() and changeGear() methods should
	 * show current make, model and accordingly work.
	 * maxGearNumber
	 * changeGearBasedOnSpeed(int speed) - should return a gear based on provided speed.
	 */
	void startBike() {
		System.out.println("Bike"+this.model+" started");
	}
	void stopBike() {
		System.out.println("Bike "+this.model+" stopped!");
	}
	int changeGearBasedOnSpeed(int speed) {
		if(speed > 0 && speed < 30){
			return 1;
		}else if(speed >= 30 && speed < 50) {
			return 2;
		}else if(speed >= 50 && speed < 70) {
			return 3;
		}else if(speed >= 70) {
			return 4;
		}
		return 0;
	}
	public static void main(String[] args) {
		Bike fz = new Bike();
		fz.make = "Yamaha";
		fz.model = "fz";
		fz.maxNumberGears = 4;
		fz.startBike();
		System.out.println(fz.changeGearBasedOnSpeed(60));
		fz.stopBike();
	}
}

