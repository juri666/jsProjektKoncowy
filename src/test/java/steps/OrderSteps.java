package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.*;
import tools.Tools;

public class OrderSteps extends TestBase {
    @Given("^logged in$")
    public void loggedIn() {
        LoginPage page= new LoginPage(driver);
        page.login("Hnm@gmail.com", "Niebieski666!");
    }
    @When("^find product$")
    public void findProduct(){
        ControllerPage page= new ControllerPage(driver);
        page.performSearch("Hummingbird Printed Sweater");
    }
    @Then("^point product details$")
    public void pointProductDetails(){
        ProductDetailsPage page= new ProductDetailsPage(driver);
        page.product("L","5");
    }
    @Then("^click modal$")
    public void clickModal(){
        ModalConfirmationPage page= new ModalConfirmationPage(driver);
        page.checkout();
    }
    @Then("^get checkout$")
    public void getCheckout(){
        OrdersDetailsPage page= new OrdersDetailsPage(driver);
        page.payment();
    }
    @Then("^get confirmation$")
    public void getConfirmation(){
        ConfirmationPage page= new ConfirmationPage(driver);
        page.checkout();
    }
    @Then("^take screenshot$")
    public void takeScreenshot(){
        Tools tools= new Tools(driver);
        tools.screenshot();
    }
}
