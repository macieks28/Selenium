package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Exercise2Page;

import java.util.List;

import static pages.BasePage.chooseExercise;

public class Exercise2Test extends TestBase {


    @Test
    public void chooseSportFromDropDownAndCheckFilter() {
        chooseExercise("2");
        Exercise2Page exercise2Page = new Exercise2Page();
        List elementsBefore = exercise2Page.numberOfElements();
        System.out.println("Ilość elementów przed zastosowaniem filtra: " + elementsBefore.size());

        exercise2Page
                .clickDropDown()
                .typeTextToInput("Sport" + "\n");

        List elementsAfter = exercise2Page.numberOfElements();
        System.out.println("Ilość elementów po zastosowaniu filtra: " + elementsAfter.size());

        Assert.assertNotEquals(elementsBefore.size(), elementsAfter.size());
    }
}
