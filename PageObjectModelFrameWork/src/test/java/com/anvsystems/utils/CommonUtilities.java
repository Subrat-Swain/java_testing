package com.anvsystems.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
 * <p>This class consist of Re-usable helps / utility methods</p>
 * @author - Subrat Swain
 * @version 1.0
 * @see External References
 */
public class CommonUtilities {

	
	public WebDriver driver;
	
	public CommonUtilities(WebDriver driver) {
		this.driver = driver;
	}
	
	public void navigate(String url) {
		driver.get(url);
	}
	/**
	 * <p>Clicks Provided Element</p>
	 */
	public void clickElement(By locatorType) {
		driver.findElement(locatorType).click();
	}
	/**
	 * <p>Send Keystrokes to provided WebElement</p>
	 */
	public void type(By locatorType, String value) {
		driver.findElement(locatorType).sendKeys(value);
	}
	public static void main(String[] args) {
//		CommonUtilities comm = new CommonUtilities();
//		comm.navigate("https://demo.guru99.com/v2/");
//		comm.type(By.name("uid"), "mngr535012");
//		comm.type(By.name("password"), "qasYnys");
//		comm.clickElement(By.name("btnLogin"));
	
	}
}
