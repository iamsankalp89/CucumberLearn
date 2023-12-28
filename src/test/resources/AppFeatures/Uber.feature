@All
Feature: Uber Booking Feature

  @Smoke
  Scenario: Booking Cab Sedan
    Given User want to select a car type "Sedan" from uber app
    When User select car "Sedan" and pick up point is "Bangalore" and drop location is "Pune"
    Then Driver start the journey
    And Driver end the journey
    Then User pays 1000 money

  @Smoke @Regression
  Scenario: Booking Cab SUV
    Given User want to select a car type "SUV" from uber app
    When User select car "SUV" and pick up point is "Chennai" and drop location is "Pune"
    Then Driver start the journey
    And Driver end the journey
    Then User pays 1300 money

    @Sanity
  Scenario: Booking Cab Mini
    Given User want to select a car type "Mini" from uber app
    When User select car "Mini" and pick up point is "Ooty" and drop location is "Pune"
    Then Driver start the journey
    And Driver end the journey
    Then User pays 3300 money



