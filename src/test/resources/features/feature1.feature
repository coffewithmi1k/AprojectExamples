Feature: first feature

  Scenario: Check website is ON
    Given User opens Home Page
    Then verifies home page is opened


  Scenario: User is able to login with valid data
    Given User opens Home Page
    And user clicks log in button
    And Fill log in credentials with "scoffe1@mailinator.com" as email and "qwe1156q" as password
    And clicks log in button
    Then verifies user is logged In

  @run
  Scenario: User is able to Register
    Given User opens Home Page
    And click SignUp
    And fills all fields with valid data and random email
    And clicks Sign UP button
    Then verifies sign up confirmation message is displayed