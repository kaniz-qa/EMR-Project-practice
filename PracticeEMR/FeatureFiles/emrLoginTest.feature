
Feature: Emrs Login Feature
  This login feature is for login functionality in EMR website  
   

Scenario Outline: Login feature with wrong user id and wrong password

	Given I navigated to emr login page
	When 	I entered wrong "<userid>" and "<password>"
	And   I select language
	And 	I click on login
	Then 	I should receive error message 
	
	Examples: 
      | userid     | password     |
      | user1      | password1    |
      | user2      | password2    |
      | juel       | helloworld   |
     
	
  Scenario: Login feature
  
   Given 	I navigated to emr login page
    When 	I entered correct "admin" and "pass"
    And 	I click on login
   Then 	I am on EMR home page   
   


