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
        exercise8Page.selectCardType("Visa");
        exercise8Page.typeNameAndLastname("Maciej Xinski");
        exercise8Page.typeCardNumber("4111111111111111");
        exercise8Page.typeCvv("123");
        exercise8Page.selectMonth("February");
        exercise8Page.selectYear("2022");
        exercise8Page.clickOnPayButton();
        Assert.assertEquals(getWebDriver().findElement(By.xpath("//li[contains(.,'Zamówienie opłacone')]")).getText(), "Zamówienie opłacone");
    }
}
