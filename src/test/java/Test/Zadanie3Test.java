package Test;

import Pages.Zadanie3Page;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Zadanie3Test extends BaseTest {

    private Zadanie3Page zadanie3Page;

    @BeforeMethod
    @Override
    public void SetUp() {
        super.SetUp();
        zadanie3Page = new Zadanie3Page(driver);
    }

    @Test
    public void WlaczaTrybEdycjiIWypelniaFormularz(){
        driver.get(baseUrl);
        basePage.wybierzZadanie("3");
        zadanie3Page.przejdzDoEdycjiFormularza();
        zadanie3Page.wypelnijFormularzIZapisz("Jan", "Kowalski", "testowa notatka", "600600600");
        Assert.assertFalse(driver.findElement(By.id("in-name")).isEnabled());
    }
}
