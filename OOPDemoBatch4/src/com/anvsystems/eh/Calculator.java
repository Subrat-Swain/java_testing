package com.anvsystems.eh;

import java.util.Scanner;

public class Calculator {

	// THROWABLE:-
	
	// ERROR
	// EXCEPTION - CHECKED EXCEPTION & UNCHECKED EXCEPTIONS
	
	public static void main(String[] args) {
//		System.out.println("The result is "+(12/0));
		
		int a;
		int b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter First Number");
		a = Integer.parseInt(sc.nextLine());
		System.out.println("Please Enter Second Number");
//		b = "giohgahgdh"; //Checked Exception
		b = Integer.parseInt(sc.nextLine());
		try {
			System.out.println("Quotient is "+(a/b));
		}catch(Exception e) {
//			e.printStackTrace();
//			System.out.println("Arithmatically Impossilbe Scenario! Please check Inputs ");
			throw new NotAnticipatedException("Something Wrong Happened!");
		} finally {
			System.out.println("Closing Connection! Bye");
		}
	}
}