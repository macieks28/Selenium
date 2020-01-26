package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Zadanie6Page extends BasePage {
    public Zadanie6Page(WebDriver driver) {
        super(driver);
    }

    @FindBy (name = "LoginForm[_username]")
    private WebElement inputLogin;
    @FindBy (name = "LoginForm[_password]")
    private WebElement inputHaslo;
    @FindBy (name = "LoginForm[save]")
    private WebElement przyciskLogin;
    @FindBy (xpath = "//a[text()=\"Pobierz plik\"]")
    private WebElement linkDoPobraniaPliku;

    public void zalogujSie(String login, String haslo){
        sendKeysElement(inputLogin, login);
        sendKeysElement(inputHaslo, haslo);
        clickElement(przyciskLogin);

    }
    public void pobierzPlik(){
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(linkDoPobraniaPliku));
        clickElement(linkDoPobraniaPliku);
    }
}
