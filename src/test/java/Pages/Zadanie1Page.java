package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Zadanie1Page extends BasePage {

    public Zadanie1Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class=\"summary-quantity\"]")
    private WebElement sumaProduktow;


    public void dodajProduktyDoKoszyka(String nazwaProduktu, String ilosc){
        wybierzIloscProduktu(nazwaProduktu, ilosc);
        kliknijDodajProdukt(nazwaProduktu);

    }

    public void wybierzIloscProduktu(String nazwaProduktu, String ilosc){
        WebElement inputIlosc = driver.findElement(By.xpath("//h4[text()='" + nazwaProduktu + "']//parent::div//input"));
        sendKeysElement(inputIlosc, ilosc);
    }

    public void kliknijDodajProdukt(String nazwaProduktu){
        WebElement przyciskDodaj = driver.findElement(By.xpath("//h4[text()='" + nazwaProduktu + "']//parent::div//button"));
        clickElement(przyciskDodaj);
    }

    public String  sprawdzIloscProduktowWKoszyku(){
        return sumaProduktow.getText();
    }
}
