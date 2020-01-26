package Test;

import Pages.Zadanie5Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class Zadanie5Test extends BaseTest {

    private Zadanie5Page zadanie5Page;
    @BeforeMethod
    @Override
    public void SetUp() {
        super.SetUp();
        zadanie5Page = new Zadanie5Page(driver);
    }

    @Test
    public void wgrywaPlikISprawdzaTabele() throws AWTException, InterruptedException {
        driver.get(baseUrl);
        basePage.wybierzZadanie("5");
        zadanie5Page.wgrajPlik();
        WebElement komorkaImie = driver.findElement(By.xpath("//td"));
        Assert.assertEquals("Maciej", komorkaImie.getText());
    }
}
