package com.anvsystems.javademo;

public class ArrayDemo {
	public static void main(String[] args) {
		//datatype[] variablename = <ASSIGN VALUE HERE>
		int[] rollNumbers = {1,2,3,5,6,7,8,9};
		int[] classes = new int[10];
		classes[0] = 6;
		classes[1] = 7;
//		System.out.println(rollNumbers[2]);
		for(int i=0; i<rollNumbers.length; i++) {
			System.out.println("value at position "+i+" is "+rollNumbers[i]);
		}
	}
}
