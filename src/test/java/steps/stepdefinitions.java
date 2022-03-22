package steps;

import base.FrameworkConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.HomePage;
import pages.LoginPage;

public class stepdefinitions {
    @Given("I navigate to the application")
    public void i_navigate_to_the_application() {
        FrameworkConfig.LocalPage.navigate("https://dev-hsbc-priss1/login");

    }

        @And("I click login button")
    public void iClickLoginButton() {
     LoginPage loginPage = new LoginPage();
     loginPage.clickLoginButton();
    }

    @And("I enter the username as  {string}")
    public void iEnterTheUsernameAs(String userName) {
        LoginPage loginPage = new LoginPage();
        loginPage.captureUsernameField(userName);
    }

    @And("I enter the password as {string}")
    public void iEnterThePasswordAs(String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.capturePasswordField(password);
    }

    @And("I click confugration tab")
    public void iClickConfugrationTab() {
        HomePage homePage = new HomePage();
        homePage.clickConfiguration();

    }

    }
