package com.anvsystems.OOPDemo4;

public class Chrome implements Http{

	@Override
	public void getPage(String link) {
		// TODO Auto-generated method stub
		System.out.println("Loading Page "+link);
	}

	@Override
	public void postPage(String data, String link) {
		// TODO Auto-generated method stub
		System.out.println("Submitting form data "+data);
	}

	@Override
	public void putPage(String data, String link) {
		// TODO Auto-generated method stub
		
	}

}
