package com.anvsystem.compositiondemo;

public class Battery {
	
	String chemicalType;
	String capacityMah;
	@Override
	public String toString() {
		return "Battery [chemicalType=" + chemicalType + ", capacityMah=" + capacityMah + "]";
	}
}
