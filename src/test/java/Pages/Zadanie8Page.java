package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Zadanie8Page extends BasePage {
    public Zadanie8Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "task8_form_cardType")
    private WebElement dropTypKarty;
    @FindBy(id = "task8_form_name")
    private WebElement inputImieINazwisko;
    @FindBy(id = "task8_form_cardNumber")
    private WebElement inputNrKarty;
    @FindBy(id = "task8_form_cardCvv")
    private WebElement inputKodCvv;
    @FindBy(id = "task8_form_cardInfo_month")
    private WebElement dropMiesiac;
    @FindBy(id = "task8_form_cardInfo_year")
    private WebElement dropRok;
    @FindBy(name = "task8_form[save]")
    private WebElement przyciskZaplac;


    public void wypelnijFormularzIZaplac(String metodaPlatnosci, String imieINazwisko, String nrKarty, String cvv, String miesiac, String rok) {
        Select dropTyp = new Select(dropTypKarty);
        dropTyp.selectByVisibleText(metodaPlatnosci);
        sendKeysElement(inputImieINazwisko, imieINazwisko);
        sendKeysElement(inputNrKarty, nrKarty);
        sendKeysElement(inputKodCvv, cvv);
        Select dropM = new Select(dropMiesiac);
        dropM.selectByVisibleText(miesiac);
        Select dropR = new Select(dropRok);
        dropR.selectByVisibleText(rok);
        clickElement(przyciskZaplac);
    }

}
