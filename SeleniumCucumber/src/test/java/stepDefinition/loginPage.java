package stepDefinition;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static pages.HomePage.opens_website;
import static pages.LoginPage.*;


public class loginPage {


    @Given("User is on the Adactin Hotel App login page")
    public void user_is_on_the_adactin_hotel_app_login_page() {
        opens_website();
    }



    @When("User logins with correct details")
    public void user_logins_with_correct_details() {
        fills_in_details();
    }


    @Then("User should be logged in")
    public void user_should_be_logged_in() {
        click_login_button();
    }



}
