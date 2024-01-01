Feature: Login Feature

  Scenario Outline: Login Fail - Possible Combinations
    Given user is on application landing page
    When user click on sign in button
    Then user name is displayed on login screen
    When user enters "<username>" in username field
    And user enters "<password>" in password field
    And user click on sign in button
    Then user gets login failed error message

    Examples:
    |username|password|
    |incorrectUser1|password111|
    |incorrectUser2|password112|
    |incorrectUser2|password32|