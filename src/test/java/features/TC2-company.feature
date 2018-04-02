Feature: Company Management

  @regression @standard
  Scenario: Adding a new Company
    Given admin click the add company button
    Then admin will input the company details
      |Fields     |Value         |
      |Companyname|test company  |
      |Slugname   |testcompany   |
      |Email      |root@email.com|
    And admin should create a new company

  @regression @standard
  Scenario: Validating new company
    Given admin enters existing company details
      |Fields     |Value         |
      |Companyname|new company   |
      |slugname   |testcompany   |
      |Email      |root@email.com|
    Then validations message will appear
    And admin will input new details
      |Fields     |Value         |
      |newslug    |mynewslug     |

  @regression
  Scenario: Deleting the created company with invalid password
    Given admin clicked the delete button
    And admin will enter incorrect password
      |Fields     |Value         |
      |password   |invalid       |
    Then password validation message will display

  @regression
  Scenario: Deleting the created company
    Given admin click the delete company button
    Then admin will enter correct pass
      |Fields     |Value         |
      |password   |kinvoman      |

  @regression
  Scenario: Updating the company plan
    Given admin clicks on the list of the company
    Then admin will update the created company