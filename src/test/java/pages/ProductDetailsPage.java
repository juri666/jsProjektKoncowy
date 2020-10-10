package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductDetailsPage {
    WebDriver driver;
    public ProductDetailsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id= "group_1")
    WebElement dropdownSize;
    @FindBy(id="quantity_wanted")
    WebElement quantityInput;
    @FindBy(css="button[data-button-action='add-to-cart']")
    WebElement buttonPrimary;

    public void product(String size, String quantity ){
        Select s= new Select(dropdownSize);
        s.selectByVisibleText(size);
        WebDriverWait wait= new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(buttonPrimary));
        quantityInput.click();
        quantityInput.sendKeys(Keys.BACK_SPACE);
        quantityInput.sendKeys(quantity);
        buttonPrimary.click();
    }

}
