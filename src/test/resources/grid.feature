@Grid
	Feature: Test static table
	
	Rule: The user can return information from a static table
	
	Background: Navigate to the Table web page
		Given I navigate to a page with a static table
		
	Scenario: I want to retrieve the value of a static table
		Then I return the value I request
		
	
		Scenario: I want to validate if the table is displayed
		Then I can validate the table is displayed
