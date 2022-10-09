package com.udenycourse.steps.pages;

import org.openqa.selenium.By;

public class GooglePage extends BasePage{

	private String searchButton = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]";
	private String searchTextField = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";
	private String firstResult = "//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/a/div/cite";
			//"//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]";
	
	public GooglePage() {
		super(driver);
	}
	
	public void navigateToGoogle() {
		navigateTo("https://www.google.com");
		
	}
	
	public void clickGoogleSearch() {
		clickElement(searchButton);
	}
	
	public void enterSearchCriteria(String criteria) {
		write(searchTextField , criteria);
		
	}
	
	public String firstResultFunc() {
		return textFromElement (firstResult);
	}
	
}