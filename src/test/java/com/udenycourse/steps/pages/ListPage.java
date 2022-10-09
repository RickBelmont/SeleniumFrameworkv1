package com.udenycourse.steps.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebElement;

public class ListPage extends BasePage {
	
	private String searchField = "/html/body/form/input";
	private String searchResults = "name";
	
	public ListPage () {
		super(driver);
	}
	
	public void navigateListPage () {
		navigateTo("https://andreidbr.github.io/JS30/06AjaxTypeAhead/index.html?");
	}
	
	public void enterSearchCriteria (String state) throws InterruptedException {
		try {
		Thread.sleep(1000);
		write(searchField, state);
		}catch(NoSuchElementException err) {
			System.out.println("The WebElement Search Field couldn´t be found");
			err.printStackTrace();
		}
		
	}
	
	public List <String> getAllSearchResults(){
		List <WebElement> list = bringAllElements(searchResults);
		List <String> stringFromList = new ArrayList<String>();
		for(WebElement results :list) {
			stringFromList.add(results.getText());
		}
		return stringFromList;
	}
}