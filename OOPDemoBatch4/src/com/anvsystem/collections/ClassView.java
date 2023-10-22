package com.anvsystem.collections;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ClassView {
	
//	public void findAverageMarks(int size, List<Integer> myMarks) {
//		for(int i = 0; i< size ; i++) {
//			System.out.println("Enter "+(i+1)+"Student Mark");
//			myMarks.add(sc.nextInt());
//		}
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Numbers Of Students");
//		int size = Integer.parseInt(sc.nextLine());
		List <Integer> markList = new ArrayList<>();
		boolean isRunning = true;
		int option;
		
		while(isRunning) {
			System.out.println("Select Option From Below Menu: ");
			System.out.println("1. Enter another");
			System.out.println("2. Find Average Marks");
			System.out.println("3. Quit");
			option = Integer.parseInt(sc.nextLine());
			switch(option) {
			case 1:
				System.out.println("Enter Mark");
				markList.add(Integer.parseInt(sc.nextLine()));
				break;
			case 2:
				int totalMarks = 0;
				System.out.print("Average marks is : ");
				for(int i=0; i<markList.size(); i++) {
					totalMarks+=markList.get(i);
				}
				System.out.print(totalMarks / markList.size());
				System.out.println();
				break;
				
			case 3:
				isRunning = false;
				System.out.println("Bye!");
				break;
			}
		}
	}
}
