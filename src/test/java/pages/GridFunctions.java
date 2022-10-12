package pages;

import base.FrameworkConfig;
import com.microsoft.playwright.ElementHandle;
import com.microsoft.playwright.Page;
import org.testng.Assert;
import java.util.List;

public class GridFunctions {

    static Page page = FrameworkConfig.LocalPage;
    /**
     * This is a function which can be used to check if the RCC Admin Check Box is checked
     */
    public static void checkRCCAdminCheckboxForRequestForMoreInfo()
    {
        List<ElementHandle> gridlist = page.querySelectorAll("div.ag-center-cols-container");;
        Boolean value= gridlist.get(1).querySelector(":nth-match(.ag-row, 1)").querySelector("css=[aria-colindex='7']").querySelector("span").innerHTML().contains("checked");
        Assert.assertTrue(value);
    }

public static void selectPlusButtonInHSBCGrid(int rowNumber){
    page.querySelector("div.ag-pinned-left-cols-container").querySelector("css=[row-index=\'"+rowNumber+"\']").querySelector("css=[col-id='2']").querySelector("div button").dispatchEvent("click");
}
    public static void selectCheckboxInGrid(int gridNumber,int row,int column)
    {
        List<ElementHandle> gridlist = page.querySelectorAll("div.ag-center-cols-container");
        ElementHandle single = gridlist.get(gridNumber).querySelector(":nth-match(.ag-row, " + row + ")");
        single.querySelector("css=[aria-colindex=\'"+column+"\']").querySelector("div input").click();
    }



    public static String selectCell(int row, int column, final int gridIndex) throws InterruptedException {
        String value="";
        //    List<ElementHandle> rowElements = getGridRow(index, row).querySelectorAll("div");
        List<ElementHandle> rowElements = getLastRow(row).querySelectorAll("div");
        for (ElementHandle cell : rowElements) {
            if (cell.getAttribute("aria-colindex") != null)
                if (Integer.parseInt(cell.getAttribute("aria-colindex")) == column) {
                    // System.out.println("works");
                    // System.out.println(cell.textContent());
                    value=cell.textContent();
                    break;
                }
        }
        return value;
    }



    public static String selectCellValue(int row, int column, final int gridIndex) throws InterruptedException {
        String value="";
        List<ElementHandle> rowElements = getGridRow(gridIndex, row).querySelectorAll("div");
        // List<ElementHandle> rowElements = getLastRow(row).querySelectorAll("div");
        for (ElementHandle cell : rowElements) {
            if (cell.getAttribute("aria-colindex") != null)
                if (Integer.parseInt(cell.getAttribute("aria-colindex")) == column) {
                    // System.out.println("works");
                    // System.out.println(cell.textContent());
                    value=cell.textContent();
                    break;
                }
        }
        return value;
    }


    /**
     * This is a common function which can be used to open the submitted Material Change Request or Onboarding Request
     */
    public static void selectTheSubmittedMaterialChangeOrOnboarding() throws InterruptedException {
//        List<ElementHandle> example = page.querySelectorAll("div.ag-center-cols-container");
//        page.dblclick("div.ag-center-cols-container div");
        Thread.sleep(2000);
        //getGridRow(1,1).dblclick();
        getLastRow(1).dblclick();

        //Getting values from cell
//       String[] cellValues = getGridRow(1, 1).innerText().split("\n");
//       String[] cellValuesOne = getGridRow(1, 15).innerText().split("\n");
        //   assertFieldValues(null,cellValues);
    }

    /**
     * This is a common function which can be used to open the submitted Material Change Request or Onboarding Request
     */
    public static void selectApprovalRecord(int GridNumber, int row) throws InterruptedException {
        getGridRow(GridNumber,row).dblclick();
    }

    /**
     * This is a common function which can target a specific row from an ag-grid on a page.
     *
     * @param gridNumber the number of the grid starting from 1
     *                   Ex: if there are two grids on the page, this number should be
     *                   1 for the first one, and 2 for the second one
     *
     * @param rowNumber the number of the row starting from 1
     */
    public static ElementHandle getGridRow(int gridNumber, int rowNumber) {
        List<ElementHandle> gridlist = page.querySelectorAll("div.ag-center-cols-container");
        return gridlist.get(gridNumber - 1).querySelector(":nth-match(.ag-row, " + rowNumber + ")");
    }

    private static int getNumberOfRows(int gridNumber) {
        return page.querySelectorAll("div.ag-center-cols-container").get(gridNumber - 1).querySelectorAll(".ag-row").size();
    }

    private static ElementHandle getLastRow(int gridNumber) {
        int numberOfRows = getNumberOfRows(gridNumber);
        return getGridRow(1, numberOfRows);
    }

    private static boolean assertFieldValues(String[] expectedValues, String[] actualValues) {
      //  String values = SharedData.scenarioValues.toString();
      //  String expectedTitle = SharedData.scenarioValues.get("Change Title");
     //   Assert.assertEquals(expectedTitle,actualValues[2]);
        for (int i = 0; i < expectedValues.length; i++) {
            if (!expectedValues[i].equals(actualValues[i])) {
                return false;
            }
        }
        return true;
    }



}
