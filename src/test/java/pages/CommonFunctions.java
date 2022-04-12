package pages;

import base.FrameworkConfig;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.FileChooser;
import com.microsoft.playwright.Page;
import org.testng.Assert;

import java.nio.file.Paths;

import static org.testng.Assert.assertTrue;
public class CommonFunctions {

   // private static final Page page = CreatePlayWrightDriver.getInstance().getPage();
    static Page page = FrameworkConfig.LocalPage;
    /**
     * This is a common function which can be used to select checkbox
     * @param locator: Developers will add the unique data-test-id to check box which will be passed as a parameter
     */
    public static void selectCheckBox(String locator){
        page.querySelector("data-test-id="+locator).click();
    }

    /**
     * This is a common function which can be used to check if the checkbox is selected
     * @param locator: Developers will add the unique data-test-id to check box which will be passed as a parameter
     */
    public static void checkBoxSelected(String locator){
        ElementHandle handle = page.querySelector("data-test-id="+locator);
        String actualElement = handle.getAttribute("class");
        Assert.assertEquals(actualElement.trim(),"checked");
    }

    /**
     * This is a common function which can be used to check if the checkbox is selected
     * @param locator: Developers will add the unique data-test-id to check box which will be passed as a parameter
     */
    public static void checkClassValue(String locator, String expectedValue){
        ElementHandle handle = page.querySelector("data-test-id="+locator);
        String actualElement = handle.getAttribute("class");
        Assert.assertEquals(actualElement.trim(),expectedValue);
    }

    /**
     * This is a common function which can be used to check if the checkbox is selected
     * @param locator: Developers will add the unique data-test-id to check box which will be passed as a parameter
     */
    public static void checkClassValueWithID(String locator, String expectedValue){
        ElementHandle handle = page.querySelector("id="+locator);
        String actualElement = handle.getAttribute("class");
        Assert.assertEquals(actualElement.trim(),expectedValue);
    }



    /**
     * This is a common function which can be used to check if the checkbox is not selected
     * @param locator: Developers will add the unique data-test-id to check box which will be passed as a parameter
     */
    public static void checkBoxNotSelected(String locator){
        String checkbox = page.querySelector("data-test-id="+locator).getAttribute("aria-checked");
        Assert.assertEquals(checkbox,"false");
    }



    /**
     * This is a common function which is used to check if the radio button is selected.
     * @param locator - The data-set-id is passed as a parameter.
     * @param value - The expected value of the class attribute is passed as a parameter.
     */

    public static void checkIfTheRadioButtonIsSelected(String locator, String value) {
        ElementHandle handle = page.querySelector("data-test-id=" + locator);
        String actualElement = handle.getAttribute("class");
        Assert.assertEquals(actualElement.trim(), value);
    }

    /**
     * This is a common function which is used to check entered value in the Multi DropDown Field without ID.
     * @param locator  - The text is passed as a parameter.
     * @param expected - The expected value is passed as a parameter.
     */

    public static void checkTheValueEnteredInMultiDropDownFieldWithOutID(String locator, String expected) {
        ElementHandle handle = page.querySelector("sl-select:below(:text(\"" + locator + "\")) sl-tag:has-text(\"" + expected + "\")");
        String actualText = handle.innerText();
        Assert.assertEquals(actualText.trim(), expected);
    }

    /**
     * This is a common function which is used to check entered value in the Multi DropDown Field.
     * @param locator  - The data-set-id is passed as a parameter.
     * @param expected - The expected value is passed as a parameter.
     */

    public static void checkTheValueEnteredInMultiDropDownField(String locator, String expected) {
        ElementHandle handle = page.querySelector("data-test-id="+locator);
        String actualText=handle.querySelector("fast-button").textContent();
        assertTrue(actualText.contains(expected));
    }


