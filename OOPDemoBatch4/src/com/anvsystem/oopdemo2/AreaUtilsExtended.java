package com.anvsystem.oopdemo2;

public class AreaUtilsExtended extends AreaUtils{
	
	/**
	 * Method Overloading;
	 */
	int calcArea(int radius) {
		return (int)(3.14 * radius * radius);
	}
	int calcArea(int width, int height, boolean isTriangle) {
		System.out.println("Invoked AreaUtilsExtended");
		return (int) (0.5 * width * height);
	}
	
	public static void main(String[] args) {
		AreaUtils AuE = new AreaUtils();
		int area = AuE.calcArea(14, 12, true);
		System.out.println(area);
	}
}
