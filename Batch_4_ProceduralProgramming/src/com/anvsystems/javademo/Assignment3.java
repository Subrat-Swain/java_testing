package com.anvsystems.javademo;

import java.util.Scanner;

public class Assignment3 {
	/**
	 * WRITE A PROGRAM WITH BELOW CONDITION
	 * write a calculator which presents below
	 * menu to the user
	 * 1. add two numbers
	 * 2. subtract two numbers
	 * 3. multiply
	 * 4. divide
	 * 5. remainder
	 * 6. area
	 * 7. volume
	 * 8. quit
	 * 
	 * the calculator should run infinitely until option
	 * 8 is selected by user
	 * everytime after a calculation is completed
	 * the user should be presented with the menu again
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isRunning = true;
		int optionSelected;
		int a;
		int b;
		System.out.println("##########CALCULATOR##########");
		while(isRunning) {
			System.out.println("Select an option from below menu:");
			System.out.println("1:-add two numbers");
			System.out.println("2:-subtract two numbers");
			System.out.println("3:-multiplay two numbers");
			System.out.println("4:-divide two numbers");
			System.out.println("5:-find remainder two numbers");
			System.out.println("6:-Quit");
			optionSelected = Integer.parseInt(sc.nextLine());
			switch(optionSelected) {
				case 1:
					System.out.print("Enter First Number:-");
					a = Integer.parseInt(sc.nextLine());
					System.out.println("Enter Second Number:-");
					b = Integer.parseInt(sc.nextLine());
					System.out.println("Sum Of Numbers "+a+" and "+b+" is: "+(a+b));
					break;
				case 2:
					System.out.print("Enter First Number:-");
					a = Integer.parseInt(sc.nextLine());
					System.out.println("Enter Second Number:-");
					b = Integer.parseInt(sc.nextLine());
					System.out.println("Substraction Of Numbers "+a+" and "+b+" is: "+(a-b));
					break;
				case 3:
					System.out.print("Enter First Number:-");
					a = Integer.parseInt(sc.nextLine());
					System.out.println("Enter Second Number:-");
					b = Integer.parseInt(sc.nextLine());
					System.out.println("Multiplication Of Numbers "+a+" and "+b+" is: "+(a*b));
					break;
				case 4:
					System.out.print("Enter First Number:-");
					a = Integer.parseInt(sc.nextLine());
					System.out.println("Enter Second Number:-");
					b = Integer.parseInt(sc.nextLine());
					System.out.println("Divide Of two Numbers "+a+" and "+b+" is: "+(a/b));
					break;
				case 5:
					System.out.print("Enter First Number:-");
					a = Integer.parseInt(sc.nextLine());
					System.out.println("Enter Second Number:-");
					b = Integer.parseInt(sc.nextLine());
					System.out.println("Remainder Of Numbers "+a+" and "+b+" is: "+(a%b));
					break;
				case 6:
					System.out.println("Bye Bye");
					isRunning = false;
					break;
				default:
					System.out.println("Invalid Option Selected");
					break;
			}
		}
	}
}