    /**
     * This is a common function which can be used to check if the Text Area is disabled for all the Microsoft Fast Genesis applications like CCC, CitiTrinity
     * Developers need to Add Unique Data Set Ids to Text Area Fields to make sure that the field can be easily targeted.
     * @param locator The data-set-id is passed as a parameter.
     * @param parent  The parent which is the root element is passed as a parameter because the Text Area is common across different pages.
     */

    public static void checkIfTheTextAreaOfAttachmentDialogInAllPlacesWereDisabled(String locator, String parent) {
        ElementHandle handle = page.querySelector(parent);
        String actualElement = handle.querySelector("data-test-id=" + locator).getAttribute("class");
        Assert.assertEquals(actualElement.trim(), "disabled");
    }

    /**
     * This is a common function which is used to check if the button is enabled
     * @param locator - The actual text of button is passed as a locator
     */

    public static void checkIfTheButtonIsEnabled(String locator) {
        try {
            ElementHandle handle = page.querySelector("fast-button:has-text(\" " + locator + "\")");
            String actualElement = handle.getAttribute("class");
            Assert.assertEquals(actualElement.trim(), "disabled");
            Assert.fail("Element is disabled");
        } catch (NullPointerException e) {
            assertTrue(true, "Element is enabled");
        }
    }


    /**
     * This is a common function to check if the Button is disabled
     *
     * @param locator - The actual text is passed as a parameter
     * @param value   - The actual value that is passed as a parameter
     */

    public static void checkIfTheButtonIsDisabled(String locator, String value) {
        ElementHandle handle = page.querySelector("zero-button:has-text(\" " + locator + "\") >> visible=true");
        String actualElement = handle.getAttribute("class");
        Assert.assertEquals(actualElement.trim(), value);
    }


    /**
     * This is a common function which can be used to check if the Text Field or dropdown field or Text Area field  is disabled
     * @param locator - The actual data set id is passed as a parameter
     */
    public static void checkIfFieldIsDisabled(String locator) {
        ElementHandle handle = page.querySelector("data-test-id=" + locator);
        String actualElement = handle.getAttribute("class");
        assertTrue(actualElement.contains("disabled"));
    }

    /**
     * This is a common function which can be used to check if the URL field  is disabled
     *
     * @param locator - The actual data set id is passed as a parameter
     * @param value   - The expected value is passed as a parameter
     */
    public static void checkIfFieldIsDisabledForURL(String locator, String value) {
        ElementHandle handle = page.querySelector("data-test-id=" + locator).querySelector("div fast-text-field");
        String actualElement = handle.getAttribute("class");
        Assert.assertEquals(actualElement.trim(), value);
    }

    /**
     * This is a common function which can be used to check enter the text in the text area is empty for all the attachment dialog
     *
     * @param locator - The actual data set id is passed as a Locator
     * @param parent  -  The actual text above the text field should be passed as a parent parameter
     * @param value   -  The value that needs to be entered in the respective field should be entered as a parameter
     */
    public static void enterTextAreaInAttachmentsDialog(String locator, String parent, String value) throws InterruptedException {
        ElementHandle handle = page.querySelector(parent);
        handle.querySelector("data-test-id=" + locator).click();
        Thread.sleep(1000);
        handle.querySelector("data-test-id=" + locator).type(value);
    }

    /**
     * This is a common function which can be used to select the radio button
     * @param locator: Developers will add the unique data-test-id to Radiobutton which will be passed as a parameter
     */
    public static void selectRadioButton(String locator) {
        page.querySelector("data-test-id=" + locator).click();
    }


    /**
     * This is a common function which can be used to enter the text in the text area for all the genesis applications like Octopus, CCC, CitiTrinity
     *
     * @param fieldName - The data-test-id passed as a parameter
     * @param value     - The value that needs to be entered in the respective field should be entered as a parameter
     */
    public static void enterTextInTheTextArea(String fieldName, String value) {
        ElementHandle handle = page.querySelector("data-test-id=" + fieldName);
        handle.querySelector("textarea").fill(value);
        //  handle.querySelector("textarea").type(value);
    }

