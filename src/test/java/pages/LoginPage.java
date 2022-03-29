package pages;

import base.FrameworkConfig;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;

public class LoginPage {


    Page page = FrameworkConfig.LocalPage;

    String txtUserName = "#control";
    String txtPassword = "#control";
    String btnLogin = "foundation-login-form[ssologinroute='/gwf/saml/login']";


    /*public void Login(String userName, String password) {
        page.fill(txtUserName, userName);
        page.fill(txtPassword, password);
        page.click(btnLogin);


    }*/

    public boolean captureUsernameField(String userName) {
     page.fill(txtUserName,userName);
        return true;
    }
    public boolean capturePasswordField(String password) {
        page.inputValue(txtPassword);
        page.fill(txtPassword,password);
        return true;
    }

    public boolean clickLoginButton() {
        page.click(btnLogin);
        return true;
    }

    }

