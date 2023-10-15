package com.anvsystems.OOPDemo4;

public class Windows {

	public static void main(String[] args) {
		Http cr = new Chrome();
		cr.getPage("https://www.gmail.com");
		
		Http fox = new Firefox();
		fox.getPage("https://www.gmail.com");
	}
}
