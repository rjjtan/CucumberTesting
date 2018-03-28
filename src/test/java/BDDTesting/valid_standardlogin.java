package BDDTesting;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import java.util.List;

public class valid_standardlogin extends _abstract{

    WebDriver driver = getDriver();

    @Given("^standard admin enters valid username and password$")
    public void standard_admin_enters_valid_username_and_password(DataTable table) throws Throwable {
        List<List<String>> data = table.raw();
        driver.findElement(By.id("mat-input-0")).clear();
        driver.findElement(By.id("mat-input-0")).sendKeys(data.get(1).get(1));
        driver.findElement(By.id("mat-input-1")).clear();
        driver.findElement(By.id("mat-input-1")).sendKeys(data.get(2).get(1));
    }

    @Then("^standard admin should be able to login$")
    public void standard_admin_should_be_able_to_login() throws Throwable {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.print("Login Feature: Standard user successfully Login");

    }
}
