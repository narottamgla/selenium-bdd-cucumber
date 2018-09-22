Feature: Google search
In order to find items
As a generic user
I want to be able to search with Google
 
Scenario: Google search
Given I want to search in Google
When I search for 'Serenity BDD'
Then I should see link to 'Serenity BDD - Automated Acceptance Testing with Style'
 
Scenario Outline: Google search multiple
Given I want to search in Google
When I search for '<search_request>'
  Then I should see link to '<search_result>'
    Examples:
    | search_request | search_result |
    | Serenity BDD | Serenity BDD - Automated Acceptance Testing with Style |
    | Cucumber | Cucumber |
 