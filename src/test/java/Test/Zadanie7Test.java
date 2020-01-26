package Test;

import Pages.Zadanie1Page;
import Pages.Zadanie7Page;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Zadanie7Test extends BaseTest {

    private Zadanie7Page zadanie7Page;
    private Zadanie1Page zadanie1Page;
    @BeforeMethod
    @Override
    public void SetUp() {
        super.SetUp();
        zadanie7Page = new Zadanie7Page(driver);
        zadanie1Page = new Zadanie1Page(driver);
    }

    @Test
    public void przenosiProduktDoKoszyka(){
        driver.get(baseUrl);
        basePage.wybierzZadanie("7");
        zadanie1Page.wybierzIloscProduktu("Okulary","5");
        zadanie7Page.przeniesElementDoKoszyka("Okulary");
        Assert.assertEquals("5",zadanie1Page.sprawdzIloscProduktowWKoszyku());
    }
}
