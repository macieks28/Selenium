package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static driver.DriverManager.getWebDriver;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(id = "save-btn")
    WebElement buttonSave;

    public static void chooseExercise(String exerciseNumber){
        WebElement exercise = getWebDriver().findElement(By.xpath("//h2[contains(.,'Zadanie " + exerciseNumber +"')]"));
        exercise.click();
    }
    void sendKeysElement(WebElement element,String text){
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(text);
    }
}
