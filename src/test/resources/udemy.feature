@Google

Feature: Test Google Search functionality

	Scenario: As a User I enter a search criteria
		Given I am on the Google search page
		When I enter a search criteria
		And click on the search button
		Then the results match the criteria

