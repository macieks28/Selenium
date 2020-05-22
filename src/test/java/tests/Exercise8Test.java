package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Exercise8Page;

import static driver.DriverManager.getWebDriver;
import static pages.BasePage.chooseExercise;

public class Exercise8Test extends TestBase {

    @Test
    public void makePaymentUsingCreditCard() {
        chooseExercise("8");
        Exercise8Page exercise8Page = new Exercise8Page();
        exercise8Page.fillTheFormAndPay("Visa", "Maciej Xinski", "4111111111111111", "123", "February", "2022");
        Assert.assertEquals(getWebDriver().findElement(By.xpath("//li[contains(.,'Zamówienie opłacone')]")).getText(), "Zamówienie opłacone");
    }
}
