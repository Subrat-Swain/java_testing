package com.anvsystems.learningselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UiInteraction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.chrome.driver", "./binaries/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com");
		
		driver.findElement(By.id("search2")).sendKeys("Html");
		
		Thread.sleep(1000);
		
//		driver.findElement(By.xpath("//a[@id='navbtn_tutorials']"));
		
		//Mouse Movement Hover:-
		Actions actions = new Actions(driver);
		
		actions.moveToElement(driver.findElement(By.xpath("//a[@title='Tutorials and References']")))
		.build()
		.perform();
		
		Thread.sleep(2500);
		
		//Scroll:- Using Javascript from selenium directly;
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//h5[text()= 'Get Certified']")));
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
