Feature: Login Management

  @regression @login
  Scenario: Verify invalid login credentials
    Given admin open a browser and navigate to admin tool url
    When admin enters invalid username or password
      |Fields   |Value    |
      |username |example  |
      |password |example  |
    Then admin should not be able to login successfully

  @regression @login
  Scenario: Verify valid login credentials
    When admin enters valid username and valid password
      |Fields   |Value    |
      |username |kinvoker |
      |password |kinvoman |
    Then admin login successfully

  @standard
  Scenario: Verify invalid credentials as standard admin
    Given standard admin enters invalid username or password
      |Fields   |Value    |
      |username |standard |
      |password |example  |
    Then login validation message will appear
    And standard admin should not be able to login

  @standard
  Scenario: Verify valid credentials as standard admin
    Given standard admin enters valid username and password
      |Fields   |Value    |
      |username |cherry   |
      |password |kinvoman |
    Then standard admin should be able to login

#Author: Ryan Tan