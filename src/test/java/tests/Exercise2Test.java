package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Exercise2Page;

import java.util.List;

import static driver.DriverManager.getWebDriver;
import static pages.BasePage.chooseExercise;

public class Exercise2Test extends TestBase {


    @Test
    public void chooseSportFromDropDownAndCheckFilter(){
        chooseExercise("2");

        List<WebElement> elementyPrzed = getWebDriver().findElements(By.cssSelector(".col-sm-6.col-md-2"));
        int liczbaPoczatkowa = elementyPrzed.size();
        System.out.println("Ilość elementów przed zastosowaniem filtra");
        System.out.println(elementyPrzed.size());

        Exercise2Page exercise2Page = new Exercise2Page();
        exercise2Page.selectFromDropSpan("Sport"+"\n");

        List<WebElement> elementyPo = getWebDriver().findElements(By.cssSelector(".col-sm-6.col-md-2"));
        int liczbaKoncowa = elementyPo.size();

        Assert.assertNotEquals(liczbaPoczatkowa,liczbaKoncowa);

        System.out.println("Ilość elementów po zastosowaniu filtra");
        System.out.println(elementyPo.size());
        System.out.println("Elementy dostępne po zastosowaniu filtra");
        for(WebElement element : elementyPo){
            System.out.println(element.getText());
            Assert.assertTrue(element.getText().contains("Sport"));
        }
    }
}
