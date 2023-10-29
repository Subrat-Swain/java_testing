package com.anvsystems.learningselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	/**
	 * Automate Login to demo.guru99.com/v2
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "./binaries/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.demo.guru99.com/v2");
		
		driver.findElement(By.name("uid")).sendKeys("mngr535012");
		driver.findElement(By.name("password")).sendKeys("qasYnys");
		driver.findElement(By.name("btnLogin")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
