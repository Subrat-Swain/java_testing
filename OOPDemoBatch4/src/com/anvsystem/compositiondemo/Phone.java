package com.anvsystem.compositiondemo;

import java.security.DomainCombiner;

public class Phone {
	
//	String displayType;
//	String networkTypeSupport;
//	String os;
//	String cameraResolution;
//	String brand;
//	String model;
//	
//	public static void main(String[] args) {
//		Phone iphone = new Phone()
//				
//	}
	
	Display display;
	MotherBoard motherboard;
	Battery battery;
//	
//	public static void main(String[] args) {
//		Display samsungDisplay = new Display();
//		samsungDisplay.colors = "16 million";
//		samsungDisplay.company = "Samsung";
//		samsungDisplay.type = "AMOLED";
//		samsungDisplay.size = "6 Inches";
//		
//		MotherBoard asus = new MotherBoard();
//		asus.port = "USB C";
//		asus.processor = "Qualcomm Snapdragon 8800";
//		asus.powerRange = "15mW";
//		
//		Battery lgBattery = new Battery();
//		lgBattery.chemicalType = "Liion";
//		lgBattery.capacityMah = "6600 Mah";
//		
//		Phone galaxyPhone = new Phone();
//		galaxyPhone.display = samsungDisplay;
//		galaxyPhone.battery = lgBattery;
//		galaxyPhone.motherboard = asus;
//	}
	@Override
	public String toString() {
		return "Phone [display=" + display + ", motherboard=" + motherboard + ", battery=" + battery + "]";
	}
	
	
}
