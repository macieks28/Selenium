package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static waits.Wait.waitUntilElementIsVisible;

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

    private Logger logger = LogManager.getRootLogger();

    public Exercise8Page selectCardType(String paymentMethod) {
        waitUntilElementIsVisible(dropDownCardType);
        Select dropTyp = new Select(dropDownCardType);
        dropTyp.selectByVisibleText(paymentMethod);
        logger.info("Selected payment method {}", paymentMethod);
        return this;
    }

    public Exercise8Page typeNameAndLastname(String nameAndLastName) {
        sendKeysElement(inputNameAndLastName, nameAndLastName);
        logger.info("Typed name and last name {}", nameAndLastName);
        return this;
    }

    public Exercise8Page typeCardNumber(String cardNumber) {
        sendKeysElement(inputCardNumber, cardNumber);
        logger.info("Typed card number {}", cardNumber);
        return this;
    }

    public Exercise8Page typeCvv(String cvv) {
        sendKeysElement(inputCvv, cvv);
        logger.info("Typed CVV {}", cvv);
        return this;
    }

    public Exercise8Page selectMonth(String month) {
        Select dropMonth = new Select(dropDownMonth);
        dropMonth.selectByVisibleText(month);
        logger.info("Selected month {}", month);
        return this;
    }

    public Exercise8Page selectYear(String year) {
        Select dropYear = new Select(dropDownYear);
        dropYear.selectByVisibleText(year);
        logger.info("Selected year {}", year);
        return this;
    }

    public Exercise8Page clickOnPayButton() {
        buttonPay.click();
        logger.info("Clicked Pay button");
        return this;
    }
}


