@Login
Feature: Login

  Scenario Outline: A registered user should be able to log in to Travelocity with valid user and valid password
    Given I am on the Travelocity Home page
    And I click on the account menu for not logged users
    And click on the available option to log in from the account menu
    And enter a username as <email> on the user field
    And enter a password as <password> on the password field
    And I click on the login option
    Then I should be able to see the account menu option for my logged user

    Examples:

      | email       | password    |
      | "validPass" | "validPass" |
		
		