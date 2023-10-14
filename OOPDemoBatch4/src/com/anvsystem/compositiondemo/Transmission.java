package com.anvsystem.compositiondemo;

public class Transmission {
	
	String make;
	String type;
	int numGears;
	
	void changeGear(int gearNum) {
		if(gearNum < numGears && gearNum > 0) {
			System.out.println("Gear Changed to"+gearNum);
		}
	}
}
