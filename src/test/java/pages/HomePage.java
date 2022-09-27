package pages;

import base.FrameworkConfig;
import com.microsoft.playwright.Page;



public class HomePage {


    Page page = FrameworkConfig.LocalPage;


    String txtIssuerName = "text";
    public boolean clickDateandTime() {
        page.dispatchEvent(":nth-match(:text('Date & Time'), 2) >> visible=true", "click");
        return true;
    }

    public boolean clickTrancheName() {
        page.dispatchEvent(":nth-match(:text('Tranche Name'), 1) >> visible=true", "click");
        return true;
    }
    public boolean clickTheDateandTime() {
        page.dispatchEvent(":nth-match(:text('Date & Time'), 1) >> visible=true", "click");
        return true;
    }
    public boolean clickSSOEnabledChecknox() {
        page.dispatchEvent("zero-checkbox:has-text('SSO Enabled - hsbc') >> visible=true", "click");
        return true;
    }

    public boolean clickCloseBooksButton() {
        page.dispatchEvent("zero-button:has-text('Close Book') >> visible=true", "click");
        return true;
    }
    public boolean clickDefaultGridButton() {
        page.dispatchEvent("zero-button:has-text('Default Grid') >> visible=true", "click");
        return true;
    }
    public boolean clickClearFilterButton() {
        page.dispatchEvent("zero-button:has-text('Clear All Filters') >> visible=true", "click");
        return true;
    }
    public boolean clickCheckbox() throws InterruptedException {
 
        return true;
    }
    public boolean clickTimerRadioButton() {
        page.dispatchEvent("zero-radio:has-text('Timer') >> visible=true", "click");
        return true;
    }

    public boolean clicktheBillingBank() {
        page.dispatchEvent("fast-checkbox:has-text('HSBC') >> visible=true", "click");
        return true;
    }

    public boolean clickDisplayComposite() {
        page.dispatchEvent("zero-button:has-text('Display Composite') >> visible=true", "click");
        //page.locator("text=Create Composite").click();
        return true;
    }

    public boolean clickLogicButton() {
        page.dispatchEvent("zero-button:has-text('Logic') >> visible=true", "click");
        return true;
    }

    public boolean clickAddCommentButton() {
        page.dispatchEvent("zero-button:has-text('Add Comment') >> visible=true", "click");
        return true;
    }

    public boolean clickJointBookrunnersChecbox() {
        page.dispatchEvent("fast-checkbox:has-text('Joint bookrunners') >> visible=true", "click");
        return true;
    }


    public boolean clickDecisionTab() {
        page.dispatchEvent("zero-tab:has-text('Decision') >> visible=true", "click");
        return true;
    }

    public boolean clickInforTrailTab() {
        page.dispatchEvent("zero-tab:has-text('Info trail') >> visible=true", "click");
        return true;
    }

    public boolean clickPrimaryIssuanceTab() {
        page.dispatchEvent("zero-tab:has-text('Primary issuance activity') >> visible=true", "click");
        return true;
    }

    public boolean clickSendToBookrunners() {
        page.dispatchEvent("zero-button:has-text('Send to bookrunners') >> visible=true", "click");
        return true;
    }

    public boolean clickCloseBookNow() {
        page.dispatchEvent("zero-button:has-text('Close Book') >> visible=true", "click");
        return true;
    }

    public boolean clickCloseBookButton() {
        page.dispatchEvent("zero-button:has-text('Close Book') >> visible=true", "click");
        return true;
    }


    public boolean clickImplemenationTab() {
        page.dispatchEvent("zero-tab:has-text('Implementation') >> visible=true", "click");
        return true;
    }


    public boolean clickCreateNewIssue() {
        page.dispatchEvent("zero-button:has-text('Create New Issue') >> visible=true", "click");
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
    public boolean clickColumnButton() {
        page.dispatchEvent("button:has-text('Columns') >> visible=true", "click");
        return true;
    }

    public boolean verifyTranceName() {

        return true;

    }


}




