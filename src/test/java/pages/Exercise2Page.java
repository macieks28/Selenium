package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static driver.DriverManager.getWebDriver;
import static waits.Wait.waitUntilElementIsVisible;

public class Exercise2Page extends BasePage {


    @FindBy(css = "h1")
    private WebElement header;


    private Logger logger = LogManager.getRootLogger();

    public void clickDropDown() {
        waitUntilElementIsVisible(header);
        WebElement drop = getWebDriver().findElement(By.xpath("//span[contains(@class,\"select2-container\")]"));
        drop.click();
        logger.info("Clicked dropdown");
    }

    public void typeTextToInput(String text) {
        WebElement input = getWebDriver().findElement(By.xpath("//input[contains(@class,\"select2-search__field\")]"));
        sendKeysElement(input, text);
        logger.info("Typed into field text {}", text);
    }

    //    public void selectFromDropDown(WebElement element, String tekst) {
//        Select select = new Select(element);
//        select.selectByVisibleText(tekst);
//    }


    public List numberOfElements() {
        List<WebElement> elements = getWebDriver().findElements(By.cssSelector(".col-sm-6.col-md-2"));
        return elements;
    }
}
