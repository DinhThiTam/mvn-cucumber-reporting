Feature: Register and Login to BankGuru
  I want to use this template for my feature file

  @register_login
  Scenario: Register to system and login
    Given Get login page Url update
    And Open to Register Page update
    When Input to Username update
    And Click to Submit button on page update
    Then Get username and password update
    When Back to Login page update
    And Submit valid info to form login update
    Then Home page is displayed update