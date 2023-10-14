package com.anvsystems.javademo;
/**
 * <h1> Example documentation</h1>
 * <p>This is an example documetation</p>
 * This class includes few utility methods
 * to describe jdk documentation techniques.
 * @author Subrat Swain<subrat.swain19991@gmaild.com
 * @version 1.0
 * @since rel 1,2,3
 * @see https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
 */

public class CodingStandardsDemo {
	//anything like this won't be compiled or processed:- Single Line Comment
	/**
	 * Multiline Comments / docs
	 */
	String myString;
	String myCar;
	
	/**
	 * This method assign hello to the declared class member variable
	 */
	public CodingStandardsDemo() {
		this.myString = "Hello";
	}
	/**
	 * This methods gives string length
	 */
	public void getStringLength() {
		System.out.println(this.myString.length());
	}
	public static void main(String[] args) {
		CodingStandardsDemo cd = new CodingStandardsDemo();
		cd.getStringLength();
	}
	
}
