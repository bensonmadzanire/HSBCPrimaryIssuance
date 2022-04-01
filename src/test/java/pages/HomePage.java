package pages;

import base.FrameworkConfig;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;

public class HomePage {


    Page page = FrameworkConfig.LocalPage;


    String txtIssuerName = "text";
    String chkJointBookrunner= "text='Joint bookrunners'";

    public boolean clickJointBookrunnersChecbox(){
        page.click(chkJointBookrunner);
        return true;
    }


    public boolean clickDecisionTab(){
        page.dispatchEvent("zero-tab:has-text('Decision') >> visible=true", "click");
        return true;
    }

    public boolean clickInforTrailTab(){
        page.dispatchEvent("zero-tab:has-text('Info trail') >> visible=true", "click");
        return true;
    }



    public boolean clickSendToBookrunners(){
        page.dispatchEvent("zero-button:has-text('Send to bookrunners') >> visible=true", "click");
        return true;
    }

    public boolean clickCloseBookNow(){
        page.dispatchEvent("zero-button:has-text('Close Book') >> visible=true", "click");
        return true;
    }

    public boolean clickCloseBookButton(){
        page.dispatchEvent("zero-button:has-text('Close Book') >> visible=true", "click");
        return true;
    }


    public boolean clickImplemenationTab(){
        page.dispatchEvent("zero-tab:has-text('Implementation') >> visible=true", "click");
        return true;
    }


    public boolean clickCreateComposite() {
        page.dispatchEvent("zero-button:has-text('Create Composite') >> visible=true", "click");
        return true;
    }

    public boolean captureIssuerNameField(String issuerName) {
        //ElementHandle handle = page.querySelector("css=[type="+txtUserName+"]").querySelector("input");
        ElementHandle handle = page.querySelector("css=[type=" + txtIssuerName + "]").querySelector("input");
        handle.fill(issuerName);
        return true;
    }

    public boolean clickRatings() {
        page.dispatchEvent("fast-tab:has-text('Category & ratings') >> visible=true", "click");
        return true;

    }
    public boolean clickSubmitButton() {
        page.dispatchEvent("zero-button:has-text('Submit') >> visible=true", "click");
        return true;
    }
    public boolean clickCancelButton() {
        page.dispatchEvent("zero-button:has-text('Cancel') >> visible=true", "click");
        return true;
    }
    public boolean enterIssuerName(String issuerName){
        ElementHandle handle = page.querySelector("css=[type=" + txtIssuerName + "]").querySelector("input");
        handle.fill(issuerName);
        return true;

    }
}





