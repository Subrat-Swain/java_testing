package com.anvsystems.eh;
import java.util.Scanner;

public class AreaCalculator {
	
	public static void main(String[] args) {
		int length;
		int width;
		int option;
		boolean isRunning = true;
		
		Scanner sc = new Scanner(System.in);
		
		while(isRunning) {
			System.out.println("Please Select Option from below menu");
			System.out.println("1. Calculate Area of Square");
			System.out.println("2. Calculate Area of rectagle");
			System.out.println("3. Calculate Area of Triangle");
			System.out.println("4. Quit Program");
			option = Integer.parseInt(sc.nextLine());
			switch(option) {
			case 1:
				
				try {
					System.out.println("Enter Length Of Side");
					length = Integer.parseInt(sc.nextLine());
					System.out.println("Area is "+(length * length));
				}catch(Exception e) {
					throw new InvalidInputParametersException("Invalid Inputs");
				}
				break;
				
			case 2:
				try {
					System.out.println("Enter Length of Side");
					length = Integer.parseInt(sc.nextLine());
					System.out.println("Enter Width");
					width = Integer.parseInt(sc.nextLine());
					System.out.println("Area is "+(length * width));
				}catch(Exception e) {
					throw new InvalidInputParametersException("Invalid Inputs");
				}
				break;
				
			case 3:
				try {
					System.out.println("Enter Base");
					length = Integer.parseInt(sc.nextLine());
					System.out.println("Enter Height");
					width = Integer.parseInt(sc.nextLine());
					System.out.println("Area is "+(0.5 * length * width));
				}catch(Exception e) {
					throw new InvalidInputParametersException("Invalid Inputs");
				}
				break;
				
			case 4:
				System.out.println("Bye!");
				isRunning = false;
				break;
				
			default:
				System.out.println("Please Enter Valid Option");
				break;
			}
		}
		
	}
}
