package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Zadanie3Page extends BasePage {
    public Zadanie3Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(@data-toggle,\"dropdown\")]")
    private WebElement przyciskMenu;
    @FindBy(xpath = "//a[contains(.,\"Formularz\")]")
    private WebElement przyciskFormularz;
    @FindBy(xpath = "//a[contains(.,\"Przejdź do trybu edycji\")]")
    private WebElement przyciskPrzejdzDoEdycji;
    @FindBy(id = "in-name")
    private WebElement inputImie;
    @FindBy(id = "in-surname")
    private WebElement inputNazwisko;
    @FindBy(id = "in-notes")
    private WebElement inputNotatka;
    @FindBy(id = "in-phone")
    private WebElement inputTelefon;




    public void przejdzDoEdycjiFormularza(){
        clickElement(przyciskMenu);
        Actions action = new Actions(driver);
        action.moveToElement(przyciskFormularz).build().perform();
        //clickElement(przyciskFormularz);
        clickElement(przyciskPrzejdzDoEdycji);

    }
    public void wypelnijFormularzIZapisz(String imie, String nazwisko, String notatka, String telefon){
        sendKeysElement(inputImie,imie);
        sendKeysElement(inputNazwisko,nazwisko);
        sendKeysElement(inputNotatka,notatka);
        sendKeysElement(inputTelefon,telefon);
        clickElement(przyciskZapisz);
    }

}
