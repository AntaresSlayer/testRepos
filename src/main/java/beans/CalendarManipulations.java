package beans;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.$$x;

public class CalendarManipulations {

    private SelenideElement dateTable = $x("//table[@class=' table-condensed']");
    private ElementsCollection previousButtons = $$x("//th[@class='prev']");
    private ElementsCollection nextButtons = $$x("//th[@class='next']");
    private SelenideElement datePickerSwitch = $x("//th[@class='datepicker-switch']");


    public void chooseDate(Date requiredDate){
        dateTable.shouldBe(visible);
        Date currentDate = new Date();

        datePickerSwitch.doubleClick();
        chooseDecade(currentDate.getYear(), requiredDate.getYear());

        $x("//span[text()='" + requiredDate.getYear() + "']").shouldBe(visible).click();
        $x("//span[text()='" + requiredDate.getMonth(requiredDate.getMonth()) + "']").shouldBe(visible).click();
        $x("//td[@class='day' and text()='" + requiredDate.getDay() + "']").shouldBe(visible).click();
    }

    private void chooseDecade(String currentYear, String requiredYear) {
        double diff = Double.valueOf(requiredYear.substring(0,3)) - Double.valueOf(currentYear.substring(0,3));
        if (diff <= 0) {
            diff = Math.abs(diff);
            for (double i = 0; i < diff; i++) {
                previousButtons.find(visible).click();
            }
        } else {
            if (diff > 0) {
                for (double i = 0; i < diff; i++)
                    nextButtons.find(visible).click();
            }
        }
    }

}
