package pages;

import base.FrameworkConfig;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;

public class LoginPage {


    Page page = FrameworkConfig.LocalPage;

    String txtUserName = "text";
    String txtPassword = "password";
    String btnLogin = "submit";



    public boolean captureUsernameField(String userName) {
        ElementHandle handle = page.querySelector("css=[type="+txtUserName+"]").querySelector("input");
        handle.fill(userName);
       // page.fill(txtUserName,userName);
        return true;
    }
    public boolean capturePasswordField(String password) {
        ElementHandle handle = page.querySelector("css=[type="+txtPassword+"]").querySelector("input");
        handle.fill(password);
        //page.fill(txtUserName,userName);
        return true;
    }

    public boolean clickLoginButton() {
        page.dispatchEvent("zero-button:has-text('Login') >> visible=true", "click");
        return true;
    }

    }

