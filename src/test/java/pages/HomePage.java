package pages;

import base.FrameworkConfig;
import com.microsoft.playwright.Page;

public class HomePage {


    Page page = FrameworkConfig.LocalPage;


    String btnconfiguration = "text='Configuration'";

   public void clickConfiguration(){
        page.click(btnconfiguration);
    }



    }


