Feature: Google Search feature

  Scenario: Search NLBC in google
    Given User navigate to google Home Page
    When User enters search keyword as "NLBC"
    Then Search result should display as search keywrod "NLBC"
