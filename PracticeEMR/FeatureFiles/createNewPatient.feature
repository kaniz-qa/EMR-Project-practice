
Feature: Emrs New Patient Create Feature

This feature is for creating a new patient feature


 Scenario: New Patient Create Feature
 
    Given I navigated to emr login page
    When 	I entered correct "admin" and "pass"
    And 	I click on login
    And 	I am on EMR home page 
      
    And 	Mouse over on patient main menu
    And 	Click on patient submenu
    And 	Displayed iFrame
    And   Click add new patient
  	And 	Displayed form iFrame
   	And   Select initials
		And   Input  first and last name
		And   Select date of birth and sex
		And   Check on contact
		And   Enter address city postalcode
		And   Select state
		And   Click add for create counrty
		And   Enter Country name
		And   Click add button 
		And   Check on choise
		And   Select provider
		And   Check employer
		And   Enter employer name
		And   Check status
		And   Select religion
		And   Check misc
		And   Input date decseased
		And   Check guardian
		And   Select sex
		And   Enter work phone
		
		
		And   Click on create new patient	
		And   Display model frame 
		And   Click confirm create new patient
		Then  I should be able to see create new patient msg
		
		
		
		