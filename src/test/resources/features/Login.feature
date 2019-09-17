@Login 
Feature: Login 

Scenario Outline: A user that is not logged into Travelocity should be able to see the login option 
	Given I am on the Travelocity Home page 
	And I click on the account menu for not logged users
	And click on the available option to log in from the account menu
	And enter a username as <user> on the user field 
	And enter a password as <password> on the password field 
	And I click on the login option
	Then I should be able to see the account menu option for my logged user
	
	Examples: 
	
		|user   |password |
		|"user1"| "pass1" |
		|"user2"| "pass2" |
		
		