package com.anvsystem.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderUtils {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\SITU\\OneDrive\\Desktop\\java_testing\\OOPDemoBatch4\\data.txt");
//		System.out.println(file.canRead());
		FileReader fr = new FileReader(file);
//		int single;
//		while((single = fr.read()) != -1) {
//			System.out.print((char)single);
//		}
////		System.out.println(fr.read());
		
		String content = null;
		BufferedReader br = new BufferedReader(fr);
		while((content = br.readLine()) != null){
			System.out.println(content.split(" ").length - 1);
		}
	}
}
