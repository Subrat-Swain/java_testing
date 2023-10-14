package com.anvsystem.oopdemo2;

public class VolumeUtils {
	int calcVolume(int radius, int height, boolean isCone) {
		return (int) (0.33 * 3.14 * radius * radius * height);
	}
	int calcVolumeUtils(int radius) {
		return (int)(3.14)* radius * radius;
	}
}
