package com.anvsystem.collections;

import java.util.HashSet;
import java.util.Set;

// Set elements can't be duplicates
public class SetDemo {
	public static void main(String[] args) {
		Set<String> mySet = new HashSet<>();
		mySet.add("java");
		mySet.add("python");
		mySet.add("NodeJS");
		mySet.add("PHP");
	
		System.out.println(mySet);
		
		mySet.add("python");
		mySet.size();
	}
}
