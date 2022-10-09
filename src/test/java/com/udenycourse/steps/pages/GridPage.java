package com.udenycourse.steps.pages;

public class GridPage extends BasePage {
	
	private String cell = "//*[@id=\"root\"]/div/";
	private String table = "//*[@id=\"root\"]/div/table";
	
	public GridPage() {
		super(driver);
	}
	
	public void navigateToGridPage() {
		navigateTo("https://1v2njkypo4.csb.app");
	}
	
	public String getValueFromTable (int row , int column) {
		
		return getValueFromTable(cell, row, column);
	}
	
	public boolean cellStatus() {
		return elementIsDisplayed(table);
	}
}