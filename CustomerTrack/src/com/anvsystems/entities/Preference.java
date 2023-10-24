package com.anvsystems.entities;

import java.io.Serializable;
// Not Implemented for serialization
public class Preference implements Serializable{

	private String customerPreference;
	private String preferenceCategory;
	public String getCustomerPreference() {
		return customerPreference;
	}
	public void setCustomerPreference(String customerPreference) {
		this.customerPreference = customerPreference;
	}
	public String getPreferenceCategory() {
		return preferenceCategory;
	}
	public void setPreferenceCategory(String preferenceCategory) {
		this.preferenceCategory = preferenceCategory;
	}
	
}
