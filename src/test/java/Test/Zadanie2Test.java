package Test;

import Pages.Zadanie2Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Zadanie2Test extends BaseTest {

    private Zadanie2Page zadanie2Page;

    @BeforeMethod
    @Override
    public void SetUp() {
        super.SetUp();
        zadanie2Page = new Zadanie2Page(driver);
    }

    @Test
    public void wybieraSportZDropa(){
        driver.get(baseUrl);
        basePage.wybierzZadanie("2");
        List<WebElement> elementyPrzed = driver.findElements(By.cssSelector(".col-sm-6.col-md-2"));
        int liczbaPoczatkowa = elementyPrzed.size();
        System.out.println(elementyPrzed.size());
        WebElement drop = driver.findElement(By.xpath("//span[contains(@class,\"select2-container\")]"));
        zadanie2Page.wybierzZDropaSpan("Sport"+"\n");
        List<WebElement> elementyPo = driver.findElements(By.cssSelector(".col-sm-6.col-md-2"));
        int liczbaKoncowa = elementyPo.size();
        Assert.assertNotEquals(liczbaPoczatkowa,liczbaKoncowa);
        System.out.println(elementyPo.size());
        for(WebElement element : elementyPo){
            System.out.println(element.getText());
            Assert.assertTrue(element.getText().contains("Sport"));
        }
    }
}
