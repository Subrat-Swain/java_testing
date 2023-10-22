package com.anvsystems.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.anvsystems.entities.Address;
import com.anvsystems.entities.Customer;
import com.anvsystems.entities.Preference;

public class DataUtils implements IDataUtils{

	@Override
	public Customer createCustomer(Customer c1) throws IOException {
		Customer c = new Customer();
		c.setCustomerId(UUID.randomUUID().toString().substring(0,8));
		c.setFirstName("Subrat");
		c.setLastName("Swain");
		c.setDob("06091999");
		c.setEmail("subrat99@gmail.com");
		c.setPhone("8495934982");
		
		Address a = new Address();
		a.setHouseNo("123");
		a.setLocality("Aiims-road");
		a.setLandMark("Near Police Academy");
		a.setCity("Bhubaneswar");
		a.setDistrict("Jagatsinghpur");
		a.setState("Odisha");
		a.setCountry("India");
		a.setZipcode("754140");
		
		List<Preference> prf = new ArrayList<>();
		Preference p = new Preference();
		p.setCustomerPreference("Travelling");
		p.setPreferenceCategory("Adventures");
		prf.add(p);
		c.setAddress(a);
		c.setPreferences(prf);
		File file = new File("./Data.txt");
		if(!file.exists()) {
			file.createNewFile();
		}
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos =  new ObjectOutputStream(fos);
		oos.writeObject(c);
		return c;
	}

	@Override
	public Customer readCustomer(Customer id) {
		// TODO Auto-generated method stub
		return null;
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
	
	public static void main(String[] args) throws IOException {
		DataUtils d = new DataUtils();
		d.createCustomer(null);
	}
	
}
