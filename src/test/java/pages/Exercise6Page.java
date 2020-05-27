package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

    private Logger logger = LogManager.getRootLogger();

    public void typeLogin(String login) {
        waitUntilElementIsVisible(inputLogin);
        inputLogin.sendKeys(login);
        logger.info("Typed login {}", login);
    }

    public void typePassword(String password) {
        inputPassword.sendKeys(password);
        buttonLogin.click();
        logger.info("Typed login {}", password);
    }

    public void downloadFile() {
        waitUntilElementIsClickable(linkToDownload);
        linkToDownload.click();
        logger.info("Clicked on download button");
    }
}
