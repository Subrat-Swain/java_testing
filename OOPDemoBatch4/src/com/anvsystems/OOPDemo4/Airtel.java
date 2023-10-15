package com.anvsystems.OOPDemo4;

public class Airtel extends Sim{

	public Airtel(String type, String carrier) {
		super.setType(type);
		super.setNetworkCarrier(carrier);
		super.registerNetwork();
	}
	public void check5gSpectrum() {
		//
	}
	public static void main(String[] args) {
//		Sim s = new Sim();// PARTIAL ABSTRACTION
		Airtel a = new Airtel("micro", "Bharati Airtel");
	}
}
