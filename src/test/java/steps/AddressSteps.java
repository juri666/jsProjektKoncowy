package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.AddressPage;
import pages.LoginPage;
import pages.TestBase;

public class AddressSteps extends TestBase {
    @Given("^user is logged in$")
    public void useIsLoggedIn() {
        LoginPage page= new LoginPage(driver);
        page.login("Hnm@gmail.com", "Niebieski666!");
    }

    @When("^user add new address$")
    public void userAddNewAddress() {
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=address");
        AddressPage page= new AddressPage(driver);
        page.addAddress("hugo","Hugo", "Newman","Westminster", "SW1A0AA","London","United Kingdom");
    }
}
