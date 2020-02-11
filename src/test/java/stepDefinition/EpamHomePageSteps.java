package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.EpamHomePage;

import java.util.Map;

public class EpamHomePageSteps {

    private EpamHomePage epamHomePage = new EpamHomePage();


    @Given("user is on a home page")
    public void userIsOnAHomePage() {
        Assert.assertEquals(epamHomePage.getTitle(), "Home Page");
    }

    @When("he presses on login button")
    public void hePressesOnLoginButton() {
        epamHomePage.pressLoginButton();
    }

    @And("he inputs his credentials and logs in")
    public void heInputsHisCredentialsAndLogsIn(Map<String, String> dataTable) {
        String login = dataTable.get("Login");
        String password = dataTable.get("Password");
        epamHomePage.loggingIn(login, password);
    }

    @And("he presses on contact form button")
    public void hePressesOnContactFormButton() {
        epamHomePage.pressContactFormButton();
    }

    @And("he moves to services dates tab")
    public void heMovesToServicesDatesTab() {
        epamHomePage.pressServiceDatesButton();
    }

}
