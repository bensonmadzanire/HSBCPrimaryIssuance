Feature: Single Page Application

  Scenario: Successful login to the application
    Given I navigate to the application
    And   I enter the username as  "JohnDoe"
    And   I enter the password as "Password11*"
    And   I click login button
    And   I click Create Composite button
    And   I enter the issuer name as "TerryBus"
    And   I enter the issuer tranche name as "PamGold"
    And   I click on registration type
    And   I enter the Maturity date
    And   I enter the Tranche currency
    And   I click submit button
    #And   I click the Category and Ratings tab

  Scenario: login to the application
    Given I navigate to the application
    And   I enter the username as  "JohnDoe"
    And   I enter the password as "Password11*"
    And   I click login button
    And   I verify the Tranche Name
    #And   I click Tranche Name
    And   I click the date and time

    #And   I click Create Composite button









