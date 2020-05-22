package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Exercise3Page;

import static driver.DriverManager.getWebDriver;
import static pages.BasePage.chooseExercise;

public class Exercise3Test extends TestBase {


    @Test
    public void activateAndFillTheForm() {
        chooseExercise("3");
        Exercise3Page exercise3Page = new Exercise3Page();
        exercise3Page.editForm();
        exercise3Page.fillTheFormAndSave("Jan", "Kowalski", "testowa notatka", "600600600");
        Assert.assertFalse(getWebDriver().findElement(By.id("in-name")).isEnabled());
    }
}
