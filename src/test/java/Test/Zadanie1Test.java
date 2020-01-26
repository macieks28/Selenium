package Test;

import Pages.Zadanie1Page;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Zadanie1Test extends BaseTest {


    private Zadanie1Page zadanie1Page;

    @BeforeMethod
    @Override
    public void SetUp() {
        super.SetUp();
        zadanie1Page = new Zadanie1Page(driver);
    }

    @Test
    public void DodajeProduktyDoKoszyka(){
    driver.get(baseUrl);
    basePage.wybierzZadanie("1");
    zadanie1Page.dodajProduktyDoKoszyka("Piłka", "3");
    Assert.assertEquals("3",zadanie1Page.sprawdzIloscProduktowWKoszyku());
    }
}
