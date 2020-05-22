package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static driver.DriverManager.getWebDriver;

public class Exercise1Page extends BasePage {

    @FindBy(xpath = "//span[@class=\"summary-quantity\"]")
    private WebElement sumQuantity;


    public void addProductToBasket(String productName, String quantity){
        setQuantity(productName, quantity);
        clickAddProduct(productName);

    }

    public void setQuantity(String productName, String quantity){
        WebElement inputQuantity = getWebDriver().findElement(By.xpath("//h4[text()='" + productName + "']//parent::div//input"));
        sendKeysElement(inputQuantity,quantity);
    }

    private void clickAddProduct(String productName){
        WebElement buttonAdd = getWebDriver().findElement(By.xpath("//h4[text()='" + productName + "']//parent::div//button"));
        buttonAdd.click();
    }

    public String checkProductsQuantityInBasket(){
        return sumQuantity.getText();
    }
}
