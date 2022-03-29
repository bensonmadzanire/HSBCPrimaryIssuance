package steps;

import base.FrameworkConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.HomePage;
import pages.LoginPage;

public class stepdefinitions {

    LoginPage loginPage = new LoginPage();
    @Given("I navigate to the application")
    public void i_navigate_to_the_application() {
        FrameworkConfig.LocalPage.navigate("https://dev-hsbc-priss1/login");

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

    }
