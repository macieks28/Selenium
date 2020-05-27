package tests;

import driver.DriverManager;
import driver.DriverUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    private static String BASE_URL = "https://testingcup.pgs-soft.com/";

    @BeforeMethod
    public void setUp() {
        DriverManager.getWebDriver();
        DriverUtils.setInitialConfiguration();
        DriverUtils.navigateToPage(BASE_URL);
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.disposeDriver();
    }
}
