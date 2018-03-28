package BDDTesting;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;

public class delete_company extends _abstract {

    WebDriver driver = getDriver();
    @Given("^admin click the delete company button$")
    public void admin_click_the_delete_company_button() throws Throwable{
        driver.findElement(By.cssSelector("button.delete-modal.mat-raised-button")).click();
        Thread.sleep(2000);
    }

    @Then("^admin will enter correct pass$")
    public void admin_will_enter_correct_pass(DataTable table) throws Throwable {
        List<List<String>> data = table.raw();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(data.get(1).get(1));
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
