package com.seleniumReusableFunctions;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseClass.Library;

public class SeleniumUtilities extends Library {
	Actions action;
	public SeleniumUtilities(WebDriver driver) {
		this.driver = driver;
		logger = Logger.getLogger(Library.class);
		
	}

	public void to_take_screenshot(String path) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(source, new File(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void getTitle() {
		System.out.println(driver.getTitle());
	}

	public void Explicitlywait(String Locator) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(Locator))));
	}

	public void SelectDropDown(WebElement locator, String selectedValue) {
		Select select = new Select(locator);
		select.selectByVisibleText(selectedValue);
	}

	public void moveto(WebElement locator) {
		Actions action = new Actions(driver);
		action.moveToElement(locator).build().perform();
	}

	public void sendkeysEnter() {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.ENTER).build().perform();
	}

	public void pageVerification(String expectedURL) {
		try {
			String URL = driver.getCurrentUrl();
			Assert.assertEquals(expectedURL, URL);
			logger.info("URL matches with the ExpectedURL");

		} catch (Exception e) {
			logger.info("URL Does not match with the ExpectedURL");
		}
	}

	public void isDisplayed(WebElement locator) {
		Boolean Answer = null;
		try {
			Answer = locator.isDisplayed();
			System.out.println("The Element is displayed" +Answer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("The Element is not displayed" +Answer);
		}
		
	}
	public void isEnabled(WebElement locator) {
		Boolean Answer = null;
		try {
			Answer = locator.isEnabled();
			System.out.println("The Element is enabled" +Answer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("The Element is not enabled" +Answer);
		}
		
	}
	public void selectElementFromList(List<WebElement> lists, String givenText) {
		action= new Actions(driver);
		try {		
     
			for (WebElement option : lists) {
				
				if (option.getText().equalsIgnoreCase(givenText))
               action.sendKeys(Keys.ENTER).build().perform();
				logger.info("Option clicked");
				break;
			}
		} catch (Exception e) {
			logger.info("option not clicked");
		}
	}
	
	public void waittime(long value) throws InterruptedException {
		Thread.sleep(value);
	}
	
	public void navigatetoCurrentURL() {
		driver.navigate().to(driver.getCurrentUrl());
	}

	public void quit() {
		driver.close();

	}
}
