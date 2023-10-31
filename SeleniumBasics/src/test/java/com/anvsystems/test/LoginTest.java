package com.anvsystems.test;

import org.testng.annotations.Test;
import org.testng.Assert;

public class LoginTest {

	@Test
	public void compareTest() {
		String name = "Sid";
		Assert.assertEquals("Sid", name);
	
	}
}
