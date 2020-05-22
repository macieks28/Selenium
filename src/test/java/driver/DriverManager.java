package driver;

import org.openqa.selenium.WebDriver;

import static driver.BrowserType.CHROME;


public class DriverManager {

    private static WebDriver driver;
    private static final BrowserType BROWSER_TYPE = CHROME;

    private DriverManager() {
    }

    public static WebDriver getWebDriver() {

        if (driver == null) {
            driver = BrowserFactory.getBrowser(BROWSER_TYPE);
        }
        return driver;
    }

    public static void disposeDriver() {
        driver.close();
        if (!BROWSER_TYPE.equals(BrowserType.FIREFOX)) {
            driver.quit();
        }
        driver = null;
    }
}