    /**
     * This is a common function which can be used to attach a file for all the genesis applications like Octopus, CCC, CitiTrinity
     * @param filePath - The path of the file where it is present in the local system
     */
    public static void attachingFileWithTheFilePath(String filePath) {
        FileChooser fileChooser = page.waitForFileChooser(() -> {
            page.click("zero-button:has-text('Select File') >> visible=true");
        });
        fileChooser.setFiles(Paths.get(filePath));
    }


    /**
     * This is a common function which can be used to enter the link in the text field for all the genesis applications like Octopus, CCC, CitiTrinity
     * @param fieldName - The data-test-id should be passed as a parameter
     * @param value     - The value that needs to be entered in the respective field should be entered as a parameter
     */
    public static void enterLinkInTextBox(String fieldName, String value) throws InterruptedException {
        ElementHandle handle = page.querySelector("data-test-id=" + fieldName);
        Thread.sleep(1000);
        handle.querySelector("div input").type(value,new ElementHandle.TypeOptions().setDelay(100));
    }

    /**
     * This is a common function which can be used to input the date in the date field
     * @param fieldName - The data-test-id should be passed as a parameter
     * @param value     - The value that needs to be entered in the respective field should be entered as a parameter
     */
    public static void typeCurrentDate(String fieldName, String value) {
        ElementHandle handle = page.querySelector("data-test-id=" + fieldName);
        handle.querySelector("input").type(value);

    }

    public static void selectDropDownElementForHSBC(String locator, String option)
    {
        page.dispatchEvent("data-test-id=" + locator,"click");
        page.dispatchEvent("data-test-id=" + option,"click");
    }

    /**
     * This is a common function which can be used to select the options in the dropdown menu
     * @param locator - The data-test-id should be passed as a parameter
     * @param option - The option that needs to be selected from the dropdown
     */
    public static void selectDropDownElement(String locator, String option)  {
        page.click("data-test-id=" + locator);
        ElementHandle handle = page.querySelector("data-test-id=" + locator);
        handle.querySelector("data-test-id=" + option).click();
    }

    /**
     * This is a common function which can be used to select the options in the dropdown menu if it does not have Data-test-ID
     * The CSS value is used in this function
     * @param option - The CSS value is passed as a parameter
     * @param locator - The actual text name in the dropdown is passed as the parameter
     */
    public static void selectDropDownElementWithOutID(String locator, String option) {
        page.click("data-test-id=" + locator);
        ElementHandle handle = page.querySelector("data-test-id=" + locator);
        // handle.querySelector("fast-option:has-text(\"" + option + "\")").click();
        handle.querySelector("css=[value=\'"+option+"\']").click();
        //page.click("zero-alpha-select:below(:text(\""+locator+"\")) fast-option:has-text(\""+option+"\")");
    }


    /**
     * This is a common function which can be used to select different Tabs all the genesis applications developed using Fast Application Framework
     * @param tabName - The actual text above the text area should be passed as a parameter
     */
    public static void tabSelection(String tabName) {
        page.click("zero-tab:has-text(\"" + tabName + "\")");
    }


    /**
     * This is a common function which can be used to refreshing an application
     */
    public static void refreshAnyApplicationPage() {
        page.reload();
    }

    /**
     * This function should be changed as soon as Data-set-ids have been added, or it can be used for Buttons which does not have Ids. But this is not a good practice.
     * @param buttonName - The "text" associated with the Button should be passed as a parameter
     */
    public static void clickButtonWithOutID(String buttonName) {
        page.click("zero-button:has-text('" + buttonName + "') >> visible=true");
        //page.dispatchEvent("zero-button:has-text('" + buttonName + "') >> visible=true", "click");
    }


    /**
     * This is a common function which can be used to check if the Button is enabled or not for all the genesis applications like Octopus, CCC, CitiTrinity
     * @param buttonName - The "text" associated with the Button should be passed as a parameter
     */
    public static void buttonEnabled(String buttonName) {
        ElementHandle handle = page.querySelector("data-test-id=" + buttonName);
        assertTrue(handle.isEnabled());
    }

