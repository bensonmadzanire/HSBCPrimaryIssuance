package pages;

import base.FrameworkConfig;
import com.microsoft.playwright.Page;

public class LoginPage {


    Page page = FrameworkConfig.LocalPage;

    String txtUserName = "input:text='Email Address'";
    String txtPassword = "text='Password'";
    String btnLogin = "text='Login'";

    public void Login(String userName, String password) {
        page.fill(txtUserName, userName);
        page.fill(txtPassword, password);
        page.click(btnLogin);


    }

    public boolean captureUsernameField(String userName) {
     page.fill(txtUserName,userName);
        return true;
    }
    public boolean capturePasswordField(String password) {
        page.fill(txtPassword,password);
        return true;
    }

    public boolean clickLoginButton() {
        page.click(btnLogin);
        return true;
    }
}
