package stepDefinitions;

import config.Config;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.HomePage;
import pageObjects.LogInPage;
import pageObjects.PageNavigator;
import pageObjects.SignUpPage;

import java.util.concurrent.TimeUnit;

public class feature1StepDefinitions extends Config {

     PageNavigator pn = new PageNavigator();
    HomePage onHomePage = new HomePage();
    LogInPage onLoginPage = new LogInPage();
    SignUpPage onSignUppage = new SignUpPage();

    int random = (int)(Math.random()*1000+1);
    String randomEmail ="coffe"+random+"@mailinator.com";

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
    public void user_opens_Home_Page()   {
        pn.openHomePage();
    }

    @Then("^verifies home page is opened$")
    public void verifies_home_page_is_opened()  {
        Assert.assertTrue(driver.getTitle().contains("Artist Next Door"));
    }

    @Given("^user clicks log in button$")
    public void user_clicks_log_in_button() throws InterruptedException {
        onHomePage.openLogInPage();
        Thread.sleep(3000);
    }

    @Given("^Fill log in credentials with \"([^\"]*)\" as email and \"([^\"]*)\" as password$")
    public void fill_log_in_credentials_with_as_email_and_as_password(String arg1, String arg2)   {
        onLoginPage.fillLogInFields(arg1, arg2);
    }

    @Given("^clicks log in button$")
    public void clicks_log_in_button()   {
        onLoginPage.clickLogInButton();
    }

    @Then("^verifies user is logged In$")
    public void verifies_user_is_logged_In()   {
        Assert.assertTrue(onLoginPage.verifyUserLogged().getText().contains("scoffe1@mailinator.com"));
    }

    @Given("^click SignUp$")
    public void openSignUpForm() throws InterruptedException {
        onHomePage.openSignUpPage();
        Thread.sleep(3000);
    }

    @Given("^fills all fields with valid data and random email$")
    public void fillregisterFormFields()   {
        onSignUppage.fillRegisterFields(randomEmail,"qwe1156q");
    }

    @Given("^clicks Sign UP button$")
    public void clicks_button()   {
        onSignUppage.clickSignUpButton();
    }

    @Then("^verifies sign up confirmation message is displayed$")
    public void verifies_sign_up_confirmation_message_is_displayed()   {
        Assert.assertTrue(onSignUppage.verifySignUpIsSuccessfull().getText().contains("Welcome to Artist"));


    }


}
