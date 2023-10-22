package com.anvsystem.collections;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		// ArrayList list = new Arraylist();
		// InterfaceName(<DATATYPE> Variable = new ImplementationClass()
		List<String> myStrings = new ArrayList<>();
		myStrings.add("subrat");
		myStrings.add("Sid");
		myStrings.add("java");
//		System.out.println("Before Remoing elements"+myStrings);
//		myStrings.remove(2);
//		System.out.println("After Removing elements"+myStrings);
		
		for(int i=0; i<myStrings.size(); i++) {
			System.out.println("Element at position "+(i+i)+" is "+myStrings.get(i));
		}
		
//		String[] myVals = {"abc", "def"};
//		System.out.println(myVals);
	}
}
