package config;

import com.microsoft.playwright.*;

public class PlaywrightTestGenerator {

        public static void main(String[] args) {

            Playwright playwright = Playwright.create();
            BrowserType browserType = playwright.chromium();
            Browser browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(false));
            BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions().setIgnoreHTTPSErrors(true));
            Page page = browserContext.newPage();
            page.navigate("https://dev-hsbc-priss1");
            page.pause();
        }

    }

