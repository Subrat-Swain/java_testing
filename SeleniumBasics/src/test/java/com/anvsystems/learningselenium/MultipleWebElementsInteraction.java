package com.anvsystems.learningselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWebElementsInteraction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "./binaries/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://form-bot-anvsystems.pages.dev");
		
		List<WebElement> element = driver.findElements(By.xpath("//form/label[7]/label"));
		
		for(int i = 0; i<element.size();i++) {
			String elementText = element.get(i).getText();
			System.out.println(elementText);
			if(elementText.contains("JavaScript")) {
				System.out.println("PASSED");
				break;
			}
		}
//		Thread.sleep(3000);
		
		List<WebElement> countries = driver.findElements(By.xpath("//select[@name='country']/option"));
		for(WebElement el : countries) {
			System.out.println(el.getText());
		}
		driver.quit();
	}
}
