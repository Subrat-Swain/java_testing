package com.anvsystemOOPDemo1;

public class SocialNetworkOne {
	
	String users;
	String platform;
	String storage;
	String databaseConnection;
	String integrations;
	// CONSTRUCTOR
	// A METHOD WITH A NAME SIMILAR TO CLASSNAME
	// WHICH IS AUTOMATICALLY INVOKED
	SocialNetworkOne(){
		System.out.println("Database Connected!");
		System.out.println("Integrations Done!");
	}
	public static void main(String[] args) {
		SocialNetworkOne facebook = new SocialNetworkOne();
	}
}