    /**
     * This is a common function which can be used to enter the text in the text field for all the genesis applications like Octopus, CCC, CitiTrinity
     * @param fieldName - The actual text above the text field should be passed as a parameter
     * @param value     - The value that needs to be entered in the respective field should be entered as a parameter
     */
    public static void enterTextInTextBox(String fieldName, String value) {
        ElementHandle handle = page.querySelector("data-test-id=" + fieldName);
        handle.querySelector("input").fill(value);
        // page.fill("fast-text-field input:near(:text(\"" + fieldName + "\"))", value);
        // page.pause();
    }

    /**
     * This is a common function which can be used to click any button for all the genesis applications like Octopus, CCC, CitiTrinity
     * @param buttonName - The "text" associated with the Button should be passed as a parameter
     */
    public static void clickButton(String buttonName) {
        page.click("data-test-id=" + buttonName+">> visible=true");
        //page.click("zero-button:has-text('" + buttonName + "') >> visible=true >>force=true");
    }

    private static long previousMillis = 0;

    private static void recordCurrentTime(String label) {
        long currentMillis = System.currentTimeMillis();
        //  System.out.println(label + ": " + currentMillis);
        //  System.out.println("PreciseDiff: " + (currentMillis - previousMillis));
        previousMillis = currentMillis;
    }

    /**
     * This is a common function which can be used to check if the element is present or not. In this
     * method initially it waits for a certain period of time and then throws an error
     * @param elementSelector - The actual selector(element) should be passed as a parameter
     */

    public static void waitForElement(String elementSelector, String expectedElement) {

        String actualElement;
        page.waitForSelector("text=" + elementSelector);
        ElementHandle handle = page.querySelector("text=" + elementSelector);
        actualElement = handle.textContent();
        Assert.assertEquals(actualElement.trim(), expectedElement);
    }

    /**
     * This is a common function which can be used to check if the element is present or not
     * This is similar to the previous method, but it does not wait for a certain period of time
     * @param elementSelector - The actual selector(element) should be passed as a parameter
     */
    public static void elementPresent(String elementSelector, String expectedElement) {
        String actualElement;
        ElementHandle handle = page.querySelector("text=\'" + elementSelector + "\'");
        actualElement = handle.textContent();
        Assert.assertEquals(actualElement.trim(), expectedElement);
    }

    /**
     * This is a common function which can be used to check the value entered in the text field for all the genesis applications like Octopus, CCC, CitiTrinity
     * Developers need to Add Unique Data Set Ids to Text Fields to make sure that the field can be easily targeted
     * This function needs to be implemented
     *
     * @param locator  The Data-test-id is passed as a locator
     * @param expected The expected value in the text field is passed
     */

    public static void checkValueEnteredInTheTextField(String locator, String expected) {
        ElementHandle handle = page.querySelector("data-test-id=" + locator);
        String actualText = handle.querySelector("input").inputValue();
        Assert.assertEquals(actualText, expected);
    }

    /**
     * This is a common function which can be used to check the value entered in the DropDown field for all the genesis applications like Octopus, CCC, CitiTrinity
     * Developers need to Add Unique Data Set Ids to Text Fields to make sure that the field can be easily targeted
     * This function needs to be implemented
     * @param locator  The Data-test-id is passed as a locator
     * @param expected The expected value in the text field is passed
     */

    public static void checkValueEnteredInTheDropDownField(String locator, String expected) {
        ElementHandle handle = page.querySelector("data-test-id=" + locator);
        //  String actualText = handle.querySelector("div slot div slot:has-text(\"" + expected + "\")").textContent();
        String actualText = handle.querySelector("div slot input").inputValue();
        Assert.assertEquals(actualText.trim(), expected);
    }

