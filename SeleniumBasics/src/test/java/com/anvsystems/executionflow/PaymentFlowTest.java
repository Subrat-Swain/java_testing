package com.anvsystems.executionflow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PaymentFlowTest {
	
	public WebDriver driver;

	@BeforeTest
	public void testSetupStage() {
		System.setProperty("webdriver.chrome.driver", "./binaries/chromedriver.exe");
	}
	@BeforeMethod
	public void createNewBrowserStep() {
		driver = new ChromeDriver();
	}
	
	@Test
	public void addItemToCartTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/payment-gateway/index.php");
		Select quantity = new Select(driver.findElement(By.name("quantity")));
		quantity.selectByVisibleText("2");
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		Thread.sleep(4000);
		
	}
	@Test
	public void checkoutTest() {
		System.out.println("Checkout Step1");
		Assert.assertEquals(true, false);
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();			
	}
}
