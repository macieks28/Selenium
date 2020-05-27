package tests;

import driver.DriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Exercise4Page;

import static driver.DriverManager.getWebDriver;
import static navigation.ApplicationURLs.EXERCISE_4;
import static pages.BasePage.chooseExercise;

public class Exercise4Test extends TestBase {

    @Test
    public void applyForPositionAndFillTheForm() {
        DriverUtils.navigateToPage(EXERCISE_4);
        Exercise4Page exercise4Page = new Exercise4Page();
        exercise4Page
                .clickApplyButton()
                .switchToNewWindowAndFrame()
                .typeName("Maciej")
                .typeEmail("example@example.com")
                .typePhone("600-600-600")
                .clickOnSaveButton();
        WebElement result = getWebDriver().findElement(By.xpath("//h1"));
        Assert.assertEquals(result.getText(), "Wiadomość została wysłana");
    }
}
