package com.anvsystems.learningselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SITU\\OneDrive\\Desktop\\java_testing\\SeleniumBasics\\binaries\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		driver.findElement(By.name("field-keywords")).sendKeys("Sneakers");
		driver.findElement(By.name("field-keywords")).sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}
}
