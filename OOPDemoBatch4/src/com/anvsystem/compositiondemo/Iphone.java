package com.anvsystem.compositiondemo;

public class Iphone extends Phone{
	
	Camera sonyCarlZeiss;
	
	
	
	@Override
	public String toString() {
		return "Iphone [sonyCarlZeiss=" + sonyCarlZeiss + "]";
	}



	public static void main(String[] args) {
		Display samsungDisplay = new Display();
		samsungDisplay.colors = "16 million";
		samsungDisplay.company = "Samsung";
		samsungDisplay.type = "AMOLED";
		samsungDisplay.size = "6 Inches";
		
		MotherBoard asus = new MotherBoard();
		asus.port = "USB C";
		asus.processor = "Qualcomm Snapdragon 8800";
		asus.powerRange = "15mW";
		
		Battery lgBattery = new Battery();
		lgBattery.chemicalType = "Liion";
		lgBattery.capacityMah = "6600 Mah";
		
		Camera sonyCam = new Camera();
		sonyCam.patent = "Persicopic vision";
		sonyCam.resolution = "12MPx1";
		sonyCam.sensorType = "CMOS";
		
		Iphone iphone = new Iphone();
		iphone.display = samsungDisplay;
		iphone.battery = lgBattery;
		iphone.motherboard = asus;
		iphone.sonyCarlZeiss = sonyCam;
		
		System.out.println(iphone);
	}
}
