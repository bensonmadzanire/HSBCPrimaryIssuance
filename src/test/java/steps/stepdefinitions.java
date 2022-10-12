package steps;

import base.FrameworkConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.CommonFunctions;
import pages.GridFunctions;
import pages.HomePage;
import pages.LoginPage;

public class stepdefinitions {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("I navigate to the application")
    public void i_navigate_to_the_application() {
        FrameworkConfig.LocalPage.navigate("https://qa-hsbc-priss1/login");

    }

        @And("I click login button")
    public void iClickLoginButton() {

     loginPage.clickLoginButton();
    }

    @And("I enter the username as  {string}")
    public void iEnterTheUsernameAs(String userName) {

        loginPage.captureUsernameField(userName);
    }

    @And("I enter the password as {string}")
    public void iEnterThePasswordAs(String password) {

        loginPage.capturePasswordField(password);
    }




    @And("I enter the issuer name as {string}")
    public void iEnterTheIssuerNameAs(String issuerName) {
        CommonFunctions.enterTextInTextBox("Issuer Name",issuerName);
    }

    @And("I click category and ratings tab")
    public void iClickCategoryAndRatingsTab() {
        homePage.clickRatings();
    }

    @And("I click submit button")
    public void iClickSubmitButton() {
        homePage.clickSubmitButton();
    }

    @And("I click cancel button")
    public void iClickCancelButton() {
        homePage.clickCancelButton();
    }

    @And("I click the Implementation tab")
    public void iClickTheImplementationTab() {
        homePage.clickImplemenationTab();
    }

    @And("I click  the close book button")
    public void iClickTheCloseBookButton() {
        homePage.clickCloseBookButton();
    }

    @And("I click close book now button")
    public void iClickCloseBookNowButton() {
        homePage.clickCloseBookNow();
    }

    @And("I click send to bookrunners button")
    public void iClickSendToBookrunnersButton() {
        homePage.clickSendToBookrunners();
    }

    @And("I click the Infor Trail tab")
    public void iClickTheInforTrailTab() {
        homePage.clickInforTrailTab();
    }

    @And("I click the Decision screen")
    public void iClickTheDecisionScreen() {
        homePage.clickDecisionTab();
    }

    @And("I click the joint bookrunners checkbox")
    public void iClickTheJointBookrunnersCheckbox() {
    homePage.clickJointBookrunnersChecbox();

    }

    @And("I click the Category and Ratings tab")
    public void iClickTheCategoryAndRatingsTab() {
        homePage.clickRatings();
    }

    @And("I click  the billing bank")
    public void iClickTheBillingBank() {

    }

    @And("I click timer radio button")
    public void iClickTimerRadioButton() {
        homePage.clickTimerRadioButton();
    }

    @And("I click  the close book")
    public void iClickTheCloseBook() {
        homePage.clickCloseBooksButton();
    }

    @And("I enter the issuer tranche name as {string}")
    public void iEnterTheIssuerTrancheNameAs(String trancheName) {
        CommonFunctions.enterTextInTextBox("Issuer Tranche Name",trancheName);
    }

    @And("I click on registration type")
    public void iClickOnRegistrationType() throws InterruptedException {
        CommonFunctions.selectDropDownElementForHSBC("Registration Type","144A/Reg S");

        //CommonFunctions.selectDropDownElementForHSBC("Deal Status","Announced");
        //Thread.sleep(2000);
    }

    @And("I enter the Maturity date")
    public void iEnterTheMaturityDate() {
        CommonFunctions.typeCurrentDate("Maturity Date","12/12/2026");
    }

    @And("I enter the Tranche currency")
    public void iEnterTheTrancheCurrency() {
        CommonFunctions.selectDropDownElementForHSBC("Currency","CNY");
    }

    @And("I click the Primary Issuance activity tab")
    public void iClickThePrimaryIssuanceActivityTab() {
        homePage.clickPrimaryIssuanceTab();
    }

    @And("I click the button on {string}")
    public void iClickTheButtonOn(String rowNumber) throws InterruptedException {
        Thread.sleep(3000);
        GridFunctions.selectPlusButtonInHSBCGrid(Integer.parseInt(rowNumber));
        Thread.sleep(3000);
    }



    @And("I click  Add comment button")
    public void iClickAddCommentButton() {
        homePage.clickAddCommentButton();
    }

    @And("I click logic button")
    public void iClickLogicButton() {
        homePage.clickLogicButton();
    }

    @And("i verify that the Tranche Name is correct")
    public void iVerifyThatTheTrancheNameIsCorrect() {
        homePage.verifyTranceName();
    }

