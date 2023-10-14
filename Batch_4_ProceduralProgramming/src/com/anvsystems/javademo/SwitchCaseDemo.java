package com.anvsystems.javademo;

import java.util.Scanner;

public class SwitchCaseDemo {
	public static void main(String[] args) {
		
		/**\
		 * switch(<CONDITION>){
		 * CASE 1;
		 * ...
		 * 	break;
		 * 
		 * case 2;
		 * ...
		 * break;
		 * }
		 */
		int option;
		String myMessage = "";
		String myMessage2 = "";
		String encrypted = "";
		String decrypted = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------------");
		System.out.println("Enter option from below menu");
		System.out.println("Encrypt a String");
		System.out.println("Decrypt a String");
		option = Integer.parseInt(sc.nextLine());
		switch(option) {
		case 1:
			System.out.print("Enter String to Encrypt:- ");
			myMessage = sc.nextLine();
			for(int i = 0; i<myMessage.length(); i++) {
				encrypted += (int)myMessage.charAt(i)+".";
			}
			System.out.println("Encrypted String is:-"+encrypted);
			break;
			
		case 2:
			System.out.println("Enter String to Decrypt:- ");
			myMessage2 = sc.nextLine();
			String[] tempMessage = myMessage2.split("\\.");
			for(int i=0;i<tempMessage.length; i++) {
				decrypted+=(char)Integer.parseInt(tempMessage[i]);
			}
			System.out.println("Decrypted String is:-"+decrypted);
			break;
			
		default:
			System.out.println("Wrong input. Please Check");
			
		}
	}
}