    /**
     * This is a common function which can be used to check the value entered in the DropDown field for all the genesis applications like Octopus, CCC, CitiTrinity
     * Sometimes it is not possible to call the function with Data set Id
     * This function needs to be implemented
     * @param locator  The Data-test-id is passed as a locator
     * @param expected The expected value in the text field is passed
     */

    public static void checkValueEnteredInTheDropDownFieldWithOutDataSetID(String locator, String expected) {
        ElementHandle handle = page.querySelector("fast-combobox:below(:text(\"" + locator + "\"))");
        String actualText = handle.querySelector("div slot div slot:has-text(\"" + expected + "\")").textContent();
        Assert.assertEquals(actualText.trim(), expected);
    }

    /**
     * This is a common function which can be used to check if the dropdown field is disabled
     * Developers need to Add Unique Data Set Ids to Text Fields to make sure that the field can be easily targeted
     * This function needs to be implemented
     * @param locator The Data-test-id is passed as a locator
     * @param value   The expected value in the text field is passed
     */

    public static void checkIfTheDropDownFieldIsDisabled(String locator, String value) {
        ElementHandle handle = page.querySelector("data-test-id=" + locator);
        String actualElement = handle.getAttribute("class");
        actualElement.contains("disabled");
    }


    /**
     * This is a common function which can be used to check if the MultiValueSelectionDropDown field is empty for all the genesis applications like Octopus, CCC, CitiTrinity
     * Developers need to Add Unique Data Set Ids to Text Fields to make sure that the field can be easily targeted
     * This function needs to be implemented
     * @param locator  The Data-test-id is passed as a locator
     * @param expected The expected value in the text field is passed
     */

    public static void checkIfMultiValueSelectionDropDownIsEmpty(String locator, String expected) {
        try {
            ElementHandle handle = page.querySelector("data-test-id=" + locator);
            handle.querySelector("sl-tag:has-text(\"" + expected + "\")").innerText();
            Assert.fail("The Multi dropdown field is not empty");
        } catch (NullPointerException nullPointerException) {
            String actualElement = "";
            String expectedElement = "";
            Assert.assertEquals(actualElement.trim(), expectedElement);
        }
    }


    /**
     * This is a common function which can be used to check if the MultiValueSelectionDropDown field is disabled for all the genesis applications like Octopus, CCC, CitiTrinity
     * Developers need to Add Unique Data Set Ids to Text Fields to make sure that the field can be easily targeted
     * This function needs to be implemented
     * @param locator The Data-test-id is passed as a locator
     */

    public static void checkIfMultiValueSelectionDropDownIsDisabled(String locator) {
        ElementHandle handle = page.querySelector("data-test-id=" + locator).querySelector("fast-combobox");
        String actualElement = handle.getAttribute("class");
        Assert.assertEquals(actualElement.contains("disabled"), true);
    }


    /**
     * This is a common function which can be used to check if the MultiValueSelectionDropDown field is disabled for all the genesis applications like Octopus, CCC, CitiTrinity
     * Developers need to Add Unique Data Set Ids to Text Fields to make sure that the field can be easily targeted
     * This function needs to be implemented
     * @param locator The Data-test-id is passed as a locator
     */

    public static void checkIfMultiValueSelectionDropDownIsDisabledAfterSubmittedRequest(String locator)
    {
        ElementHandle handle = page.querySelector("zero-tab-panel div").querySelector("css=[class='col-right']").querySelector("div");
        String actualElement = handle.getAttribute("class");
        Assert.assertEquals(actualElement.contains("disableClick"), true);
    }

    /**
     * This is a common function which can be used to enter the text in the text field for all the genesis applications like Octopus, CCC, CitiTrinity
     * @param locator - The actual text above the text field should be passed as a parameter
     * @param value   - The value that needs to be entered in the respective field should be entered as a parameter
     */
    public static void checkLinkFieldValue(String locator, String value) {
        ElementHandle handle = page.querySelector("data-test-id=" + locator);
        String actualText = handle.querySelector("div").getAttribute("value");
        Assert.assertEquals(actualText, value);
    }

