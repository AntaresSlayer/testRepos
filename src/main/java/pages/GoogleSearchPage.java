package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class GoogleSearchPage {

//    private ElementsCollection link = $$x(".//a[contains(@href,'testng')]");
    private SelenideElement link = $x(".//a[contains(@href,'testng')]");

    public void pressOnTheLink(){
 //       link.shouldBe(visible);
 //       System.out.println(link);
        link.click();
    }
}
