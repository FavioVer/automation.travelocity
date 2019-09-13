@Login 
Feature: Login 

Scenario Outline: A user that is not logged into Travelocity should be able to see the login option 
	Given I select the url of the Travelocity Home page 
	When I go to the url of the Travelocity Home page 
	And enter a username as <user> on the user field 
	And enter a password as <password> on the password field 
	And I click on the available option to login
	Then I should be able to see the account menu option for my logged user
	
	Examples: 
	
		|user   |password |
		|"user1"| "pass1" |
		|"user2"| "pass2" |
		
		