package tests;

import driver.DriverUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Exercise2Page;

import java.util.List;

import static navigation.ApplicationURLs.EXERCISE_2;

public class Exercise2Test extends TestBase {


    @Test
    public void chooseSportFromDropDownAndCheckFilter() {
        DriverUtils.navigateToPage(EXERCISE_2);
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
