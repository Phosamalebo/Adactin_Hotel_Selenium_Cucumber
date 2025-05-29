package pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import utilities.browserDriver;


public class LoginPage extends browserDriver {

    public static String username = "username";
    public static String password = "password";
    public static String login = "login";
    public static String verify_login = "//img[@src='img/Adactin-Logo.jpg']\n";


    public static void fills_in_details(){
        driver.findElement(By.id(username)).sendKeys("Omphe1995");
        driver.findElement(By.id(password)).sendKeys("27IS4Y");

    }

    public static void click_login_button(){

        driver.findElement(By.id(login)).click();

        Assert.assertTrue("Adactin Think Tech, Think Us", driver.findElement(By.xpath(verify_login)).isDisplayed());

    }

}