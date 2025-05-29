package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.browserDriver;

public class BookHotel extends browserDriver {

    public static String verify_book_hotel = "//td[@class='login_title']\n";

    public static void books_hotel(){
        driver.findElement(By.id("radiobutton_0")).click();
        driver.findElement(By.id("continue")).click();

        driver.findElement(By.id("first_name")).sendKeys("Malebo");
        driver.findElement(By.id("last_name")).sendKeys("Phosa");
        driver.findElement(By.id("address")).sendKeys("Ivory");
        driver.findElement(By.id("cc_num")).sendKeys("1234567890987654");


        WebElement hotelCardType = driver.findElement(By.id("cc_type"));
        // Create a Select object
        Select selectCardType = new Select(hotelCardType);
        // Select "Hotel Creek" by its value attribute
        selectCardType.selectByValue("VISA");

        WebElement hotelMonth = driver.findElement(By.id("cc_exp_month"));
        // Create a Select object
        Select selectMonth = new Select(hotelMonth);
        // Select "Hotel Creek" by its value attribute
        selectMonth.selectByValue("4");

        WebElement hotelYear = driver.findElement(By.id("cc_exp_year"));
        // Create a Select object
        Select selectYear = new Select(hotelYear);
        // Select "Hotel Creek" by its value attribute
        selectYear.selectByValue("2025");

        driver.findElement(By.id("cc_cvv")).sendKeys("1234");



    }

    public static void click_book_hotel_button(){

        driver.findElement(By.id("book_now")).click();
        Assert.assertTrue("Booking Confirmation", driver.findElement(By.xpath(verify_book_hotel)).isDisplayed());
    }
}
