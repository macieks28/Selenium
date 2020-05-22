package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Exercise5Page;

import java.awt.*;

import static driver.DriverManager.getWebDriver;
import static pages.BasePage.chooseExercise;

public class Exercise5Test extends TestBase {

    @Test
    public void uploadFileAndCheckTable() throws AWTException, InterruptedException {
        chooseExercise("5");
        Exercise5Page exercise5Page = new Exercise5Page();
        exercise5Page.uploadFile();
        WebElement fieldName = getWebDriver().findElement(By.xpath("//td"));
        Assert.assertEquals(fieldName.getText(), "Jan");
    }
}
