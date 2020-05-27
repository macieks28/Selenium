package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static waits.Wait.waitUntilElementIsVisible;

public class Exercise5Page extends BasePage {

    @FindBy(xpath = "//span[contains(.,\"Wgraj plik\")]")
    private WebElement buttonUploadFile;

    private Logger logger = LogManager.getRootLogger();

    public void clickUpload() {
        waitUntilElementIsVisible(buttonUploadFile);
        buttonUploadFile.click();
        logger.info("Clicked upload button");
    }


}
