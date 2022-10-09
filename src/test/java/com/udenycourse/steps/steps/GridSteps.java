package com.udenycourse.steps.steps;

import org.junit.Assert;

import com.udenycourse.steps.pages.GridPage;

import cucumber.api.java.en.*;

public class GridSteps {
	
	GridPage grid = new GridPage();
	
	@Given ("^I navigate to a page with a static table$")
	public void navigateToGridPage(){
		grid.navigateToGridPage();
	}
	
	@Then ("^I return the value I request$")
	public void returnValue(){
		String value = grid.getValueFromTable( 4, 4);
		
		Assert.assertEquals( "r: 3, c: 3", value);	
	}
	
	@Then ("^I can validate the table is displayed$")
	public void theTableIsThere() {
		Assert.assertTrue("Table is not there: FAILED", grid.cellStatus());
	}
}
