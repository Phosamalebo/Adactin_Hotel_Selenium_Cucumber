package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.HomePage.opens_website;
import static pages.LoginPage.click_login_button;
import static pages.LoginPage.fills_in_details;
import static pages.SearchHotel.*;

public class searchHotel {

    @Given("User navigate to the search hotel page")
    public void user_navigate_to_the_search_hotel_page() {
        opens_website();
        fills_in_details();
        click_login_button();
    }

    @When("User fills in required details")
    public void user_fills_in_required_details() {
        fills_in_search_form();
    }

    @Then("User should be able to search for a hotel")
    public void user_should_be_able_to_search_for_a_hotel() {
        click_search_button();
    }


}
