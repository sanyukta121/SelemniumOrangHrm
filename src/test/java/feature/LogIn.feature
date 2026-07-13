Feature: Login to Application
  Scenario: Login using valid credentials
    Given User navigating to login page
    When user enters valid username and password
    And click on the login button
    Then user directed to the dashboard

