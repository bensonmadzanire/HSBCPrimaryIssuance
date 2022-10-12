Feature: Test the functionality on the SPA
  @CreateNewIssue
  Scenario: Create New Issue
    Given I navigate to the application
    And   I click SSOEnabled checkbox
    And   I enter the username as  "JohnDoe"
    And   I enter the password as "Password11*"
    And   I click login button
    And   I click Create new issue button
    And   I enter the issuer name as "CHEVRON"
    And   I enter the issuer tranche name as "CHEVRONTES"
    And   I click on registration type
    And   I enter the Maturity date
    And   I enter the Tranche currency
    And   I click submit button
    #And   I click the Category and Ratings tab


  Scenario: Adding Issuance without entering mandatory fields
Given I navigate to the application
And   I click SSOEnabled checkbox
And   I enter the username as  "JohnDoe"
And   I enter the password as "Password11*"
And   I click login button
And   I click Create new issue button
And   I click submit button
@DisplayInforscreen
Scenario: Display the info trail screen
Given I navigate to the application
  And   I click SSOEnabled checkbox
  And   I enter the username as  "JohnDoe"
  And   I enter the password as "Password11*"
  And   I click login button
  And   I click the Infor Trail tab
  And   I click the button on "1"
@DisplayDecisionscreen
Scenario: Display the Decision screen
  Given I navigate to the application
  And   I click SSOEnabled checkbox
  And   I enter the username as  "JohnDoe"
  And   I enter the password as "Password11*"
  And   I click login button
  And   I click the Decision screen

  Scenario: Cancelling an Issuance creation screen
    Given I navigate to the application
    And   I click SSOEnabled checkbox
    And   I enter the username as  "JohnDoe"
    And   I enter the password as "Password11*"
    And   I click login button
    And   I click Create new issue button
    And   I click cancel button

  Scenario: Display the Primary Issuance screen
    Given I navigate to the application
    And   I click SSOEnabled checkbox
    And   I enter the username as  "JohnDoe"
    And   I enter the password as "Password11*"
    And   I click login button
    And   I click the Primary Issuance activity tab
    And   I click the button on "1"
    And   I click Create new issue button
    And   I click logic button

  Scenario: Add a Comment
    Given I navigate to the application
    And   I click SSOEnabled checkbox
    And   I enter the username as  "JohnDoe"
    And   I enter the password as "Password11*"
    And   I click login button
    And   I click the Primary Issuance activity tab
    And   I click the button on "0"
    And   I click  Add comment button

  Scenario: Verify the Grid columns title
    Given I navigate to the application
    And   I click SSOEnabled checkbox
    And   I enter the username as  "JohnDoe"
    And   I enter the password as "Password11*"
    And   I click login button
    And   I click the Primary Issuance activity tab
    And   I verify that all the grid column titles are correct
    #And   I click the button on "0"


  Scenario: Verify that the Default Grid restore all the field on the grid
    Given I navigate to the application
    And   I click SSOEnabled checkbox
    And   I enter the username as  "JohnDoe"
    And   I enter the password as "Password11*"
    And   I click login button
    And   I click the Primary Issuance activity tab
    And   I click the column button
    And   I click the checkbox to unselect the values
    #And   I click the default grid button

  Scenario: Verify that the clear filter clears filters all the field on the grid
    Given I navigate to the application
    And   I click SSOEnabled checkbox
    And   I enter the username as  "JohnDoe"
    And   I enter the password as "Password11*"
    And   I click login button
    And   I click the Primary Issuance activity tab
    And   I click the clear filters button