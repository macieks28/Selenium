package tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Exercise2Page;

import java.util.List;

import static pages.BasePage.chooseExercise;

public class Exercise2Test extends TestBase {


    @Test
    public void chooseSportFromDropDownAndCheckFilter(){
        //with additional cheking //TODO should be separated into more tests.
        chooseExercise("2");
        Exercise2Page exercise2Page = new Exercise2Page();
        List<WebElement> elementsBefore = exercise2Page.numberOfElements();
        System.out.println("Ilość elementów przed zastosowaniem filtra: " + elementsBefore.size());
        exercise2Page.clickDropDown();
        exercise2Page.typeTextToInput("Sport"+"\n");
        List<WebElement> elementsAfter = exercise2Page.numberOfElements();

        System.out.println("Ilość elementów po zastosowaniu filtra: " + elementsAfter.size());
        Assert.assertNotEquals(elementsBefore.size(),elementsAfter.size());

//        System.out.println("Elementy dostępne po zastosowaniu filtra");
//        for (WebElement element : elementsAfter) {
//            System.out.println(element.getText());
//            Assert.assertTrue(element.getText().contains("Sport"));
//        }
    }
}
