package pages;

import static com.codeborne.selenide.Condition.visible;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class GoogleHomePage {

    private SelenideElement input = $x(".//input[@class='gLFyf gsfi']");
    private SelenideElement searchButton = $x("//input[@type='submit']");

    public String getTitle(){
        return Selenide.title();
    }

    public void enterText(String text){
        input.shouldBe(visible);
        input.val(text);
    }

    public void pressSearchButton(){
        searchButton.click();
    }
}
