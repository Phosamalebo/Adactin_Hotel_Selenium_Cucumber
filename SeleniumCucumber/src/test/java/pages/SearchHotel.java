package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import utilities.browserDriver;

public class SearchHotel extends browserDriver {

    public static String verify_search_hotel = "//td[@class='login_title' and normalize-space()='Select Hotel']\n";


    public static void fills_in_search_form(){

        WebElement locationDropdown = driver.findElement(By.id("location"));
        // Create a Select object
        Select selectLocation = new Select(locationDropdown);
        // Select "Hotel Creek" by its value attribute
        selectLocation.selectByValue("London");

        WebElement hotelDropdown = driver.findElement(By.id("hotels"));
        // Create a Select object
        Select selectHotel = new Select(hotelDropdown);
        // Select "Hotel Creek" by its value attribute
        selectHotel.selectByValue("Hotel Creek");

        WebElement hotelRoomType = driver.findElement(By.id("room_type"));
        // Create a Select object
        Select selectRoomType = new Select(hotelRoomType);
        // Select "Hotel Creek" by its value attribute
        selectRoomType.selectByValue("Double");

        WebElement hotelNumberOfRooms = driver.findElement(By.id("room_nos"));
        // Create a Select object
        Select selectNumberOfRooms = new Select(hotelNumberOfRooms);
        // Select "Hotel Creek" by its value attribute
        selectNumberOfRooms.selectByValue("1");

        WebElement hotelAdults = driver.findElement(By.id("adult_room"));
        // Create a Select object
        Select selectAdults = new Select(hotelAdults);
        // Select "Hotel Creek" by its value attribute
        selectAdults.selectByValue("2");


        WebElement hotelChildren = driver.findElement(By.id("child_room"));
        // Create a Select object
        Select selectChildren = new Select(hotelChildren);
        // Select "Hotel Creek" by its value attribute
        selectChildren.selectByValue("1");

    }

    public static void click_search_button(){

        driver.findElement(By.id("Submit")).click();
        Assert.assertTrue("Select Hotel", driver.findElement(By.xpath(verify_search_hotel)).isDisplayed());
    }
}
