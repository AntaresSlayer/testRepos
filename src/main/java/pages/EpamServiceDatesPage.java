package pages;

import static com.codeborne.selenide.Condition.visible;

import beans.CalendarManipulations;
import beans.Date;
import com.codeborne.selenide.SelenideElement;
import sections.ResultSection;

import static com.codeborne.selenide.Selenide.$x;

public class EpamServiceDatesPage {

    public ResultSection resultSection = new ResultSection();
    private SelenideElement datePickerOpener = $x("//span[contains(@class, 'input')]//i");
    private SelenideElement submitButton = $x("//button[text()='Submit']");

    public void pressDatePickerButton(){
        datePickerOpener.shouldBe(visible).click();
    }

    public void chooseDate(Date date) {
        CalendarManipulations calendarManipulations = new CalendarManipulations();
        calendarManipulations.chooseDate(date);
    }

    public void pressSubmitButton(){
        submitButton.click();
    }
}
