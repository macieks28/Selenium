package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Zadanie7Page extends BasePage {
    public Zadanie7Page(WebDriver driver) {
        super(driver);
    }

    public void przeniesElementDoKoszyka(String nazwaProduktu) {
        WebElement dragFrom = driver.findElement(By.xpath("//h4[text()='" + nazwaProduktu + "']//parent::div/parent::div/div[contains(@class,\"draggable\")]"));
        WebElement dropTo = driver.findElement(By.xpath("//div[@class='panel-body']"));
        Actions action = new Actions(driver);
        action.dragAndDrop(dragFrom, dropTo).build().perform();

    }

}
