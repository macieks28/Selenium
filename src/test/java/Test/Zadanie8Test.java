package Test;

import Pages.Zadanie8Page;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Zadanie8Test extends BaseTest {

    private Zadanie8Page zadanie8Page;

    @BeforeMethod
    @Override
    public void SetUp() {
        super.SetUp();
        zadanie8Page = new Zadanie8Page(driver);
    }

    @Test
    public void wykonujePlatnoscKarta(){
        driver.get(baseUrl);
        basePage.wybierzZadanie("8");
        zadanie8Page.wypelnijFormularzIZaplac("Visa", "Maciej Xinski", "4111111111111111", "123", "February", "2022");
        Assert.assertEquals("Zamówienie opłacone", driver.findElement(By.xpath("//li[contains(.,'Zamówienie opłacone')]")).getText());
    }
}
