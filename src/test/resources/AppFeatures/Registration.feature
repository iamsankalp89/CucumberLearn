Feature: User Registration

Scenario: user Registration with different data
  Given User is on Registration page
  When User enters following user details
        |Sankalp|Automation|sankalp@gmail.com|92222|Pune|
        |Harish|QA|hb@gmail.com|33222|Gonda|
        |Vikalp|Dev|vk@gmail.com|92222|Bangalore|
  Then User Registration should be successful

Scenario: user Registration with different data with column
  Given User is on Registration page
  When User enters following user details with column
      |name|profile|email|mobile|city|
      |Sankalp|Automation|sankalp@gmail.com|92222|Pune|
      |Harish|QA|hb@gmail.com|33222|Gonda|
      |Vikalp|Dev|vk@gmail.com|92222|Bangalore|
  Then User Registration should be successful