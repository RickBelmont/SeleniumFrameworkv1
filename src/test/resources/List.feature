@List
Feature: List assertion

Scenario Outline: As a Test Engineer, I want to validate that a text is present inside a list
	Given I navigate to the list page
	When I search <state> in the list
	Then I can find <city> in the list
	
	Examples:
	|state		|city						|
	|Washington	|Seattle, Washington		|
	|Illinois	|Chicago, Illinois			|
	
	