package com.anvsystemOOPDemo1;

public class Application {
	
	String name;
	String type;
	
	void logIn() {
		System.out.println("Logged in "+this.type+this.name);
	}
	void logOut() {
		System.out.println("Logged out "+this.type+this.name);
	}
}
