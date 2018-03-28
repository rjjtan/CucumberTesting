package BDDTesting;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import java.util.List;


public class valid_login extends _abstract {

    WebDriver driver = getDriver();

    @When("^admin enters valid username and valid password$")
    public void admin_enters_valid_username_and_valid_password(DataTable table) {
        List<List<String>> data = table.raw();

        driver.findElement(By.id("mat-input-0")).clear();
        driver.findElement(By.id("mat-input-0")).sendKeys(data.get(1).get(1));
        driver.findElement(By.id("mat-input-1")).click();
        driver.findElement(By.id("mat-input-1")).clear();
        driver.findElement(By.id("mat-input-1")).sendKeys(data.get(2).get(1));
    }

    @Then("^admin login successfully$")
    public void admin_login_successfully() {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
