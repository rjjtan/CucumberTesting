package BDDTesting;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;


public class verify_login extends _abstract {

    WebDriver driver = getDriver();

    @Given("^admin open a browser and navigate to admin tool url$")
    public void admin_open_a_browser_and_navigate_to_admin_tool_url() {

        // driver.get("http://admin.kinvo.ph/login");
    }

    @When("^admin enters invalid username or password$")
    public void admin_enters_invalid_username_or_password(DataTable table) {
        List<List<String>> data = table.raw();
        driver.findElement(By.id("mat-input-0")).click();
        driver.findElement(By.id("mat-input-0")).sendKeys(data.get(1).get(1));
        driver.findElement(By.id("mat-input-1")).click();
        driver.findElement(By.id("mat-input-1")).sendKeys(data.get(1).get(1));
    }

    @Then("^admin should not be able to login successfully$")
    public void admin_should_not_be_able_to_login_successfully() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
