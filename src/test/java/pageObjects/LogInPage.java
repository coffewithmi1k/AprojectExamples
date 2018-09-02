package pageObjects;

import config.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage extends Config {



    public void fillLogInFields(String email, String password){
        driver.findElement(By.id("username")).sendKeys(email);
        driver.findElement(By.id("reg-password")).sendKeys(password);
    }
    public void clickLogInButton(){
        driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();
    }

    public WebElement verifyUserLogged(){
       return driver.findElement(By.id("navbarDropdown2"));
    }
}
