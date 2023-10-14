package com.anvsystemOOPDemo1;

public class Rose extends Plant{
	// Rose IS-A PLANT
	boolean hasFlowers;
	String rootType;
	
	public static void main(String[] args) {
		Plant p = new Plant();
		p.leaves = "green";
		Rose r = new Rose();
		r.hasFlowers = true;
	}
}
