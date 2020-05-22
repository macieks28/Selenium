package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static driver.DriverManager.getWebDriver;

public class Exercise7Page extends BasePage {

    public void dragAndDropProductToBasket(String productName) {
        WebElement dragFrom = getWebDriver().findElement(By.xpath("//h4[text()='" + productName + "']//parent::div/parent::div/div[contains(@class,\"draggable\")]"));
        WebElement dropTo = getWebDriver().findElement(By.xpath("//div[@class='panel-body']"));
        Actions action = new Actions(getWebDriver());
        action.dragAndDrop(dragFrom, dropTo).build().perform();

    }

}
