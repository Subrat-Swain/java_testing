package com.anvsystem.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryOwnFileHandling {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\SITU\\OneDrive\\Desktop\\java_testing\\OOPDemoBatch4\\assignmentdata.txt");
		FileReader fr = new FileReader(file);
		
		String content = null;
		BufferedReader br = new BufferedReader(fr);
		while((content = br.readLine()) != null) {
			System.out.println(content);
//			System.out.println(content.split(" ").length-1);
			
		}
	}
}
