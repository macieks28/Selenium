package tests;

import driver.DriverUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Exercise8Page;

import static driver.DriverManager.getWebDriver;
import static navigation.ApplicationURLs.EXERCISE_8;

public class Exercise8Test extends TestBase {

    @Test
    public void makePaymentUsingCreditCard() throws InterruptedException {
        DriverUtils.navigateToPage(EXERCISE_8);
        Exercise8Page exercise8Page = new Exercise8Page();
        exercise8Page
                .selectCardType("Visa")
                .typeNameAndLastname("Maciej Xinski")
                .typeCardNumber("4111111111111111")
                .typeCvv("123")
                .selectMonth("February")
                .selectYear("2022")
                .clickOnPayButton();
        Thread.sleep(500); //TODO Avoid thread sleep
        Assert.assertEquals(getWebDriver().findElement(By.xpath("//li[contains(.,'Zamówienie opłacone')]")).getText(), "Zamówienie opłacone");
    }
}
