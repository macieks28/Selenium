package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "save-btn")
    protected WebElement przyciskZapisz;



    public void clickElement(WebElement element) {
      //  System.out.println("Klikam w element: " + element.toString());
        element.click();
    }

    public void sendKeysElement(WebElement element, String text) {
       // System.out.println("Wpisuję w element: " + element.toString() + " tekst " + text);
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(text);
    }
    public void wybierzZadanie(String numerZadania){
        WebElement zadanie = driver.findElement(By.xpath("//h2[contains(.,'Zadanie " + numerZadania +"')]"));
        zadanie.click();
    }
}
