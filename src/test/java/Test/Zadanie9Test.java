package Test;

import Pages.Zadanie9Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.awt.*;

public class Zadanie9Test extends BaseTest {

    private Zadanie9Page zadanie9Page;

    @BeforeMethod
    @Override
    public void SetUp() {
        super.SetUp();
        zadanie9Page = new Zadanie9Page(driver);
    }

    @Test
    public void zmieniaNazweFolderuINaglowka(){
        driver.get(baseUrl);
        basePage.wybierzZadanie("9");
        zadanie9Page.zmienNazweFolderu();
        Assert.assertEquals("test", driver.findElement(By.xpath("//h1")).getText());
    }
}
