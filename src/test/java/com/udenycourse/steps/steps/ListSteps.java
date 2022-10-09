package com.udenycourse.steps.steps;

import com.udenycourse.steps.pages.ListPage;

import cucumber.api.java.en.*;

import java.util.List;


public class ListSteps {

	ListPage List = new ListPage();

	@Given("^I navigate to the list page$")
	public void navigateListPage() {
		List.navigateListPage();
	}

	@When("^I search (.+) in the list$")
	public void theSearchList(String state) throws InterruptedException {
		List.enterSearchCriteria(state);
	}

	@Then("^I can find (.+) in the list$")
	public void theTableIsThere(String city) {
		List<String> listx = List.getAllSearchResults();
		boolean textIsThere = listx.contains(city);

		if (textIsThere) {
			System.out.println("The text is on the List: PASSED");
		} else {
			throw new Error("The text is NOT on the List: FAILED");
		}
	}
}