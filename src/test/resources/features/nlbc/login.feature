Feature: Login to NLBC 
	As a Student
  I want to Login NLBC
  to Learn new technologies

Scenario: Login to NLBC with InValid Data 
	Given the user is navigate to homepage 
	When the user click on join link 
	Then login user page should display to user 
	When the user enters Invalid details 
	And clicks on login button 
	Then the user should not registred successfuly with NLBC 
 