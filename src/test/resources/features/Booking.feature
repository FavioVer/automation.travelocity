@Login 
Feature: Login 

Scenario:
User that is not logged into Travelocity should not be able to see the profile icon 
	Given I select the url of the Travelocity Home page 
	When I go to the url of the Travelocity Home page 
	Then I should not be able to see the profile icon
	
		