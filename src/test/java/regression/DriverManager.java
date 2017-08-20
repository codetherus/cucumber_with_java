package regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by mac on 8/19/17.
 */
public class DriverManager {

    public static WebDriver driver;

    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "./chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("./chromedriver");
        driver = new ChromeDriver(options);
//        driver = new SafariDriver();
        driver.get("");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void closeBrowser(){
        driver.quit();
    }


    @Test
    public void getPath(){
        System.out.println("this is path");
        System.out.println(System.getProperty("user.dir")+"/resources/chromedriver");
    }
}
