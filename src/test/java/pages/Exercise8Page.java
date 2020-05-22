package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Exercise8Page extends BasePage {

    @FindBy(id = "task8_form_cardType")
    private WebElement dropDownCardType;
    @FindBy(id = "task8_form_name")
    private WebElement inputNameAndLastName;
    @FindBy(id = "task8_form_cardNumber")
    private WebElement inputCardNumber;
    @FindBy(id = "task8_form_cardCvv")
    private WebElement inputCvv;
    @FindBy(id = "task8_form_cardInfo_month")
    private WebElement dropDownMonth;
    @FindBy(id = "task8_form_cardInfo_year")
    private WebElement dropDownYear;
    @FindBy(name = "task8_form[save]")
    private WebElement buttonPay;


    public void fillTheFormAndPay(String paymentMethod, String nameAndLastName, String cardNumber, String cvv, String month, String year) {
        Select dropTyp = new Select(dropDownCardType);
        dropTyp.selectByVisibleText(paymentMethod);
        sendKeysElement(inputNameAndLastName, nameAndLastName);
        sendKeysElement(inputCardNumber, cardNumber);
        sendKeysElement(inputCvv, cvv);
        Select dropM = new Select(dropDownMonth);
        dropM.selectByVisibleText(month);
        Select dropR = new Select(dropDownYear);
        dropR.selectByVisibleText(year);
        buttonPay.click();
    }

}
