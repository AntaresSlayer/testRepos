package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import pages.EpamContactFormPage;

import java.util.Map;

public class EpamContactFormPageSteps {

    private EpamContactFormPage epamContactFormPage = new EpamContactFormPage();

    @And("he fills it with some data")
    public void heFillsItWithSomeData(Map<String, String> dataTable) {
        String name = dataTable.get("Name");
        String lastName = dataTable.get("Last Name");
        String weather = dataTable.get("Weather");
        String descr = dataTable.get("Description");

        epamContactFormPage.inputAllData(name, lastName, weather, descr);
    }

    @And("he presses submit button")
    public void hePressesSubmitButton(){
        epamContactFormPage.pressSubmitButton();
    }

    @Then("result area has some information about user")
    public void resultAreaHasSomeInformationAboutUser(Map<String, String> dataTable) {
        String lastName = dataTable.get("Last Name");
        String weather = dataTable.get("Weather");
        String descr = dataTable.get("Description");

        Assert.assertTrue(epamContactFormPage.resultSection.getResultsFromArea(lastName) & epamContactFormPage.resultSection.getResultsFromArea(weather));
    }
}
