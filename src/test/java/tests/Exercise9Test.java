package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Exercise9Page;

import static driver.DriverManager.getWebDriver;
import static pages.BasePage.chooseExercise;

public class Exercise9Test extends TestBase {

    @Test
    public void changeFolderAndHeaderNames() {
        chooseExercise("9");
        Exercise9Page exercise9Page = new Exercise9Page();
        exercise9Page.clickOnRootFolder();
        exercise9Page.contextClickOnElement();
        exercise9Page.moveToElement();
        exercise9Page.typeFolderName("Test");
        Assert.assertEquals(getWebDriver().findElement(By.xpath("//h1")).getText(), "Test");
    }
}
