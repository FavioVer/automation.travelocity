@BaseBooking
Feature: Base Booking 

Background: User should not be logged in to Travelocity 
	Given I select the url of the Travelocity Home page 
	When I go to the url of the Travelocity Home page 
	Then I should not be logged in 
	
Scenario Outline: Validate sum of two numbers 
	Given I have a <numberA> 
	And I have another <numberB> 
	When I add the two numbers 
	Then the result of the sum is <result> 
	
	Examples: 
	
		|numberA| numberB| result|
		|   1	|	2	 |	3	 |
		
Scenario Outline: Validate the substraction between numbers 
	Given I have a <numberA> 
	When I substract a <numberB> 
	Then the result of the substraction is <result> 
	
	Examples: 
	
		|numberA| numberB| result|
		|   5	|	1	 |	4	 |
		|   3	|	10	 |	-7	 |