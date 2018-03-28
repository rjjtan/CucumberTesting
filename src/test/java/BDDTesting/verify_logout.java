package BDDTesting;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class verify_logout extends _abstract {

    WebDriver driver = getDriver();

    @Given("^user has already logged in$")
    public void user_has_already_logged_in() throws Throwable {
        Thread.sleep(5000);
    }

    @And("^user click logout$")
    public void user_click_logout() throws Throwable {
        driver.findElement(By.xpath("//span[.='Logout ']")).click();
    }

    @Then("^user must be logged out$")
    public void user_must_be_logged_out() throws Throwable{
        System.out.println("User has logged out");
        driver.close();
    }
}
