package com.anvsystems.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import com.anvsystems.entities.Address;
import com.anvsystems.entities.Customer;
import com.anvsystems.entities.Preference;

public class DataUtils implements IDataUtils{

	@Override
	public Customer createCustomer(Customer c1) throws IOException {
		
		c1.setCustomerId(UUID.randomUUID().toString().substring(0,8));
//		Customer c = new Customer();
//		c.setCustomerId(UUID.randomUUID().toString().substring(0,8));
//		c.setFirstName("Subrat");
//		c.setLastName("Swain");
//		c.setDob("06091999");
//		c.setEmail("subrat99@gmail.com");
//		c.setPhone("8495934982");
		
//		Address a = new Address();
//		a.setHouseNo("123");
//		a.setLocality("Aiims-road");
//		a.setLandMark("Near Police Academy");
//		a.setCity("Bhubaneswar");
//		a.setDistrict("Jagatsinghpur");
//		a.setState("Odisha");
//		a.setCountry("India");
//		a.setZipcode("754140");
//		
//		List<Preference> prf = new ArrayList<>();
//		Preference p = new Preference();
//		p.setCustomerPreference("Travelling");
//		p.setPreferenceCategory("Adventures");
//		prf.add(p);
//		c.setAddress(a);
//		c.setPreferences(prf);
		
		File file = new File("./Data.dat");
		if(!file.exists()) {
			file.createNewFile();
		}
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos =  new ObjectOutputStream(fos);
		oos.writeObject(c1);
		return c1;
	}

	@Override
	public Customer readCustomer(String id) {
		File file = new File("./Data.dat");
		Customer c = null;
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			// DownCasting:-
			c = (Customer)ois.readObject();
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return c;
	}

	@Override
	public Customer readCustomerByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomer(String id, Customer c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer deleteCustomer(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Customer displayCustomerData(Customer c, String details) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		Customer c = new Customer();
		DataUtils d = new DataUtils();
//		System.out.println("Enter Customer FirstName");
//		c.setFirstName(sc.nextLine());
//		System.out.println("Enter Customer LastName");
//		c.setLastName(sc.nextLine());
//		System.out.println("Enter Customer Date Of Birth");
//		c.setDob(sc.nextLine());
//		System.out.println("Enter Customer E-mail id");
//		c.setEmail(sc.nextLine());
//		System.out.println("Enter Customer Phone Number");
//		c.setPhone(sc.nextLine());
//		d.createCustomer(c);
		
		Customer cust = d.readCustomer("");
		System.out.println(cust.getFirstName());
		System.out.println(cust.getEmail());
		
	}
	
}