    @And("I click the column button")
    public void iClickTheColumnButton() {
        homePage.clickColumnButton();
    }
    @And("I click the default grid button")
    public void iClickTheDefaultGridButton() {
        homePage.clickDefaultGridButton();
    }

    @And("I click the clear filters button")
    public void iClickTheClearFiltersButton() {
        homePage.clickClearFilterButton();
    }

    @And("I click the checkbox to unselect the values")
    public void iClickTheCheckboxToUnselectTheValues() throws InterruptedException {
      homePage.clickCheckbox();
    }

    @And("I click Tranche Name")
    public void iClickTrancheName() throws InterruptedException {
        Thread.sleep(3000);
     homePage.clickTrancheName();
    }

    @And("I click the date and time")
    public void iClickTheDateAndTime() throws InterruptedException {
        Thread.sleep(3000);
        homePage.clickTheDateandTime();
    
    }

    @And("I verify the Tranche Name")
    public void iVerifyTheTrancheName() {
        homePage.verifyTranceName();
    }

    @And("I verify that all the grid column titles are correct")
    public void iVerifyThatAllTheGridColumnTitlesAreCorrect()  {
        CommonFunctions.waitForElement("Tranche Name","Tranche Name");
        CommonFunctions.elementPresent("Tranche Name","Tranche Name");
        CommonFunctions.elementPresent("Date & Time","Date & Time");
        CommonFunctions.elementPresent("Last Modification","Last Modification");
        CommonFunctions.elementPresent("Maturity Date","Maturity Date");
        CommonFunctions.elementPresent("Ccy","Ccy");
        CommonFunctions.elementPresent("Rating","Rating");
        CommonFunctions.elementPresent("Sector","Sector");
        CommonFunctions.elementPresent("Book Size","Book Size");
        CommonFunctions.elementPresent("Deal Size","Deal Size");
        CommonFunctions.elementPresent("IPTS","IPTS");
        CommonFunctions.elementPresent("Guidance","Guidance");
        CommonFunctions.elementPresent("Benchmark","Benchmark");
        CommonFunctions.elementPresent("Book Runners","Book Runners");
        CommonFunctions.elementPresent("Classification","Classification");
        CommonFunctions.elementPresent("Bond Seniority","Bond Seniority");
        CommonFunctions.elementPresent("Book Status","Book Status");
        CommonFunctions.elementPresent("B&D Bank","B&D Bank");
        CommonFunctions.elementPresent("Coupon Frequency","Coupon Frequency");
        CommonFunctions.elementPresent("Coupon Type","Coupon Type");
        CommonFunctions.elementPresent("Day Count","Day Count");
        CommonFunctions.elementPresent("Deal Status","Deal Status");
        CommonFunctions.elementPresent("Is ESG","Is ESG");
        CommonFunctions.elementPresent("ESG Type","ESG Type");
        CommonFunctions.elementPresent("Exchange","Exchange");
        CommonFunctions.elementPresent("Country of Issue","Country of Issue");
        CommonFunctions.elementPresent("Issuer LEI","Issuer LEI");
        CommonFunctions.elementPresent("Issuer Name","Issuer Name");
        CommonFunctions.elementPresent("Issuer Rating","Issuer Rating");
        CommonFunctions.elementPresent("Ticker","Ticker");
        CommonFunctions.elementPresent("Registration Type","Registration Type");
        CommonFunctions.elementPresent("CUSIP","CUSIP");
        CommonFunctions.elementPresent("FIGI","FIGI");
        CommonFunctions.elementPresent("ISIN","ISIN");
        CommonFunctions.elementPresent("Coupon","Coupon");
        CommonFunctions.elementPresent("Increment","Increment");
        CommonFunctions.elementPresent("Min Piece","Min Piece");
        CommonFunctions.elementPresent("Callable Date","Callable Date");
        CommonFunctions.elementPresent("1st Coupon Date","1st Coupon Date");
        CommonFunctions.elementPresent("Settlement Date","Settlement Date");
        CommonFunctions.elementPresent("Is Perpetual","Is Perpetual");
        CommonFunctions.elementPresent("Will Not Grow","Will Not Grow");
        CommonFunctions.elementPresent("Is Tap","Is Tap");
        CommonFunctions.elementPresent("Current Size","Current Size");
        CommonFunctions.elementPresent("Country of Risk","Country of Risk");
        CommonFunctions.elementPresent("CorpRed Classification","CorpRed Classification");
        CommonFunctions.elementPresent("Reallocate","Reallocate");













    }


    @And("I click SSOEnabled checkbox")
    public void iClickSSOEnabledCheckbox() {
     homePage.clickSSOEnabledChecknox();
    }

    @And("I click Create new issue button")
    public void iClickCreateNewIssueButton() {
        homePage.clickCreateNewIssue();
    }
}
