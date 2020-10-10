package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalConfirmationPage {
    WebDriver driver;
    public ModalConfirmationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css= "a.btn.btn-primary")
    WebElement buttonPrimal;

    public void checkout() {
        WebDriverWait wait= new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(buttonPrimal));
        buttonPrimal.click();
    }
}
