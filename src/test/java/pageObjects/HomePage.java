package pageObjects;

import config.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Config {

    public LogInPage openLogInPage(){
        driver.findElement(By.xpath("//*[@id=\"navbarTopContent\"]/ul/li[6]/a")).click();
        return new LogInPage();
    }

    public SignUpPage openSignUpPage(){
        driver.findElement(By.xpath("//*[@id=\"navbarTopContent\"]/ul/li[1]/a")).click();
        return new SignUpPage();

    }
}
