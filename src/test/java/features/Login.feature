Feature: Single Page Application

  Scenario: Test the  functionality
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



  Scenario: Closing the book now
    Given I navigate to the application
    And   I enter the username as  "JohnDoe"
    And   I enter the password as "Password11*"
    And   I click login button
    And   I click the Implementation tab
    And   I click  the close book button
    And   I click close book now button







