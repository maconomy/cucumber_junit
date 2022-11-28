Feature: logintest

	@cucumbertest
  Scenario: loginsuccessful
    Given I want to open browser
    When I login
    Then I expect to see the menu
    And Close browser

  #parameter
  Scenario: login successful with param
  Given I want to open browser
  When I set username "Administrator" and password "1111"
  
  #data driven
  Scenario Outline: login successful with param
  Given I want to open browser
  When I set username <username> and password <password>
  
  Examples:
  	| username | password |
  	| Andy Hansson | 1111 |
  	| Jack Johnson | 1111 |
  