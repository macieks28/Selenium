package Test;

import Pages.BasePage;
import Pages.Zadanie1Page;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage;
    protected String baseUrl = "https://testingcup.pgs-soft.com/";


    @BeforeMethod
    public void SetUp(){
        System.setProperty("webdriver.chrome.driver","C:/Users/Admin/IdeaProjects/Asta/geckodriver.exe");
        //WebDriverManager.chromedriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        basePage = new BasePage(driver);


    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
