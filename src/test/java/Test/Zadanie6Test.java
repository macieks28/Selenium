package Test;

import Pages.Zadanie6Page;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;

public class Zadanie6Test extends BaseTest {

    private Zadanie6Page zadanie6Page;

    @BeforeMethod
    @Override
    public void SetUp() {
        super.SetUp();
        zadanie6Page = new Zadanie6Page(driver);
    }

    @Test
    public void LogujeSieIPobieraPlik(){
        driver.get(baseUrl);
        basePage.wybierzZadanie("6");
        zadanie6Page.zalogujSie("tester", "123-xyz");
        zadanie6Page.pobierzPlik();
    }
}
