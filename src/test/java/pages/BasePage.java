package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import static driver.DriverManager.getWebDriver;

public class BasePage {

    public BasePage() {
        PageFactory.initElements(getWebDriver(), this);
    }

    @FindBy(id = "save-btn")
    WebElement buttonSave;

    Logger logger = LogManager.getRootLogger();

    public static void chooseExercise(String exerciseNumber) {
        WebElement exercise = getWebDriver().findElement(By.xpath("//h2[contains(.,'Zadanie " + exerciseNumber + "')]"));
        exercise.click();
    }

    void sendKeysElement(WebElement element, String text) {
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(text);
    }

    public static void uploadFileByPasteItsPathToWindowOutsideBrowser(String absolutePath) {
        StringSelection ss = new StringSelection(absolutePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        pasteTextToWindowOutsideBrowserAndClickEnter();
    }

    private static void pasteTextToWindowOutsideBrowserAndClickEnter() {
        //uses ctrl+v then enter
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }

    }
}
