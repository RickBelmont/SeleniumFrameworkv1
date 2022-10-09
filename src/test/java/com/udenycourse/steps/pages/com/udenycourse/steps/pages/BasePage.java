package com.udenycourse.steps.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage{

	protected static WebDriver driver;
	private static WebDriverWait wait;
	private static Actions action;
	
	static {
		ChromeOptions options = new ChromeOptions();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver105.exe");
		//driver = new ChromeDriver(options);
		driver =  new ChromeDriver(capabilities); 
		wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		options.addArguments("incognito");
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
	}
	
	public BasePage(WebDriver driver) {
		BasePage.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		
	}
	public static void navigateTo(String url) {
		driver.get(url); 
	}
	
	public static void closeBrowser () {
		driver.quit();
	}
	
	private WebElement Find (String locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		//return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
		
	}	
	public void clickElement(String locator) {	
		Find(locator).click();
	}
	
	public void write(String locator, String textToWrite) {
		Find(locator).clear();
		Find(locator).sendKeys(textToWrite);
		
	}
	
	public void selectFromDropdownByValue(String locator, String valueToSelect) {
		Select dropdown = new Select (Find(locator));
		
		dropdown.selectByValue(valueToSelect);
	}

	public void selectFromDropdownByIndex(String locator, int valueToSelect) {
		Select dropdown = new Select (Find(locator));
		
		dropdown.selectByIndex(valueToSelect);
	}
	
	public void selectFromDropdownByText(String locator, String valueToSelect) {
		Select dropdown = new Select (Find(locator));
		
		dropdown.selectByVisibleText(valueToSelect); 
	}
	
	public void hoverOverElement(String locator) {  //pasar el mouse por encima de un menu
		action.moveToElement(Find(locator)).click().build().perform();
		
	}
	
	public String textFromElement (String label) {
		return Find(label).getText();
	}
	
	public String getValueFromTable (String locator , int row , int column) {
		String cellINeed = locator + "/table/tbody/tr["+row+"]/td["+column+"]";
		
		return Find(cellINeed).getText();
	}
	
	public boolean elementIsDisplayed (String locator) {
		return Find(locator).isDisplayed();
	}
	
	public List<WebElement> bringAllElements(String locator){
		return driver.findElements(By.className(locator));
	}
	
}