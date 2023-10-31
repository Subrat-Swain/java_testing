package com.anvsystems.ecomdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PurchaseToy {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "./binaries/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/payment-gateway/index.php");
//		driver.findElement(By.xpath("//a[text()='Generate Card Number']")).click();
//		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//select[@name='quantity']/option[2]")).click();
		Select quantity = new Select(driver.findElement(By.name("quantity")));
		quantity.selectByVisibleText("5");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("card_nmuber")).sendKeys("1234567890123465");
		Select month = new Select(driver.findElement(By.name("month")));
		month.selectByVisibleText("09");
		Select year = new Select(driver.findElement(By.name("year")));
		year.selectByVisibleText("2025");
		driver.findElement(By.id("cvv_code")).sendKeys("509");
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(3000);
		
		driver.quit();
		
	}
}
