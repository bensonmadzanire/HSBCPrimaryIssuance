package pages;

import base.FrameworkConfig;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;
import org.testng.Assert;

public class CommonFunctions {
    static Page page = FrameworkConfig.LocalPage;

    /**
     * This is a common function which can be used to check if the checkbox is selected
     * @param locator: Developers will add the unique data-test-id to check box which will be passed as a parameter
     */
    public static void checkBoxSelected(String locator){
        ElementHandle handle = page.querySelector("data-test-id="+locator);
        String actualElement = handle.getAttribute("class");
        Assert.assertEquals(actualElement.trim(),"checked");
    }
}
