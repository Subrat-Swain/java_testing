package com.anvsystem.oopdemo2;

public class AreaUtils {

	String width;
	String height;
	
	//Constructor Overloadding:-
	AreaUtils(){
		
	}
	AreaUtils(int a, int b){
		
	}
	AreaUtils(int a, int b, int c){
		
	}
	
	
	/**
	 * Method Overloading:-Polymorphism
	 */
	int calcArea(int width, int height) {
		return width * height;
	}
	//	SQUARE
	//	RECTANGLE
	//	TRIANGLE
	
	int calcArea(int width, int height, boolean isTriangle) {
		return (int) (0.5 * width * height);
	}
	public static void main(String[] args) {
		AreaUtils twoDutils = new AreaUtils();
//		int area = twoDutils.calcArea(12, 12);
		int area = twoDutils.calcArea(12, 12,true);
		System.out.println(area);
	}
}
