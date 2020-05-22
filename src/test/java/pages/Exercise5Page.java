package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Exercise5Page extends BasePage {

    @FindBy (xpath = "//span[contains(.,\"Wgraj plik\")]")
    private WebElement buttonUploadFile;


    public void uploadFile() throws InterruptedException, AWTException {
    buttonUploadFile.click();
        StringSelection ss = new StringSelection("C:\\Users\\Admin\\IdeaProjects\\Asta\\Zadanie5.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        pasteTextToWindowOutsideBrowserAndClickEnter();
        Thread.sleep(2000);
    }

    private void pasteTextToWindowOutsideBrowserAndClickEnter() throws AWTException {
        //uses ctrl+v then enter
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}
