package com.anvsystems.OOPDemo4;

public class Firefox implements Http{

	@Override
	public void getPage(String link) {
		// TODO Auto-generated method stub
		System.out.println("Lauching FireFox");
		System.out.println("Navigating Link"+link);
	}

	@Override
	public void postPage(String data, String link) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void putPage(String data, String link) {
		// TODO Auto-generated method stub
		
	}

}
