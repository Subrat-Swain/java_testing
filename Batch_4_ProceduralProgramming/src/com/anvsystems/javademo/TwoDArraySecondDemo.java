package com.anvsystems.javademo;

public class TwoDArraySecondDemo {
	public static void main(String[] args) {
		
//		| MON
//		| TUE
//		| WED	
//		1D  |Maths | PHysics | Geography | Games| tiffin
//		|
		
		String[][] timeTable = {
				{"MON", "Maths", "Physics", "Geography"},
				{"TUE", "History", "Physics", "Civics"}
		};
//		timeTable[0][3]
		for(int i=0; i<timeTable.length; i++) {
			System.out.println("\nValue of i is:-"+i);
			for(int j=0; j<timeTable[i].length;j++)
				System.out.print(timeTable[i][j]+" | ");
		}
	}
}
