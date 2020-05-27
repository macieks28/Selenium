package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static driver.DriverManager.getWebDriver;
import static pages.BasePage.chooseExercise;

public class TransitionFromMainPageToTaskTest extends TestBase {
    @Test
    public void goFromMainPageToExercise() {
        chooseExercise("1");
        Assert.assertEquals(getWebDriver().findElement(By.xpath("//div/ul[@class='nav navbar-nav navbar-task']")).getText(),"Zadanie 1");
    }
}
