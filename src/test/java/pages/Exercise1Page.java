package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static driver.DriverManager.getWebDriver;
import static waits.Wait.waitUntilElementIsVisible;

public class Exercise1Page extends BasePage {

    @FindBy(xpath = "//span[@class=\"summary-quantity\"]")
    private WebElement sumQuantity;
    @FindBy(css = "h1")
    private WebElement header;

    private Logger logger = LogManager.getRootLogger();     //TODO dodanie loggera i redesign metod w page obiectach

    public void typeQuantity(String productName, String quantity) {
        waitUntilElementIsVisible(header);
        WebElement inputQuantity = getWebDriver().findElement(By.xpath("//h4[text()='" + productName + "']//parent::div//input"));
        sendKeysElement(inputQuantity, quantity);
        logger.info("Typed into field text {}", quantity);
    }

    public void clickOnAddProduct(String productName) {
        WebElement buttonAdd = getWebDriver().findElement(By.xpath("//h4[text()='" + productName + "']//parent::div//button"));
        buttonAdd.click();
        logger.info("Clicked Dodaj button");
    }

    public String checkProductsQuantityInBasket() {
        String sum = sumQuantity.getText();
        logger.info("Checked quantity was {}", sum);
        return sum;
    }
}
