package pageObjects;

import config.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage extends Config {



    public void fillRegisterFields(String email, String password)    {
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("confirm-password")).sendKeys(password);

    }

    public void clickSignUpButton(){
        driver.findElement(By.xpath("//*[@id=\"registration\"]/button")).click();
    }

    public WebElement verifySignUpIsSuccessfull(){
        return driver.findElement(By.xpath("//*[@id=\"confirm-signup\"]/div/div/div[1]/div[3]"));
    }



}
