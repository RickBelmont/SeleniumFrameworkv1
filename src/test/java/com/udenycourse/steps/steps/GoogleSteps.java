 package com.udenycourse.steps.steps;


import org.junit.Assert;

import com.udenycourse.steps.pages.GooglePage;

import cucumber.api.java.en.*;

public class GoogleSteps {

	GooglePage google = new GooglePage();

	@Given("^I am on the Google search page$")
	public void navigateToGoogle(){
		google.navigateToGoogle();
	}

	@When("^I enter a search criteria$")
	public void enterSearchCriteria() {
		google.enterSearchCriteria("hola");
	}

	@And("^click on the search button$")
	public void clickSearchButton() {
		google.clickGoogleSearch();
	}

	@Then("^the results match the criteria$")
	public void validateResults() {
		Assert.assertEquals("https://mx.hola.com", google.firstResultFunc());
		
	}
}