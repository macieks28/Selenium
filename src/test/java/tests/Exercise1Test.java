package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Exercise1Page;

import static pages.BasePage.chooseExercise;


public class Exercise1Test extends TestBase {

    @Test
    public void addProductToBasket() {
        chooseExercise("1");
        Exercise1Page exercise1Page = new Exercise1Page();
        exercise1Page.addProductToBasket("Piłka", "3");
        Assert.assertEquals(exercise1Page.checkProductsQuantityInBasket(), "3");

    }
}
