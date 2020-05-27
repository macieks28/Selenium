package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

import static driver.DriverManager.getWebDriver;
import static waits.Wait.waitUntilElementIsVisible;

public class Exercise4Page extends BasePage {

    @FindBy(xpath = "//button[text()=\"APLIKUJ\"]")
    private WebElement buttonApply;
    @FindBy(xpath = "//input[contains(@name,\"name\")]")
    private WebElement inputName;
    @FindBy(name = "email")
    private WebElement inputEmail;
    @FindBy(name = "phone")
    private WebElement inputPhone;
    @FindBy(xpath = "//iframe")
    private WebElement iframeFrame;

    private Logger logger = LogManager.getRootLogger();

    public void switchToNewWindowAndFrame() {
        Set<String> allWindowHandles = getWebDriver().getWindowHandles();
        String lastWindowHandle = "";
        for (String handle : allWindowHandles) {
            getWebDriver().switchTo().window(handle);
            lastWindowHandle = handle;
        }
        getWebDriver().switchTo().window(lastWindowHandle);
        getWebDriver().switchTo().frame(iframeFrame);
        logger.info("Switched to second window and frame");
    }

    public void clickOnSaveButton() {
        buttonSave.click();
        logger.info("Clicked on save button");

    }

    public void typePhone(String phone) {
        inputPhone.sendKeys(phone);
        logger.info("Typed phone{}", phone);
    }

    public void typeEmail(String email) {
        inputEmail.sendKeys(email);
        logger.info("Typed email {}", email);
    }

    public void typeName(String name) {
        waitUntilElementIsVisible(inputName);
        inputName.sendKeys(name);
        logger.info("Typed name {}", name);
    }

    public void clickApplyButton() {
        waitUntilElementIsVisible(buttonApply);
        buttonApply.click();
        logger.info("Clicked on Apply button");
    }
}




