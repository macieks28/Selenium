package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static driver.DriverManager.getWebDriver;
import static waits.Wait.waitUntilElementIsClickable;


public class Exercise9Page extends BasePage {

    @FindBy(xpath = "//a[contains(text(),\"Root node\")]")
    private WebElement rootFolder;
    @FindBy(xpath = "//h1[contains(text(),\"\")]")
    private WebElement header;
    @FindBy(xpath = "//li/a[contains(text(),\"Zmień nazwę\")]")
    private WebElement buttonChangeName;

    private Logger logger = LogManager.getRootLogger();

    public Exercise9Page clickOnRootFolder() {
        waitUntilElementIsClickable(rootFolder);
        rootFolder.click();
        logger.info("Clicked on root folder");
        return this;
    }

    public Exercise9Page contextClickOnElement() {
        Actions actions = new Actions(getWebDriver());
        actions.contextClick(rootFolder)
                .perform();
        logger.info("Clicked right mouse button on root folder");
        return this;
    }

    public Exercise9Page moveToElement() {
        Actions actions = new Actions(getWebDriver());
        waitUntilElementIsClickable(buttonChangeName);
        actions.moveToElement(buttonChangeName)
                .click().perform();
        logger.info("Moved to element");
        return this;
    }

    public Exercise9Page typeFolderName(String name) {
        Actions actions = new Actions(getWebDriver());
        actions.sendKeys(name)
                .sendKeys(Keys.ENTER)
                .build().perform();
        logger.info("Typed name of the folder {}", name);
        return this;
    }

}
