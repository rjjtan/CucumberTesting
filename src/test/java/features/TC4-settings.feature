Feature: Settings (Admin User Management)

  @regression
  Scenario: Creating standard user
    Given admin clicks the settings menu
    And clicks the add user button
    Then admin fills out the required fields
      |Fields       |Value               |
      |firstname    |Ryan                |
      |lastname     |Tan                 |
      |email        |admintest@email.com |
      |username     |standardadmin       |
      |password     |password1           |
    And admin successfully added a new standard user

  @regression
  Scenario: Creating admin user
     Given admin clicks the button to add a new admin user
     Then admin fills out the fields for admin user
       |Fields       |Value                  |
       |firstname    |John                   |
       |lastname     |Appleseed              |
       |email        |johnappleseed@email.com|
       |username     |adminadmin             |
       |password     |password1              |
     And admin successfully added a new admin user

  @regression
  Scenario: Username validation
    When admin fills out the username with existing username
      |Fields       |Value               |
      |firstname    |Bryan               |
      |lastname     |Hua                 |
      |email        |admin@email.com     |
      |username     |standardadmin       |
      |password     |password2           |
    And validation message for existing username should appear

  @regression
  Scenario: Email address validation
    When admin fills out the email address with existing email address
      |Fields       |Value               |
      |firstname    |Stephen             |
      |lastname     |Go                  |
      |email        |admintest@email.com |
      |username     |standardadmin2      |
      |password     |password3           |
    Then validation message for existing email address should appear

  @regression
  Scenario: Update AdminUser's first name
    Given admin clicks the edit icon to edit firstname
    And admin update the user firstname
      |Fields       |Value          |
      |firstname    |Stephanie      |
    Then admin successfully update the admin firstname

  @regression
  Scenario: Update AdminUser's last name
    Given admin clicks the edit icon to edit lastname
    And admin update the user lastname
      |Fields      |Value          |
      |lastname    |Go             |
    Then admin successfully update the user lastname

  @regression
  Scenario: Update User Role
   Given admin clicked the edit icon to edit user role
   And admin update the user role
   Then admin successfully update the user role

  @regression
  Scenario: Delete admin user
    Given admin clicks the delete icon to delete the created admin user
    Then admin will successfully deleted the admin user