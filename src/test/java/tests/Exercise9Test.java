package tests;

import driver.DriverUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Exercise9Page;

import static driver.DriverManager.getWebDriver;
import static navigation.ApplicationURLs.EXERCISE_9;

public class Exercise9Test extends TestBase {

    @Test
    public void changeFolderAndHeaderNames() {
        DriverUtils.navigateToPage(EXERCISE_9);
        Exercise9Page exercise9Page = new Exercise9Page();
        exercise9Page
                .clickOnRootFolder()
                .contextClickOnElement()
                .moveToElement()
                .typeFolderName("Test");
        Assert.assertEquals(getWebDriver().findElement(By.xpath("//h1")).getText(), "Test");
    }
}
