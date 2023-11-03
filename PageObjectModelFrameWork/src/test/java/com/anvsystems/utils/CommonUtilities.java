package com.anvsystems.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

/*
 * <p>This class consist of Re-usable helps / utility methods</p>
 * @author - Subrat Swain
 * @version 1.0
 * @see External References
 */
public class CommonUtilities {

	
	public static WebDriver driver;
	public WebDriverWait wait;
	
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
	/**
	 * <p>waits for configured amount of seconds for an element visibility</p>
	 */
	public void waitForElementToBeVisible(By locator) {
		try {
			wait = new WebDriverWait(driver,
					Duration.ofSeconds(Long.parseLong(Hooks.configData.getProperty("wait.duration"))));
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
	}
	/**
	 * <p>waits for configured amount of seconds for an element clickable</p>
	 */
	public void waitForElementToBeClickable(By locator) {
		try {
			wait = new WebDriverWait(driver,
					Duration.ofSeconds(Long.parseLong(Hooks.configData.getProperty("wait.duration"))));
			wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}
	}
	/**
	 * <p>returns result after validation for equality</p>
	 * @param expected
	 * @param actual
	 */
	public void validateForEquality(String expected, String actual) {
		Assert.assertEquals(expected, actual);
	}
	/**
	 * <p>Extracts Text content of a Webelement</p>
	 * @param locator
	 * @return
	 */
	public String getElementTextContent(By locator) {
		return driver.findElement(locator).getText();
	}
	/**
	 * <p>Captures screenshot of the webpage</p>
	 */
	public static void captureScreenshot() {
		Date scrDate = new Date();
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File screenshotName = new File(Hooks.configData.getProperty("screenshot.directory.path")+
					"/"+scrDate.toString().replace(" ","_").replace(":","_")+".png");
		try {
			FileUtils.copyFile(scrFile, screenshotName);
		}catch(IOException e) {
			e.printStackTrace();
		}
		Reporter.log("<br><img src='"+screenshotName.getAbsolutePath()+"' height='400' width='640' /><br>");
	}
	
	/**
	 * Reads Excel File and returns a 2D Object Array</p>
	 * @return
	 */
	public static Object[][] readExcel(){
		FileInputStream fis;
		try {
			fis = new FileInputStream(new File(Hooks.configData.getProperty("test.data.directory")));
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet(Hooks.configData.getProperty("test.data.sheet"));
			int lastRowNumber = sheet.getLastRowNum();
			int lastCellNumber = sheet.getRow(0).getLastCellNum();
			String[][] loginData = new String [lastRowNumber][lastCellNumber];
			for(int i = 1; i<=lastRowNumber; i++) {
				XSSFRow row = sheet.getRow(i);
//				System.out.println(lastCellNumber);
				for (int j = 0; j<lastCellNumber; j++) {
					XSSFCell cell = row.getCell(j);
					loginData[i-1][j] = cell.getStringCellValue();
			}
				
		}
		return loginData;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
