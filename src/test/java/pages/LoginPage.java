package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(name ="email")
    WebElement loginInput;
    @FindBy(name= "password")
    WebElement passwordInput;
    @FindBy(id= "submit-login")
    WebElement submitloginButton;

    public void login (String user, String password){
        loginInput.sendKeys(user);
        passwordInput.sendKeys(password);
        submitloginButton.click();

    }





}
