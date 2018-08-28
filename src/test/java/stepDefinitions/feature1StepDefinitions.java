package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class feature1StepDefinitions {

    WebDriver driver;

    @Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @After
    public void tearDown(){
        driver.quit();
    }

    @Given("^User opens Home Page$")
    public void user_opens_Home_Page() throws Exception {
        driver.get("http://192.168.10.58/");
    }

    @Then("^verifies home page is opened$")
    public void verifies_home_page_is_opened() throws Exception {
        Assert.assertTrue(driver.getTitle().contains("Artist Next Door"));
    }

}
