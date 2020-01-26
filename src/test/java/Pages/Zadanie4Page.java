package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class Zadanie4Page extends BasePage {
    public Zadanie4Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[text()=\"APLIKUJ\"]")
    private WebElement przyciskAplikuj;
    @FindBy(xpath = "//input[contains(@name,\"name\")]")
    private WebElement inputImie;
    @FindBy(name = "email")
    private WebElement inputEmail;
    @FindBy(name = "phone")
    private WebElement inputTelefon;
    @FindBy(xpath = "//iframe")
    private WebElement iframeramka;



    public void aplikujIWypelnijFormularz(String imie, String email, String telefon){
        clickElement(przyciskAplikuj);
        Set<String> allWindowHandles = driver.getWindowHandles();
        String lastWindowHandle = "";
        for (String handle : allWindowHandles) {
            driver.switchTo().window(handle);
            lastWindowHandle = handle;
        }
        driver.switchTo().window(lastWindowHandle);
        driver.switchTo().frame(iframeramka);
        sendKeysElement(inputImie, imie);
        sendKeysElement(inputEmail, email);
        sendKeysElement(inputTelefon, telefon);
        clickElement(przyciskZapisz);
    }
}




