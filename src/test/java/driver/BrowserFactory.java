package driver;

import configuration.TestRunProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static configuration.LocalWebDriverProperties.*;

class BrowserFactory {

    private static final String MESSAGE_UNKNOWN_BROWSER = "Unknown browser type!";
    private BrowserType browserType;
    private boolean isRemoteRun;

    public BrowserFactory(BrowserType browserType, boolean isRemoteRun) {
        this.browserType = browserType;
        this.isRemoteRun = isRemoteRun;
    }

    public WebDriver getBrowser() {
        if (isRemoteRun) {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            switch (browserType) {
                case CHROME:
                    ChromeOptions chromeOptions = new ChromeOptions();
                    desiredCapabilities.merge(chromeOptions);
                    return getRemoteWebDriver(desiredCapabilities);
                case FIREFOX:
                    System.setProperty("webdriver.gecko.driver", getFirefoxDriverLocation());
                    return new FirefoxDriver();
                case IE:
                    System.setProperty("webdriver.ie.driver", getIEDriverLocation());
                    return new InternetExplorerDriver();
                default:
                    throw new IllegalStateException(MESSAGE_UNKNOWN_BROWSER);
            }
        } else {
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
                    throw new IllegalStateException(MESSAGE_UNKNOWN_BROWSER);
            }
        }
    }

    private WebDriver getRemoteWebDriver(DesiredCapabilities desiredCapabilities) {
        RemoteWebDriver remoteWebDriver;
        try {
            remoteWebDriver = new RemoteWebDriver(new URL(TestRunProperties.getGridUrl()), desiredCapabilities); //it should be filled properly using properties and Selenium GRID
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to create RemoteWebDriver becouse: " + e.getMessage());
        }
        return remoteWebDriver;
    }
}
