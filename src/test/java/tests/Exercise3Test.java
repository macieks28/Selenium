package tests;

import driver.DriverUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Exercise3Page;

import static driver.DriverManager.getWebDriver;
import static navigation.ApplicationURLs.EXERCISE_3;
import static pages.BasePage.uploadFileByPasteItsPathToWindowOutsideBrowser;
import static waits.Wait.waitUntilElementIsNotVisible;

public class Exercise3Test extends TestBase {


    @Test
    public void activateAndFillTheForm() throws InterruptedException {
        DriverUtils.navigateToPage(EXERCISE_3);
        Exercise3Page exercise3Page = new Exercise3Page();
        exercise3Page
                .clickMenuButton()
                .moveToButtonFormElement()
                .clickEditButton()
                .typeName("Jan")
                .typeLastName("Kowalski")
                .typeNote("Testowa notatka")
                .typePhone("600600600")
                .clickButtonUploadFile();
        Thread.sleep(1000); //TODO avoid Thread.sleep
        uploadFileByPasteItsPathToWindowOutsideBrowser("C:\\Users\\Admin\\IdeaProjects\\Asta\\src\\main\\resources\\test.jpg");
        waitUntilElementIsNotVisible(By.xpath("//img[@src='/images/pgs_cv.jpg']"));
        exercise3Page.clickButtonSave();
        Assert.assertFalse(getWebDriver().findElement(By.id("in-name")).isEnabled());
    }
}
