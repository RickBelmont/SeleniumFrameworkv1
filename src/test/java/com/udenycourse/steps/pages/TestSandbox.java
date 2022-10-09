package com.udenycourse.steps.pages;


public class TestSandbox extends BasePage {
	
	public String categoryDropdown = "input[@class=\'dropdown']:";
	
	public TestSandbox() {
		super(driver);
	}
	
	public void navigateToTheSandBoxSite() {
		navigateTo("https://www.dreamsresorts.com.mx");
		
	}
			
	//public void selectCategory(String category) {
		//selectFromDropdownByText(categoryDropdown, category);//falta el locator cuyo nombre es categoryDropdown
		
	
	
	public void moveCursorover () {
		hoverOverElement(categoryDropdown);
		
	}
	
}
		