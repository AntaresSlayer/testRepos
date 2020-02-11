package stepDefinition;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {

    @Before
    public void setUp(){
        Configuration.startMaximized = true;
        Configuration.timeout = 5000;
        Selenide.open("http://epam.github.io/JDI/index.html");
    }


    @After
    public void tearDown() {
//        Driver.getInstance().close();
        WebDriverRunner.getWebDriver().quit();
    }
}
