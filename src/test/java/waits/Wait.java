package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static driver.DriverManager.getWebDriver;

public class Wait {
    private static WebDriverWait getWebDriverWait() {
        return new WebDriverWait(getWebDriver(), 10, 200);
    }

    public static void waitUntilElementIsVisible(WebElement element) {
        WebDriverWait wait = getWebDriverWait();
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitUntilElementIsClickable(WebElement element) {
        WebDriverWait webDriverWait = getWebDriverWait();
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void waitUntilElementIsNotVisible(By byElement) {
        WebDriverWait webDriverWait = getWebDriverWait();
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(byElement));
    }
}
