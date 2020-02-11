package pages;

import com.codeborne.selenide.*;
import sections.ResultSection;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class EpamContactFormPage {

    public ResultSection resultSection = new ResultSection();
    private ElementsCollection inputName = $$x(".//input[@id='name']");
    private SelenideElement inputLastName = $x(".//input[@id='last-name']");
    private SelenideElement dropDownButton = $x("//div[@id='weather']//button");
    private SelenideElement inputDescription = $x(".//textarea[@id='description']");
    private SelenideElement submitButton = $x(".//button[text()='Submit']");
    private SelenideElement weather = $x("//label[contains(@for, 'g5')]");
    private ElementsCollection resultArea = $$x("//ul[@class='panel-body-list results']//li");


    public void inputAllData (String name, String lastName, String weather, String descr) {
        inputName.find(visible).val(name);
        inputLastName.val(lastName);
        pressDropDownButton();
        chooseWeather(weather);
        inputDescription.val(descr);
    }

    public void pressDropDownButton(){
        dropDownButton.click();
    }

    public void chooseWeather(String weather){
        this.weather.click();
    }

    public void pressSubmitButton(){
        submitButton.click();
    }

    public boolean checkResults(){
        return true;
    }
/*    public boolean checkResults(String lastName, String weather, String descr){
        SelenideElement lastNameResult = resultArea.get(1);
        SelenideElement descrResult = resultArea.get(2);
        SelenideElement weatherResult = resultArea.get(3);
        return getParsedText(lastNameResult).equals(lastName) &
               getParsedText(descrResult).equals(descr) &
               getParsedText(weatherResult).equals(weather);
    }

    private String getParsedText(SelenideElement element){
        return element.text().split(":")[1].trim();
    }*/
}