    /**
     * This is a common function which can be used to check if the value entered in Text Area Field for all the genesis applications like Octopus, CCC, CitiTrinity
     * Developers need to Add Unique Data Set Ids to Text Fields to make sure that the field can be easily targeted
     * This function needs to be implemented
     * @param locator  The Data-test-id is passed as a locator
     * @param expected The expected value in the text field is passed
     */

    public static void checkValueEnteredInTheTextAreaField(String locator, String expected) {
        ElementHandle handle = page.querySelector("data-test-id=" + locator);
        String actualText = handle.querySelector("textarea").inputValue();
        Assert.assertEquals(actualText, expected);
    }

    /**
     * This is a common function which can be used to check if the Button is highlighted in Blue Color for all the genesis applications like Octopus, CCC, CitiTrinity
     * Developers need to Add Unique Data Set Ids to Text Fields to make sure that the field can be easily targeted
     * This function needs to be implemented
     * @param locator The Data-test-id is passed as a locator
     */

    public static void checkIfTheButtonIsNotHighLightedInBlueColor(String locator) {
        try {
            ElementHandle handle = page.querySelector("data-test-id=" + locator);
            String actualElement = handle.getAttribute("class");
            if (actualElement.contains("blueButton")) {
                Assert.assertEquals(actualElement.trim(), "blueButton");
                Assert.fail("The button is highlighted");
            } else {
                assertTrue(true, "Button is not highlighted in Blue Color");
            }
        } catch (NullPointerException nullPointerException) {
            assertTrue(true, "The button is not highlighted in Blue Color");
        }
    }

    /**
     * This is a common function which can be used to check if the Radio Button is selected for all the genesis applications like Octopus, CCC, CitiTrinity
     * Developers need to Add Unique Data Set Ids to Text Fields to make sure that the field can be easily targeted
     * This function needs to be implemented
     * @param value The name of the Radio Button
     */
    public static void checkIfTheRadioButtonIsNotSelected(String value) {
        try {
            ElementHandle handle = page.querySelector("data-test-id=" + value);
            String actualElement = handle.getAttribute("class");
            if (!actualElement.equals("checked")) {
                throw new NullPointerException("The Radio Button Is Not Selected");
            } else {
                Assert.assertEquals(actualElement.trim(), "checked");
                Assert.fail("The Radio Button is selected");
            }
        } catch (NullPointerException nullPointerException) {
            assertTrue(true, "The Radio Button Is Not Selected");
        }
    }

    /**
     * This is a common function which can be used to check if the text in the text area is empty for all the attachment dialog
     * @param locator -  The actual data set id is passed as a parameter
     * @param parent  -  The actual text above the text field should be passed as a parent parameter
     * @param value   -  The value that needs to be entered in the respective field should be entered as a parameter
     */
    public static void checkTextAreaInAttachmentDialogIsEmpty(String locator, String parent, String value) {

        ElementHandle handle = page.querySelector(parent);
        String actualText = handle.querySelector("data-test-id=" + locator).querySelector("textarea").inputValue();
        Assert.assertEquals(actualText, value);
    }


    /**
     * This is a common function which can be used to check if the element is present or not
     *
     * @param elementSelector - The actual selector(element) should be passed as a parameter
     * @param expectedElement - The expected selector(element) should be passed as a parameter
     */
    public static void elementNotPresent(String elementSelector, String expectedElement) {
        String actualElement;
        try {
            ElementHandle handle = page.querySelector("text=" + elementSelector);
            actualElement = handle.textContent();
            Assert.assertEquals(actualElement.trim(), expectedElement);
            Assert.fail("The text is present");

        } catch (NullPointerException e) {
            assertTrue(true, "The element is not present");
        }
    }


