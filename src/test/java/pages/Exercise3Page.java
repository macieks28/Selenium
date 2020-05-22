package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static driver.DriverManager.getWebDriver;

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


    public void editForm() {
        buttonMenu.click();
        Actions action = new Actions(getWebDriver());
        action.moveToElement(buttonForm).perform();
        buttonEdit.click();
    }

    public void fillTheFormAndSave(String name, String lastName, String note, String phone) {
        sendKeysElement(inputName, name);
        sendKeysElement(inputLastName, lastName);
        sendKeysElement(inputNote, note);
        sendKeysElement(inputPhone, phone);
        buttonSave.click();
    }

}
