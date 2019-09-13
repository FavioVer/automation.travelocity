@HomePage 
Feature: Home Page 

Scenario: A user that is not logged into Travelocity should be able to see the login option 
	Given I select the url of the Travelocity Home page 
	When I go to the url of the Travelocity Home page 
	Then I should be able to see the account menu for not logged users
	
		