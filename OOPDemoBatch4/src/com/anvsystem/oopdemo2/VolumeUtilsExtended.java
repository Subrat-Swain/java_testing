package com.anvsystem.oopdemo2;

public class VolumeUtilsExtended extends VolumeUtils {

	int calcVolume(int radius) {
		return (int) (4 * 3.14 * radius * radius);
	}
	
	public static void main(String[] args) {
		VolumeUtilsExtended VuE = new VolumeUtilsExtended();
		int area = VuE.calcVolume(10);
		System.out.println(area);
	}
}
