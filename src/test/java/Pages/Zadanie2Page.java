package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Zadanie2Page extends BasePage {
    public Zadanie2Page(WebDriver driver) {
        super(driver);
    }

    public void wybierzZDropDowna(WebElement element, String tekst) {
        Select wybierzzDropa = new Select(element);
        wybierzzDropa.selectByVisibleText(tekst);
    }

    public void wybierzZDropaSpan(String tekst) {
        WebElement drop = driver.findElement(By.xpath("//span[contains(@class,\"select2-container\")]"));
        drop.click();
        WebElement input = driver.findElement(By.xpath("//input[contains(@class,\"select2-search__field\")]"));
        sendKeysElement(input, tekst);
    }
}
