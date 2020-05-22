package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static waits.Wait.waitUntilElementIsClickable;
import static waits.Wait.waitUntilElementIsVisible;


public class Exercise6Page extends BasePage {

    @FindBy(name = "LoginForm[_username]")
    private WebElement inputLogin;
    @FindBy(name = "LoginForm[_password]")
    private WebElement inputPassword;
    @FindBy(name = "LoginForm[save]")
    private WebElement buttonLogin;
    @FindBy(xpath = "//a[text()=\"Pobierz plik\"]")
    private WebElement linkToDownload;

    public void logIn(String login, String password) {
        waitUntilElementIsVisible(inputLogin);
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        buttonLogin.click();
    }

    public void downloadFile() {
        waitUntilElementIsClickable(linkToDownload);
        linkToDownload.click();
    }
}
