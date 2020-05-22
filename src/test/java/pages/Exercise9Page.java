package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static driver.DriverManager.getWebDriver;


public class Exercise9Page extends BasePage {

    @FindBy(xpath = "//a[contains(text(),\"Root node\")]")
    private WebElement rootFolder;
    @FindBy(xpath = "//h1[contains(text(),\"\")]")
    private WebElement header;
    @FindBy(xpath = "//li/a[contains(text(),\"Zmień nazwę\")]")
    private WebElement buttonChangeName;


    public void changeFolderName() {
        WebDriverWait wait = new WebDriverWait(getWebDriver(), 5);
        wait.until(ExpectedConditions.elementToBeClickable(rootFolder));
        rootFolder.click();
        Actions actions = new Actions(getWebDriver());
        actions.contextClick(rootFolder)
                .perform();
        actions.moveToElement(buttonChangeName)
                .click().perform();
        actions.sendKeys("test")
                .sendKeys(Keys.ENTER)
                .perform();
    }

}
