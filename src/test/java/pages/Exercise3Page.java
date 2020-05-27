package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static driver.DriverManager.getWebDriver;
import static waits.Wait.waitUntilElementIsClickable;
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

    public Exercise3Page clickMenuButton() {
        waitUntilElementIsVisible(buttonMenu);
        buttonMenu.click();
        logger.info("Clicked menu button");
        return this;
    }

    public Exercise3Page moveToButtonFormElement() {
        Actions action = new Actions(getWebDriver());
        action.moveToElement(buttonForm).perform();
        logger.info("Moved to button");
        return this;
    }

    public Exercise3Page clickEditButton() {
        buttonEdit.click();
        logger.info("Clicked edit button");
        return this;
    }

    public Exercise3Page typeName(String name) {
        waitUntilElementIsClickable(inputName);
        sendKeysElement(inputName, name);
        logger.info("Typed into field text {}", name);
        return this;
    }

    public Exercise3Page typeLastName(String lastName) {
        sendKeysElement(inputLastName, lastName);
        logger.info("Typed into field text {}", lastName);
        return this;
    }

    public Exercise3Page typeNote(String note) {
        sendKeysElement(inputNote, note);
        logger.info("Typed into field text {}", note);
        return this;
    }

    public Exercise3Page typePhone(String phone) {
        sendKeysElement(inputPhone, phone);
        logger.info("Typed into field text {}", phone);
        return this;
    }

    public Exercise3Page clickButtonUploadFile() {
        buttonUpload.click();
        logger.info("Clicked upload button");
        return this;
    }

    public Exercise3Page clickButtonSave() {
        buttonSave.click();
        logger.info("Clicked save button");
        return this;
    }

}
