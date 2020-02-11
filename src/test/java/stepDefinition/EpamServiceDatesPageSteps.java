package stepDefinition;

import beans.Date;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import pages.EpamServiceDatesPage;

public class EpamServiceDatesPageSteps {

    EpamServiceDatesPage epamServiceDatesPage = new EpamServiceDatesPage();

    @And("chooses the date '(.*)'")
    public void choosesTheDate(String date) {
        epamServiceDatesPage.pressDatePickerButton();
        epamServiceDatesPage.chooseDate(new Date(date));
    }

    @And("presses the submit button")
    public void pressesTheSubmitButton() {
        epamServiceDatesPage.pressSubmitButton();
        Assert.assertFalse(epamServiceDatesPage.resultSection.resultAreaIsEmpty());
    }

    @Then("result area contains required date '(.*)'")
    public void resultAreaContainsRequiredDate(String text) {
        Assert.assertTrue(epamServiceDatesPage.resultSection.getResultsFromArea(text));
    }
}
