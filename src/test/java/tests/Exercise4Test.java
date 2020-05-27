package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Exercise4Page;

import static driver.DriverManager.getWebDriver;
import static pages.BasePage.chooseExercise;

public class Exercise4Test extends TestBase {

    @Test
    public void applyForPositionAndFillTheForm() {
        chooseExercise("4");
        Exercise4Page exercise4Page = new Exercise4Page();
        exercise4Page.clickApplyButton();
        exercise4Page.typeName("Maciej");
        exercise4Page.typeEmail("example@example.com");
        exercise4Page.typePhone("600600600");
        exercise4Page.switchToNewWindowAndFrame();
        exercise4Page.clickOnSaveButton();
        WebElement result = getWebDriver().findElement(By.xpath("//h1"));
        Assert.assertEquals(result.getText(), "Wiadomość została wysłana");
    }
}
