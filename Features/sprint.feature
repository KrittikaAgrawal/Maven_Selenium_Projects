Feature: HRM Login Test Case

Scenario: Verify user is able to login with valid user id and password and logout
    Given browser is open and application is in login page
    When user enters user name and password
    Then home page is displayed
    Then user is loggedout