Feature: Test the Implementation page

  Scenario: Cancelling closing the book
    Given I navigate to the application
    And   I enter the username as  "JohnDoe"
    And   I enter the password as "Password11*"
    And   I click login button
    And   I click the Implementation tab
    And   I click  the close book button
    And   I click cancel button

  Scenario: Closing the book after 15minutes
    Given I navigate to the application
    And   I enter the username as  "JohnDoe"
    And   I enter the password as "Password11*"
    And   I click login button
    And   I click the Implementation tab
    And   I click  the close book button
    And   I click timer radio button
    And   I click  the close book



  Scenario: Send to Bookrunners
    Given I navigate to the application
    And   I enter the username as  "JohnDoe"
    And   I enter the password as "Password11*"
    And   I click login button
    And   I click the Implementation tab
    And   I click send to bookrunners button
    And   I click cancel button

  Scenario: Send to Bookrunners and click the joint bookrunners checkbox
    Given I navigate to the application
    And   I enter the username as  "JohnDoe"
    And   I enter the password as "Password11*"
    And   I click login button
    And   I click the Implementation tab
    And   I click send to bookrunners button
    And   I click the joint bookrunners checkbox
    #And   I click  the billing bank