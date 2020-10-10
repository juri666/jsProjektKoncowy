package pages;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressPage {
    WebDriver driver;
    public AddressPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(name= "alias")
    WebElement aliasInput;
    @FindBy(name = "firstname")
    WebElement firstNameInput;
    @FindBy(name = "lastname")
    WebElement lastNameImput;
    @FindBy(name ="address1")
    WebElement address1Input;
    @FindBy(name = "postcode")
    WebElement postCodeImput;
    @FindBy(name = "city")
    WebElement cityImput;
    @FindBy(name= "id_country")
    WebElement selectCountry;
    @FindBy(css = "button.btn-primary")
    WebElement Buttonbtnprimary;


    public void addAddress (String alias, String firstname, String lastname, String address1, String postcode, String city, String country){
        aliasInput.sendKeys(alias);
        firstNameInput.sendKeys(firstname);
        lastNameImput.sendKeys(lastname);
        address1Input.sendKeys(address1);
        postCodeImput.sendKeys(postcode);
        cityImput.sendKeys(city);
        Select s= new Select(selectCountry);
        s.selectByVisibleText(country);
        Buttonbtnprimary.click();

    }

}
