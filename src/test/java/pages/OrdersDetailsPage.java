package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrdersDetailsPage {
    WebDriver driver;
    public OrdersDetailsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(name= "confirm-addresses")
    WebElement buttonContinue;
    @FindBy(name= "confirmDeliveryOption")
    WebElement payByCheck;
    @FindBy(name = "payment-option")
    WebElement checkbox;
    @FindBy(name= "conditions_to_approve[terms-and-conditions]")
    WebElement checkbox2;
    @FindBy(id="payment-confirmation")
    WebElement buttonToPay;

    public void payment(){
        buttonContinue.click();
        payByCheck.click();
        checkbox.click();
        checkbox2.click();
        WebDriverWait wait= new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(buttonToPay));
        buttonToPay.click();

    }
}
