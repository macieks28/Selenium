package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import static configuration.LocalWebDriverProperties.*;

class BrowserFactory {

    static WebDriver getBrowser(BrowserType browserType) {
        switch (browserType) {
            case CHROME:
                System.setProperty("webdriver.chrome.driver", getChromeDriverLocation());
                return new ChromeDriver();
            case FIREFOX:
                System.setProperty("webdriver.gecko.driver", getFirefoxDriverLocation());
                return new FirefoxDriver();
            case IE:
                System.setProperty("webdriver.ie.driver", getIEDriverLocation());
                return new InternetExplorerDriver();
            default:
                throw new IllegalStateException("Unknown browser!");
        }
    }
}
