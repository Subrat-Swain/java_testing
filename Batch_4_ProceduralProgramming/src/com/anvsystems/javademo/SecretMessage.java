package com.anvsystems.javademo;

public class SecretMessage {
	// Ceaser Cyper:- Assignment
	public static void main(String[] args) {
//		String[] alphabets = {"a","b","c"};
		//ASCII Values
		
//		//Encryption:-
		
		String myMessage = "Hello there batch 4";
		String encrypted = "";
		for(int i = 0; i<myMessage.length(); i++) {
			encrypted += (int)myMessage.charAt(i)+".";
		}
		System.out.println(encrypted);
		
		//Decryption
		
		String myMessage2 = "72.101.108.108.111.32.116.104.101.114.101.32.98.97.116.99.104.32.52.";
		String decrypted= "";
		String[] tempMessage = myMessage2.split("\\.");
		for(int i=0;i<tempMessage.length; i++) {
			decrypted+=(char)Integer.parseInt(tempMessage[i]);
		}
		System.out.println(decrypted);
		
//		int option;
//		String myMessage = "";
//		Scanner sc = new Scanner(System.in);
//		System.out.println("-------------------------------");
//		System.out.println("Enter option from below menu");
//		System.out.println("1. Encrypt a String");
//		System.out.println("2. Decrypt a String");
//		option = Integer.parseInt(sc.nextLine());
//		switch(option) {
//		
//		case 1:
//			System.out.print("Enter String to Encrypt : ");
//			myMessage = sc.nextLine();
//			String encrypted = "";
//			for(int i=0; i<myMessage.length(); i++) {
//				encrypted+=(int)myMessage.charAt(i)+".";
//			}
//			System.out.println("Encrypted String is : "+encrypted);
//			break;
//			
//		case 2:
//			System.out.println("Decrypting string");
//			break;
//			
//		default:
//			System.out.println("Wrong input. Please check");
//		}
	}
}
