package pages;

import static com.codeborne.selenide.Condition.visible;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class EpamHomePage {

    private SelenideElement loginButton = $x(".//img[@id='user-icon']");
    private SelenideElement loginInput = $x(".//input[@id='name']");
    private SelenideElement passwordInput = $x(".//input[@id='password']");
    private SelenideElement loginSubmitButton = $x(".//button[@type='submit']");
    private SelenideElement contactFormButton = $x(".//a[text()='Contact form']");
    private SelenideElement servicesButton = $x("//span[text()='Service']");
    private SelenideElement datesButton = $x("//span[text()='Dates']");

    public String getTitle(){
        return Selenide.title();
    }

    public void pressLoginButton(){
        loginButton.click();
    }

    public void loggingIn(String login, String password){
        loginInput.val(login);
        passwordInput.val(password);
        pressLoginSubmitButton();
    }

    public void pressLoginSubmitButton(){
        loginSubmitButton.click();
    }

    public void pressContactFormButton(){
        contactFormButton.click();
    }

    public void pressServiceDatesButton(){
        servicesButton.click();
        datesButton.shouldBe(visible);
        datesButton.click();
    }
}
