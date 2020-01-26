package Test;

import Pages.Zadanie4Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Zadanie4Test extends BaseTest {

    private Zadanie4Page zadanie4Page;

    @BeforeMethod
    @Override
    public void SetUp() {
        super.SetUp();
        zadanie4Page = new Zadanie4Page(driver);
    }

    @Test
    public void AplikujeNaStanowisko() throws InterruptedException {
        driver.get(baseUrl);
        basePage.wybierzZadanie("4");
        zadanie4Page.aplikujIWypelnijFormularz("Maciej", "bbbbb@aaaa.pl", "600-600-600");
        WebElement wynik = driver.findElement(By.xpath("//h1"));
        Assert.assertEquals("Wiadomość została wysłana", wynik.getText());
        Thread.sleep(5000);
    }
}
