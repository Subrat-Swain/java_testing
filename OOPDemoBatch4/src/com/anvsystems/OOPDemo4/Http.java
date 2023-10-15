package com.anvsystems.OOPDemo4;

/**
 * this is a protocol which enables communication
 * between digital devices such as PC's and Mobile Phones
 */
public interface Http {

	/**
	 * This method queries the server to fetch
	 * a new webpage
	 * @param link
	 */
	public void getPage(String link);
	
	/**
	 * This method is used to transmit form data
	 * to the server
	 * @param data
	 * @param link
	 */
	
	public void postPage(String data, String link);
	
	public void putPage(String data, String link);
}
