package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

import static driver.DriverManager.getWebDriver;

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



    public void applyAndFillForm(String name, String email, String phone){
        buttonApply.click();
        Set<String> allWindowHandles = getWebDriver().getWindowHandles();
        String lastWindowHandle = "";
        for (String handle : allWindowHandles) {
            getWebDriver().switchTo().window(handle);
            lastWindowHandle = handle;
        }
        getWebDriver().switchTo().window(lastWindowHandle);
        getWebDriver().switchTo().frame(iframeFrame);
        inputName.sendKeys(name);
        inputEmail.sendKeys(email);
        inputPhone.sendKeys(phone);
        buttonSave.click();
    }
}




