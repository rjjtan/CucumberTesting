package BDDTesting;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;


public class update_company extends _abstract {
    WebDriver driver = getDriver();

    @Given("^admin clicks on the list of the company$")
    public void admin_clicks_on_the_list_of_the_company() throws Throwable {
        driver.findElement(By.xpath("//span[.='new company']")).click();
    }

    @Then("^admin will update the created company$")
    public void admin_will_update_the_created_company() throws Throwable {
        driver.findElement(By.cssSelector("div.mat-select-value")).click();
        driver.findElement(By.xpath("//span[.='Pro']")).click();

    }
}
