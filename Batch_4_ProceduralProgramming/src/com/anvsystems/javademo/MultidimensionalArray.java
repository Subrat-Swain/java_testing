package com.anvsystems.javademo;

public class MultidimensionalArray {
	public static void main(String[] args) {
		String[][] myData = {
				{"name", "roll", "email"},
				{"sid", "1", "sed@test.com","another value"},
				{"Bhabani", "2", "bhabani@test.com"}
		};
		//Access Data:-
			// myData[1][2];
		for(int i=0; i<myData.length; i++) {
			for(int j=0; j<myData[i].length;j++) {
				System.out.println("Value at row "+i+" and Column "+j+" is "+myData[i][j]);
			}
		}
	}
}
