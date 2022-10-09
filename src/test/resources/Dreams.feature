@Dreams
Feature: Test Search availability

Scenario Outline: Validate availability in a search quotation
		Given I navigate the page of the hotel <link>
		Then I validate the label is displayed
	
	Examples:
	|link																																										|
	|https://dreamsmx.amrcollection.com/accommodations/detail/1686765/2022-12-31/2023-01-01/2?from=SB2&searchId=1f670136-0ede-4752-b6a0-62d2d0fd8722							|
	|https://dreamsmx.amrcollection.com/accommodations/detail/2450406/2022-12-31/2023-01-01/2?from=SB2&searchId=3698b8af-cb8b-4a54-bd22-9d963de2197c							|
	|https://dreamsmx.amrcollection.com/accommodations/detail/214692/2022-12-27/2022-12-31/2?from=SB2&searchId=33508c31-a04e-4200-a06c-81dbffdf40d2&selected_room_pack=96517088	|
		
		