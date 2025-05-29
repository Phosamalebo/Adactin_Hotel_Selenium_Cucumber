package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static pages.BookHotel.books_hotel;
import static pages.BookHotel.click_book_hotel_button;
import static pages.HomePage.opens_website;
import static pages.LoginPage.click_login_button;
import static pages.LoginPage.fills_in_details;
import static pages.SearchHotel.*;

public class bookHotel {

    @Given("User navigate to the book hotel page")
    public void user_navigate_to_the_book_hotel_page() {
        opens_website();
        fills_in_details();
        click_login_button();
        fills_in_search_form();
        click_search_button();
    }

    @When("User fills in the book a hotel form")
    public void user_fills_in_the_book_a_hotel_form() {
        books_hotel();
    }


    @Then("User should be able to book for a hotel")
    public void user_should_be_able_to_book_for_a_hotel() {
        click_book_hotel_button();
    }
}
