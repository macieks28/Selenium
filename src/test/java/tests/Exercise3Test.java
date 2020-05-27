package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Exercise3Page;

import java.awt.*;

import static driver.DriverManager.getWebDriver;
import static pages.BasePage.chooseExercise;
import static pages.BasePage.uploadFileByPasteItsPathToWindowOutsideBrowser;
import static waits.Wait.waitUntilElementIsNotVisible;

public class Exercise3Test extends TestBase {


    @Test
    public void activateAndFillTheForm() throws InterruptedException {
        chooseExercise("3");
        Exercise3Page exercise3Page = new Exercise3Page();
        exercise3Page.clickMenuButton();
        exercise3Page.moveToButtonFormElement();
        exercise3Page.clickEditButton();
        exercise3Page.typeName("Jan");
        exercise3Page.typeLastName("Kowalski");
        exercise3Page.typeNote("Testowa notatka");
        exercise3Page.typePhone("600600600");
        exercise3Page.clickButtonUploadFile();
        Thread.sleep(1000); //TODO avoid Thread.sleep
        uploadFileByPasteItsPathToWindowOutsideBrowser("C:\\Users\\Admin\\IdeaProjects\\Asta\\src\\main\\resources\\test.jpg");
        waitUntilElementIsNotVisible(By.xpath("//img[@src='/images/pgs_cv.jpg']"));
        exercise3Page.clickButtonSave();
        Assert.assertFalse(getWebDriver().findElement(By.id("in-name")).isEnabled());
    }
}
