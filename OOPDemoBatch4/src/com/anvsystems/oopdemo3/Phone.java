package com.anvsystems.oopdemo3;

public class Phone {
	String make;
	String model;
	String network;
	String screensize;
	String camera;
	
	//Exclusive Constructor;
	// Constructor Overloadding
	Phone(String make, String model){
		this.make = make;
		this.model= model;
	}
	Phone(String make, String modle, String camera){
		this.make = make;
		this.model = model;
		this.camera = camera;
	}
	Phone(String make, String model, String camera, String network){
		this.make = make;
		this.model = model;
		this.camera = camera;
		this.network = network;
	}
	
	public static void main(String[] args) {
		Phone nokia = new Phone("Nokia", "6600", "12MP","4G Volte");// Default Constructor;
		nokia.make = "Samsung";
		
	}
}
