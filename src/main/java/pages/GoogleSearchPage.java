package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class GoogleSearchPage {

    private SelenideElement link = $x(".//a[contains(@href,'testng')]");

    public void pressOnTheLink(){
        link.click();
    }
}
