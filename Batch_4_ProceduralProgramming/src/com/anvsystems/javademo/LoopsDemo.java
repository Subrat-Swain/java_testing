package com.anvsystems.javademo;

public class LoopsDemo {
	public static void main(String[] args) {
		// Loops types
		// for loop
		// while loop
		// do while loop
		
		/**
		 * for(<DECLARATION>; <CONDITIONAL CHECK>; <INCREMENTOR / DECREMENTOR>){
		 * }
		 * i = i + 1;
		 */
		
		//Increment:-
//		for(int i=0; i<10; i++) {
//			System.out.println("Iterating loop count "+i);
//		}
		//Decrement:-
//		for(int i =10; i>0; i--) {
//			System.out.println("Iterating loop count "+i);
//		}
		
//		for(int i=0; i % 2 == 0; i++) {
//			System.out.println("Iterating loop count"+i);
//		}
		
		/**
		 * while(<CONDITION>){
		 * ...
		 * increment/decrement
		 * }
		 */
//		int i = 0;
//		while(i<10) {
//			System.out.println("Iterating loop count"+i);
//			i++;
//		}
		
		/**
		 * do{
		 * ....
		 * }while(<CONDITION>)
		 * It will execute once minimum
		 */
		int i = 0;
		do {
			System.out.println("I'll always execute");
			i++;
		}while(i<10);
		
	}
}
