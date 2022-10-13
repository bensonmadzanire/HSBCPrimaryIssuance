Feature: Single Page Application
@CreateComposite
  Scenario: Successful login to the application
    Given I navigate to the application
    And   I click SSOEnabled checkbox
    And   I enter the username as  "JohnDoe"
    And   I enter the password as "Password11*"
    And   I click login button

@Loginfeature
  Scenario: login to the application
    Given I navigate to the application
    And   I click SSOEnabled checkbox
    And   I enter the username as  "JohnDoe"
    And   I enter the password as "Password11*"
    And   I click login button
    And   I click Tranche Name
    And   I click the date and time

    #And   I click Create Composite button









