Feature: Amazon Order
  In order to check all the pages od order like previous, cancelled and open

  Background:   //here this steps or used in each scenario but we can define them once
    Given a registered user exists
    Given user is navigate to login page
    When user enters user name
    And user enters password
    And user clicks on password
    Then  user navigate to order page

  Scenario: Check Previous order details
    When user is on Previous Orders page Link
    Then user click on Previous Orders details

  Scenario: Check Open order details
    When user is on Open Orders page Link
    Then user click on Open Orders details

  Scenario: Check Cancelled order details
    When user is on Cancelled Orders page Link
    Then user click on Cancelled Orders details



