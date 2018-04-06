Feature: Logout

  @regression @end2end
  Scenario: Verify Logout
    Given user has already logged in
    And user click logout
    Then user must be logged out