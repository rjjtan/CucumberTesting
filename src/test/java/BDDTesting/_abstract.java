package BDDTesting;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import java.util.concurrent.TimeUnit;
import java.util.Collections;

public class _abstract {

    protected static WebDriver driver;

// <!------ CHROME BROWSER ------>
/**    protected WebDriver getDriver(){
        if (driver == null){
            System.setProperty("webdriver.chrome.driver", "/Applications/Google Chrome.app/Contents/MacOS/chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-fullscreen");
            options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("http://admin.kinvo.ph/login");
        }
         return driver;
    }
**/

// <!------ FIREFOX ------>
    protected WebDriver getDriver(){
        if (driver == null){
            System.setProperty("webdriver.gecko.driver", "/Applications/Firefox.app/Contents/MacOS/geckodriver");
            FirefoxOptions firefoxOptions = new FirefoxOptions();
            this.driver = new FirefoxDriver(firefoxOptions);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("http://admin.kinvo.ph/login");
        }
         return driver;
    }


// <!------ SAFARI ------>
/**      protected WebDriver getDriver(){
      if (driver == null){
            WebDriver driver = new SafariDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get("http://admin.kinvo.ph/login");
      }
         return driver;
    } **/
}


