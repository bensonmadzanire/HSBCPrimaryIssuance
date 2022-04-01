Feature: Single Page Application

  Scenario: Test the  functionality
    Given I navigate to the application
    And   I enter the username as  "JohnDoe"
    And   I enter the password as "Password11*"
    And   I click login button
    And   I click Create Composite button
    And   I click the Category and Ratings tab



  Scenario: Closing the book now
    Given I navigate to the application
    And   I enter the username as  "JohnDoe"
    And   I enter the password as "Password11*"
    And   I click login button
    And   I click the Implementation tab
    And   I click  the close book button
    And   I click close book now button






  Scenario: Send to Bookrunners and click the joint bookrunners checkbox
    Given I navigate to the application
    And   I enter the username as  "JohnDoe"
    And   I enter the password as "Password11*"
    And   I click login button
    And   I click the Implementation tab
    And   I click send to bookrunners button
    And   I click the joint bookrunners checkbox
