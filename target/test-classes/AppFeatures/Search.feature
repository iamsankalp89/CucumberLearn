Feature: Amazon Search

  @Smoke
  Scenario: Search a Product mac book
    Given I have a search field on Amazon Page
    When I search a product with name "Apple mac book pro" and price 10000
    Then Product with name "Apple mac book pro" should be displayed
    Then user will purchase

  @Regression
  Scenario: Search a Product iPhone
    Given I have a search field on Amazon Page
    When I search a product with name "iPhone" and price 1200
    Then Product with name "iPhone" should be displayed



