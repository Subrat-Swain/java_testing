package com.anvsystems.executionflow;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlowExecutionTest {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("I am Before Test");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am Before Method");
	}

	@Test
	public void test1() {
		System.out.println("I am Test 1");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("I am After Test");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am After Method");
	}
}
