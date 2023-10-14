package com.anvsystems.javaOOPDemo;

/**
 * This class representd a blueprint of a Mobile phone
 */
public class Phone {
	//Blueprint of an object :- Class
	String company;
	String model;
	int screenSize;
	String os;
	String imei;
	String porcessor;
	String material;
	int ram;
	String Storage;
	
	/**
	 * Provides switch on output log
	 */
	void switchOnPhone() {
		System.out.println(this.model+"Phone Switched ON!");
	}
	/**
	 * Depending on Ram availability, it launches with some delay
	 */
	void launchApp(String appName) {
		if(this.ram > 2) {
			System.out.println("Launching app "+appName+" imidiately!");
		}else {
			System.out.println("Launching...");
			System.out.println("Launching...");
			System.out.println("Launching...");
			System.out.println("app"+appName+" Launched!");
		}
	}
	/**
	 * Provides switch off output log
	 */
	void switchOffPhone() {
		System.out.println(this.model+"Phone Switched Off");
	}
//	void getScreenSize() {
//		return this.screenSize;
//	}
	int getScreenSize() {
		return this.screenSize;
	}
	
	public static void main(String[] args) {
		//ClassName Varialbe = new ClassName();
		Phone iphone = new Phone();
		iphone.ram = 1;
		iphone.os = "ios 16.1";
		iphone.model = "iphone 12";
		iphone.screenSize = 6;
		iphone.company = "apple";
		iphone.switchOnPhone();
		System.out.println("ScreenSize is:"+iphone.getScreenSize());
		iphone.launchApp("instagram");
		
		Phone galaxy = new Phone();
		galaxy.ram = 8;
		galaxy.screenSize = 7;
		galaxy.model = "Galaxy s9";
		galaxy.material = "sapphire glass";
		galaxy.switchOnPhone();
		System.out.println("ScreenSize is:"+galaxy.getScreenSize());
		galaxy.launchApp("instagram");
		
		
		
	}
}
