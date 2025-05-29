
package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.browserDriver;

public class HomePage extends browserDriver {

    public static void opens_website(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Navigate to the website
        driver.get("https://adactinhotelapp.com/index.php");
    }
}
