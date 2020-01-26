package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Zadanie9Page extends BasePage {
    public Zadanie9Page(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),\"Root node\")]")
    private WebElement rootFolder;
    @FindBy(xpath = "//h1[contains(text(),\"\")]")
    private WebElement naglowek;
    @FindBy(xpath = "//li/a[contains(text(),\"Zmień nazwę\")]")
    private WebElement przyciskZmienNazwe;


    public void zmienNazweFolderu() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(rootFolder));
        clickElement(rootFolder);
        Actions actions = new Actions(driver);
        actions.contextClick(rootFolder)
                .perform();
        actions.moveToElement(przyciskZmienNazwe)
                .click().perform();
        actions.sendKeys("test")
                .sendKeys(Keys.ENTER)
                .perform();
    }

}
