package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static driver.DriverManager.getWebDriver;

public class Exercise7Page extends BasePage {

    private Logger logger = LogManager.getRootLogger();

    public void dragAndDropProductToBasket(String productName) {
        WebElement dragFrom = getWebDriver().findElement(By.xpath("//h4[text()='" + productName + "']//parent::div/parent::div/div[contains(@class,\"draggable\")]"));
        WebElement dropTo = getWebDriver().findElement(By.xpath("//div[@class='panel-body']"));
        Actions action = new Actions(getWebDriver());
        action.dragAndDrop(dragFrom, dropTo).build().perform();
        logger.info("Dragged and dropped item to basket");
    }

}
