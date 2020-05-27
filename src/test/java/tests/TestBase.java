package tests;

import driver.DriverManager;
import driver.DriverUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static navigation.ApplicationURLs.APPLICATION_URL;

public class TestBase {

    @BeforeMethod
    public void setUp() {
        DriverManager.getWebDriver();
        DriverUtils.setInitialConfiguration();
        DriverUtils.navigateToPage(APPLICATION_URL);
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.disposeDriver();
    }
}
