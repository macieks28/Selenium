package tests;

import driver.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Exercise5Page;

import static driver.DriverManager.getWebDriver;
import static navigation.ApplicationURLs.EXERCISE_5;
import static pages.Exercise5Page.uploadFileByPasteItsPathToWindowOutsideBrowser;

public class Exercise5Test extends TestBase {

    @Test
    public void uploadFileAndCheckTable() throws InterruptedException {
        DriverUtils.navigateToPage(EXERCISE_5);
        Exercise5Page exercise5Page = new Exercise5Page();
        exercise5Page.clickUpload();
        Thread.sleep(1000); //TODO avoid Thread.sleep
        uploadFileByPasteItsPathToWindowOutsideBrowser("C:\\Users\\Admin\\IdeaProjects\\Asta\\Zadanie5.txt");
        Thread.sleep(1000); //TODO avoid Thread.sleep
        WebElement fieldName = getWebDriver().findElement(By.xpath("//td"));
        Assert.assertEquals(fieldName.getText(), "Jan");
    }
}