    /**
     * This is a common function which can be used to multi-select different options from the dropdown list
     * This is the function without Data Set Ids
     *
     * @param locator - The actual selector(element) should be passed as a parameter
     * @param value   - The actual value that should be selected in the dropdown is passed as a second parameter
     */

    public static void multiSelectOptionWithOutIds(String locator, String value) {
        page.click("sl-select:below(:text(\"" + locator + "\")) >> visible=true");
        page.click("sl-menu-item:has-text(\"" + value + "\") >> visible=true");
        page.click("sl-select:below(:text(\"" + locator + "\")) >> visible=true");
    }


    /**
     * This is a common function which can be used to multi-select different options from the dropdown list
     * This is the function without Data Set Ids
     *
     * @param locator - The actual selector(element) should be passed as a parameter
     * @param value   - The actual value that should be selected in the dropdown is passed as a second parameter
     */

    public static void multiSelectOption(String locator, String value) throws InterruptedException {
        //page.click("data-test-id=" + locator);
        //page.click("sl-menu-item:has-text(\"" + value + "\") >> visible=true");
        //page.click("data-test-id=" + locator);

        ElementHandle handle= page.querySelector("data-test-id=" + locator);
        handle.querySelector("fast-combobox").click();
        //  Thread.sleep(1000);
        handle.querySelector("fast-combobox").click();
        handle.type(value,new ElementHandle.TypeOptions().setDelay(100));
        // handle.querySelector("fast-combobox").type(value);
        // page.click("css=[value=\'"+value+"\']"); //value="IQ NAM"
        page.click("fast-option:has-text(\"" + value + "\") >> visible=true");
        // handle.querySelector("sl-icon").click();

        //    ElementHandle handle= page.querySelector("data-test-id=" + locator);
        //    handle.click();
        //    page.click("sl-menu-item:has-text(\"" + value + "\") >> visible=true");
        //    handle.querySelector("sl-icon").click();

        //page.click("sl-select:below(:text(\"" + locator + "\")) >> visible=true");
        //page.click("sl-menu-item:has-text(\""+value+"\") >> visible=true");
        //page.click("sl-select:below(:text(\"" + locator + "\")) >> visible=true");
    }

    /**
     *  This is a common function which can be used to check if the Button is selected and disabled
     *  This is the function without Data Set Ids
     * @param locator
     */

    public static void checkIfTheButtonIsSelectedAndDisableWithOutIds(String locator)
    {
        ElementHandle handle =  page.querySelector("zero-button.blueButton:has-text(\" "+ locator + "\")");
        String actualElement = handle.getAttribute("class");
        Assert.assertEquals(actualElement.trim(),"blueButton disabled");
    }

    /**
     *  This is a common function which can be used to check if the Button is selected and disabled
     *  This is the function Data Set Ids
     * @param locator
     */

    public static void checkIfTheButtonIsSelectedAndDisable(String locator)
    {
        ElementHandle handle =  page.querySelector("data-test-id=" + locator);
        String actualElement = handle.getAttribute("class");
        Assert.assertEquals(actualElement.trim(),"blueButton disabled");
    }

    /**
     * This is a common function which can be used to check if the Button is disabled
     * @param locator
     */

    public static void checkIfTheButtonIsDisabled(String locator)
    {
        ElementHandle handle =  page.querySelector("data-test-id=" + locator);
        String actualElement = handle.getAttribute("class");
        Assert.assertEquals(actualElement.trim(),"disabled");
        // Assert.assertEquals(actualElement.trim(),"blueButton disabled");
    }

    /**
     * This is a common function which can be used to check if the Button is disabled
     * @param locator
     */

    public static void checkIfTheButtonIsDisabledWithOutIds(String locator)
    {
        ElementHandle handle =  page.querySelector("zero-button:has-text(\" "+ locator + "\")");
        String actualElement = handle.getAttribute("class");
        Assert.assertEquals(actualElement.trim(),"disabled");
        // Assert.assertEquals(actualElement.trim(),"blueButton disabled");
    }
}
