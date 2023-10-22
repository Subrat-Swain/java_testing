package com.anvsystems.entities;

import java.io.Serializable;

import java.util.List;

public class Customer implements Serializable{

	private String customerId;
	private String firstName;
	private String lastName;
	private String dob;
	private String email;
	private String phone;
	
	// Compositon:- as customer has an address 1 to 1 relationship;
	private Address address;
	
	// Composition:-1 to many relationship(Has-A relationship);
	private List<Preference> preferences;
	
	//Getters & Setters:-
	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Preference> getPreferences() {
		return preferences;
	}

	public void setPreferences(List<Preference> preferences) {
		this.preferences = preferences;
	}
	
}
