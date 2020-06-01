package configuration;

public class LocalWebDriverProperties {

    public static String getChromeDriverLocation() {
        return ConfigurationProperties.getProperties().getProperty("chrome.driver.location");
    }

    public static String getFirefoxDriverLocation() {
        return ConfigurationProperties.getProperties().getProperty("firefox.driver.location");
    }

    public static String getIEDriverLocation() {
        return ConfigurationProperties.getProperties().getProperty("ie.driver.location");
    }
}
