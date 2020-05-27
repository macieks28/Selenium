package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static driver.DriverManager.getWebDriver;
import static waits.Wait.waitUntilElementIsVisible;

public class Exercise3Page extends BasePage {

    @FindBy(xpath = "//a[contains(@data-toggle,\"dropdown\")]")
    private WebElement buttonMenu;
    @FindBy(xpath = "//a[contains(.,\"Formularz\")]")
    private WebElement buttonForm;
    @FindBy(xpath = "//a[contains(.,\"Przejdź do trybu edycji\")]")
    private WebElement buttonEdit;
    @FindBy(id = "in-name")
    private WebElement inputName;
    @FindBy(id = "in-surname")
    private WebElement inputLastName;
    @FindBy(id = "in-notes")
    private WebElement inputNote;
    @FindBy(id = "in-phone")
    private WebElement inputPhone;
    @FindBy(css = "#span-file")
    private WebElement buttonUpload;

    private Logger logger = LogManager.getRootLogger();

    public void clickMenuButton() {
        waitUntilElementIsVisible(buttonMenu);
        buttonMenu.click();
        logger.info("Clicked menu button");
    }

    public void moveToButtonFormElement() {
        Actions action = new Actions(getWebDriver());
        action.moveToElement(buttonForm).perform();
        logger.info("Moved to button");
    }

    public void clickEditButton() {
        buttonEdit.click();
        logger.info("Clicked edit button");
    }

    public void typeName(String name) {
        sendKeysElement(inputName, name);
        logger.info("Typed into field text {}", name);
    }

    public void typeLastName(String lastName) {
        sendKeysElement(inputLastName, lastName);
        logger.info("Typed into field text {}", lastName);
    }

    public void typeNote(String note) {
        sendKeysElement(inputNote, note);
        logger.info("Typed into field text {}", note);
    }

    public void typePhone(String phone) {
        sendKeysElement(inputPhone, phone);
        logger.info("Typed into field text {}", phone);
    }

    public void clickButtonUploadFile() {
        buttonUpload.click();
        logger.info("Clicked upload button");
    }

    public void clickButtonSave() {
        buttonSave.click();
        logger.info("Clicked save button");
    }

}
