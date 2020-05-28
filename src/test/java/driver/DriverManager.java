package driver;

import org.openqa.selenium.WebDriver;

import static configuration.LocalWebDriverProperties.getLocalBrowser;


public class DriverManager {

    private static WebDriver driver;

    private DriverManager() {
    }

    public static WebDriver getWebDriver() {

        if (driver == null) {
            driver = BrowserFactory.getBrowser(getLocalBrowser());
        }
        return driver;
    }

    public static void disposeDriver() {
        driver.close();
        if (!getLocalBrowser().equals(BrowserType.FIREFOX)) {
            driver.quit();
        }
        driver = null;
    }
}
