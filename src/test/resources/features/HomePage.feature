@HomePage
Feature: Home Page 

Scenario:
User that is not logged into Travelocity should be able to see the login option
	Given I select the url of the Travelocity Home page 
	When I go to the url of the Travelocity Home page 
	Then I should be able to see the login option
	
		