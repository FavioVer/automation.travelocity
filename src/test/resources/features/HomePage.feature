@HomePage
Feature: Home Page

Scenario: A user that is not logged in Travelocity should be able to see the login option
	Given I am on the Travelocity Home page
	And I am not logged in Travelocity
	When I click on the account menu for not logged users
	Then I should be able to see the create account option

@ServicesSection
Scenario: A user that is not logged in Travelocity should be able to see and click the options for services selection
	Given I am on the Travelocity Home page
	And I am not logged in Travelocity
	When I go to the section for services selection
	Then All the options for services selection should be visible and clickable

@HotelSection
Scenario: A user that is not logged in Travelocity should be able to see all the options for Hotels search
	Given I am on the Travelocity Home page
	And I am not logged in Travelocity
	When I click on the Hotels selection
	Then The destination input is visible and enable
	And The check in input should be visible and enable
	And The search button should be visible and clickable