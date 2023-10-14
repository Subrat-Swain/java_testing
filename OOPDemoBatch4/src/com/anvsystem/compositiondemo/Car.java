package com.anvsystem.compositiondemo;

public class Car {
	
	Engine engine;
	Transmission transmission;
	
	Car(Engine e, Transmission t){
		this.engine = e;
		this.transmission = t;
	}
//	Car(){
//		
//	}
	
	public static void main(String[] args) {
		Transmission dct1 = new Transmission();
		dct1.make = "Volkswagen";
		dct1.type = "DCT";
		dct1.numGears = 5;
		
		Engine e1 = new Engine();
		e1.engineMake = "fiat";
		e1.engineModel = "BMW100";
		e1.engineCapacity = "2000cc";
		
		Car bmw = new Car(e1,dct1);
		bmw.engine.startEngine();
	}
}
