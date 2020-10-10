package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ControllerPage {
    WebDriver driver;
    public ControllerPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(name= "s")
    WebElement searchInput;
    @FindBy(className = "product")
    WebElement productInput;

    public void performSearch(String product){
        searchInput.click();
        searchInput.sendKeys(product);
        WebDriverWait wait= new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(productInput));

        searchInput.sendKeys(Keys.ARROW_DOWN);
        searchInput.sendKeys(Keys.ENTER);
    }

}
