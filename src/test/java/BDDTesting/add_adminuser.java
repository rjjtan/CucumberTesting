package BDDTesting;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.DataTable;
import java.util.List;

public class add_adminuser extends _abstract{

    WebDriver driver = getDriver();

    @Given ("^admin clicks the button to add a new admin user$")
    public void admin_clicks_the_button_to_add_a_new_admin_user() throws Throwable{
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='+ Add User']")).click();
    }

    @Then ("^admin fills out the fields for admin user$")
    public void admin_fills_out_the_fields_for_admin_user(DataTable table) throws Throwable{
        Thread.sleep(2000);
        List<List<String>> data = table.raw();
        driver.findElement(By.xpath("//input[@placeholder ='Enter First name']")).sendKeys(data.get(1).get(1));
        driver.findElement(By.xpath("//input[@placeholder ='Enter Last name']")).sendKeys(data.get(2).get(1));
        driver.findElement(By.xpath("//input[@placeholder ='Enter user e-mail']")).sendKeys(data.get(3).get(1));
        driver.findElement(By.xpath("//input[@placeholder ='Enter username']")).sendKeys(data.get(4).get(1));
        driver.findElement(By.xpath("//input[@placeholder ='Enter password']")).sendKeys(data.get(5).get(1));
        driver.findElement(By.xpath("//span[.='Choose role']")).click();
        driver.findElement(By.xpath("//span[.='Admin']")).click();
    }

    @And ("^admin successfully added a new admin user$")
    public void admin_successfully_added_a_new_admin_user() throws Throwable{
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }


}
