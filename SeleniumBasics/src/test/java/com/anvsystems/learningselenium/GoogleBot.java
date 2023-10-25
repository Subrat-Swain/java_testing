package com.anvsystems.learningselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleBot {

	public static void main(String[] args) throws InterruptedException {
		
//		System.out.println(System.getProperty("os.name"));
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SITU\\OneDrive\\Desktop\\java_testing\\SeleniumBasics\\binaries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
//		WebElement e1 = driver.findElement(By.name("q"));
//		e1.sendKeys("Automation");
		driver.findElement(By.name("q")).sendKeys("Automation");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
		
		// Composition:-----
		
		Engine e = new Engine();
		e.setType("diesel");
		
		Car c = new Car();
		c.setMake("hyundai");
		c.setEngine(e);
	}
 }
