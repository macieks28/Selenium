package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Zadanie5Page extends BasePage {
    public Zadanie5Page(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//span[contains(.,\"Wgraj plik\")]")
    private WebElement przyciskWgrajPlik;


    public void wgrajPlik() throws AWTException, InterruptedException {
    clickElement(przyciskWgrajPlik);
        StringSelection ss = new StringSelection("C:\\Users\\Admin\\IdeaProjects\\Asta\\Zadanie5.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
    }
}
