package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Exercise1Page;
import pages.Exercise7Page;

import static pages.BasePage.chooseExercise;

public class Exercise7Test extends TestBase {

    @Test
    public void dragAndDropProductToBasketAndCheckQuantity() {
        chooseExercise("7");
        Exercise1Page exercise1Page = new Exercise1Page();
        exercise1Page.setQuantity("Okulary", "5");
        Exercise7Page exercise7Page = new Exercise7Page();
        exercise7Page.dragAndDropProductToBasket("Okulary");
        Assert.assertEquals(exercise1Page.checkProductsQuantityInBasket(), "5");
    }
}
