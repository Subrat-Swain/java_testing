package com.anvsystems.bytestreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ByteStreamsDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File studentsData = new File("./data/students.txt");
		
		//Output Stream:-
		
//		studentsData.createNewFile();
//		Student s = new Student();
//		s.setFirstName("subrat");
//		s.setLastName("Swain");
//		s.setBranch("MCA");
//		s.setRollNumber(3241);
//		s.setEmail("subrat99@gmail.com");
//		
//		FileOutputStream fos= new FileOutputStream(studentsData);
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(s);
//		oos.close();
//		fos.close();
		
		//Input Stream:-
		
		FileInputStream fis = new FileInputStream(studentsData);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s = (Student) ois.readObject();
		System.out.println(s.getFirstName());
	}
}
