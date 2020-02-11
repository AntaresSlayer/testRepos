package sections;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;

public class ResultSection {

    private ElementsCollection resultArea = $$x("//ul[@class='panel-body-list results']//li");

    public boolean resultAreaIsEmpty(){
        return resultArea.size() == 0;
    }

    public boolean getResultsFromArea(String text){
        return getParsedText(resultArea.find(Condition.matchesText(text))).equals(text);
    }

    private String getParsedText(SelenideElement element){
        return element.text().split(":")[1].trim();
    }
}
