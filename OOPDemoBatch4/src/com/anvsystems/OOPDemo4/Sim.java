package com.anvsystems.OOPDemo4;

// PARTIAL ABSTRACTION
public abstract class Sim {

	private String networkCarrier;
	private String generation;
	private String type;
	
	Sim(){
		System.out.println("I am non existent");
	}
	
	public void setNetworkCarrier(String networkCarrier) {
		this.networkCarrier = networkCarrier;
	}
	public String getNetworkCarrier() {
		Verizon v = new Verizon();// PARTIAL ABSTRACTION: How can we instantiate object of another class
		return this.networkCarrier;
	}
	public void setGeneration(String generation) {
		this.generation = generation;
	}
	public String getGeneration() {
		return this.generation;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return this.type;
	}
	public void registerNetwork() {
		System.out.println("Registering Network "+this.networkCarrier);
	}
	public static void main(String[] args) {
//		Sim s = new Sim();
		Airtel a = new Airtel("micro","Bharti Airtel");
	}
}
