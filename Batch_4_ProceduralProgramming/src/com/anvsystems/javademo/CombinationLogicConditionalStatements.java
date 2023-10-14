package com.anvsystems.javademo;

public class CombinationLogicConditionalStatements {
	public static void main(String[] args) {
		// Arithmatic/Mathematical operators:- +, -, *, /,%
		// Logical Operators
		// && || !
		
		
//		int a = 2345;
//		int b = 369;
//
//		System.out.println(a%b);
		
		int a = 10;
		int b = 12;
		int c = 14;
		
		if(b>c && c>b) {
			System.out.println("I'll execute a>b, b>c");
		}else if(c>a && b<c) {
			System.out.println("I'll execute c>a, b<c");
		}
	}
}
