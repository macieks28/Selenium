package tests;

import driver.DriverUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Exercise1Page;
import pages.Exercise7Page;

import static navigation.ApplicationURLs.EXERCISE_7;

public class Exercise7Test extends TestBase {

    @Test
    public void dragAndDropProductToBasketAndCheckQuantity() {
        DriverUtils.navigateToPage(EXERCISE_7);
        Exercise1Page exercise1Page = new Exercise1Page();
        String productName = "Okulary";
        exercise1Page.typeQuantity(productName, "5");
        Exercise7Page exercise7Page = new Exercise7Page();
        exercise7Page.dragAndDropProductToBasket(productName);
        Assert.assertEquals(exercise1Page.checkProductsQuantityInBasket(), "5");
    }
}
