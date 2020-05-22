package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static driver.DriverManager.getWebDriver;

public class Exercise2Page extends BasePage {

//    public void wybierzZDropDowna(WebElement element, String tekst) {
//        Select wybierzzDropa = new Select(element);
//        wybierzzDropa.selectByVisibleText(tekst);
//    }

    public void selectFromDropSpan(String text) {
        WebElement drop = getWebDriver().findElement(By.xpath("//span[contains(@class,\"select2-container\")]"));
        drop.click();
        WebElement input = getWebDriver().findElement(By.xpath("//input[contains(@class,\"select2-search__field\")]"));
        sendKeysElement(input,text);
    }
}
