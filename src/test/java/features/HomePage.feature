Feature: Test the functionality on the SPA

Scenario: Adding Issuance without entering mandatory fields
Given I navigate to the application
And   I enter the username as  "JohnDoe"
And   I enter the password as "Password11*"
And   I click login button
And   I click Create Composite button
And   I click submit button

Scenario: Display the info trail screen
Given I navigate to the application
And   I enter the username as  "JohnDoe"
And   I enter the password as "Password11*"
And   I click login button
And   I click the Infor Trail tab

Scenario: Display the Decision screen
Given I navigate to the application
And   I enter the username as  "JohnDoe"
And   I enter the password as "Password11*"
And   I click login button
And   I click the Decision screen

  Scenario: Cancelling an Issuance creation screen
    Given I navigate to the application
    And   I enter the username as  "JohnDoe"
    And   I enter the password as "Password11*"
    And   I click login button
    And   I click Create Composite button
    And   I click cancel button

  Scenario: Display the Primary Issuance screen
    Given I navigate to the application
    And   I enter the username as  "JohnDoe"
    And   I enter the password as "Password11*"
    And   I click login button
    And   I click the Primary Issuance activity tab
   #And   I click cancel button