Feature: Join NLBC 
	As a Student
  I want to Join NLBC
  to Learn new technologies
  
Scenario Outline: Join as Male Student with Valid Data 
	Given the user is navigate to homepage 
	When the user click on join link 
	Then login user page should display to user 
	And User clicks on signup link on login page 
	When the user navigated to signup page 
	And User enters singup details as Email as "<Email>" and Gender as "<Gender>" 
	Then the user should not registred successfuly with NLBC
	Examples: 
		|Email|Gender|ValidationMessage|
		|Testuser@test.com|Male||

@Manual		
Scenario: Veify registred user 
	Given Login to email service provider 
	When click verification link in verification email 
 