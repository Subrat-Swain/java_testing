package com.anvsystem.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		List<String> myList = new LinkedList<>();
		myList.add("Subrat");
		myList.add("Sid");
		myList.add("java");
		
		for(int i=0; i<myList.size(); i++) {
			System.out.println("Element at position "+(i+i)+" is "+myList.get(i));
		}
	}
}
