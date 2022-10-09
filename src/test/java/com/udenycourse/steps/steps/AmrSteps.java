package com.udenycourse.steps.steps;

import org.junit.Assert;

import com.udenycourse.steps.pages.AmrPage;
import com.udenycourse.steps.pages.BasePage;

import cucumber.api.java.en.*;

public class AmrSteps {
	
	AmrPage dispo = new AmrPage();
	
	@Given("^I navigate the page of the hotel (.+)$")
		public void navigateToStringList(String link) {
		//String link = new String();
		dispo.navigateLinksfromList("https://www.google.com.mx");
		dispo.navigateLinksfromList(link);
	}
	
	@Then ("^I validate the label is displayed$")  
		public void labelIsDisplayed() throws Exception  {
		Assert.assertTrue("El hotel está disponible" ,dispo.labelDisplayed());
		//dispo.navigateLinksfromList("https://www.google.com.mx")
	}		
		
	//Then("^The label is correct$")
	public void getAgotado() {
		final String value = dispo.textFromElement("Agotado");
		//Assert.assertTrue("Agotado", dispo.textFromElement(value));// encontrar el error. 
	}
}