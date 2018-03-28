package BDDTesting;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.DataTable;
import java.util.List;

public class add_companyuser extends _abstract{
    WebDriver driver = getDriver();

    @Given("^admin clicks the add user button$")
    public void admin_clicks_the_add_user_button() throws Throwable {
        driver.findElement(By.cssSelector("button.btn.user-list-btn.mat-raised-button")).click();
    }

    @And("^admin will input the correct company user details$")
    public void admin_will_input_the_correct_company_user_details(DataTable table) throws Throwable{

        List<List<String>> data = table.raw();

        driver.findElement(By.xpath("//input[@type ='email']")).sendKeys(data.get(1).get(1));
        driver.findElement(By.xpath("//input[@placeholder ='Enter first name']")).sendKeys(data.get(2).get(1));
        driver.findElement(By.xpath("//input[@placeholder ='Enter last name']")).sendKeys(data.get(3).get(1));
        driver.findElement(By.xpath("//span[.='Choose role']")).click();
        driver.findElement(By.xpath("//span[.='Admin']")).click();
    }

    @Then("^admin will successfully add the company user$")
    public void admin_will_successfully_add_the_company_user() throws Throwable {
        driver.findElement(By.cssSelector("button.submit-btn.mat-raised-button")).click();
        Thread.sleep(5000);
    }

}