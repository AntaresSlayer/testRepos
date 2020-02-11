package stepDefinition;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.GoogleHomePage;
import pages.GoogleSearchPage;

import java.util.Map;

public class GoogleSearchSteps {
    private GoogleHomePage googleHomePage = new GoogleHomePage();
    private GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Given("user is on a google home page")
    public void user_is_on_a_google_home_page() {
        Assert.assertEquals(googleHomePage.getTitle(), "Google");
    }


    @When("he enters '(.*)'")
    public void heEntersWhatIsTestNG(String text) {
        googleHomePage.enterText(text);
    }

    @And("presses search button")
    public void pressesSearchButton() {
        googleHomePage.pressSearchButton();
    }

    @And("opens first link on result page")
    public void opensFirstLinkOnResultPage() {
        googleSearchPage.pressOnTheLink();
    }

    @Then("he is on required page")
    public void heIsOnRequiredPage(Map<String, String> datatable) {
        String title = datatable.get("Title");
        Assert.assertEquals(title, Selenide.title());
    }
}
