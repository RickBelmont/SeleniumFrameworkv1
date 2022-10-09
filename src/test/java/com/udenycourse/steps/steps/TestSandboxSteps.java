package com.udenycourse.steps.steps;

import com.udenycourse.steps.pages.TestSandbox;

import cucumber.api.java.en.*;

public class TestSandboxSteps{
	
	TestSandbox sandboxPage = new TestSandbox();
	
	@Given("^I navigate to the sandbox page$")
	public void navigateToTheSandBoxSite() {
		sandboxPage.navigateToTheSandBoxSite();
	}
	@And("^select a value from the dropdown$")
	public void selectState () {
		sandboxPage.hoverOverElement("resorts");
	}
}

