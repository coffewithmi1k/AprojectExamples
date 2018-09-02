package pageObjects;

import config.Config;
import org.openqa.selenium.WebDriver;

public class PageNavigator extends Config {


    public HomePage openHomePage(){
        driver.get("https://stage.your-nextdoor.com/");
        return new HomePage();
    }
}

