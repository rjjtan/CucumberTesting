Feature: User Management in Company Profile

  @regression @standard
  Scenario: Adding company user details
    Given admin clicks the add user button
    And admin will input the correct company user details
      |Fields   |Value               |
      |email    |test@mailinator.com |
      |Firstname|Ryan                |
      |Lastname |Tan                 |
    Then admin will successfully add the company user

  @regression @standard
  Scenario: Company user validation
    Given admin click the add user button
    And admin will input the existing user details
      |Fields   |Value               |
      |email    |test@mailinator.com |
      |Firstname|Bryan               |
      |Lastname |Wei                 |
    Then admin will not successfully add the company user
    And error message will display
    Then admin will input new email
      |Fields   |Value               |
      |email    |new@mailinator.com  |

  @regression
  Scenario: Delete Company user
    Given admin clicks the delete icon
    And admin clicks the button to confirm
    Then admin successfully remove the company user

  @regression @standard
  Scenario: Company user validation
    Given admin clicks the edit icon
    And admin updates the company user info
      |Fields   |Value               |
      |email    |root@email.com      |
    Then validation message will display

  @regression @standard
  Scenario: Update company user details
    Given admin clicked the edit icon
    And admin update the email field
      |Fields   |Value               |
      |email    |mynew@email.com     |
    Then admin successfully update the company user info

  @regression @standard
  Scenario: Transferring root role
    Given admin clicked the transfer root role
    Then new user will have a root role
