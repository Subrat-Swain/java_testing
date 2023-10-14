package com.anvsystems.javademo;

public class ConditionalStatements {
	
	// if(<CONDITION>){
	// ...
	// }else {
	// ...
	// ...
	// }
	
	public static void main(String[] args) {
//		if(4>5) {
//			System.out.println("I will not execute");
//		}else {
//			System.out.println("I'll Execute");
//		}
		
//		int a = 8;
//		int b = 9;
//		if(a>b) {
//			System.out.println("a greater than b");
//		}else {
//			System.out.println("a less than b");
//		}
		
		int a = 11;
		int b = 9;
		int c = 10;
		if(a>b) {
			System.out.println("A greater than B");
		}else if (b>c) {
			System.out.println("B greater than C");
		}else if (a>c) {
			System.out.println("A greaer than C");
		}else {
			System.out.println("A less than C");
		}
	}
	}
