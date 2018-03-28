package BDDTesting;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import java.util.List;

public class verify_standarduser extends _abstract {

    WebDriver driver = getDriver();

    @Given ("^standard admin enters invalid username or password$")
    public void standard_admin_enters_invalid_username_or_password(DataTable table) throws Throwable{
        List<List<String>> data = table.raw();
        Thread.sleep(2000);
        driver.findElement(By.id("mat-input-0")).sendKeys(data.get(1).get(1));
        driver.findElement(By.id("mat-input-1")).sendKeys(data.get(2).get(1));
    }

    @Then ("^login validation message will appear$")
    public void login_validation_message_will_appear() throws Throwable{
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @And ("^standard admin should not be able to login$")
    public void standard_admin_should_not_be_able_to_login() throws Throwable{
        //printing the error message
        String message = driver.findElement(By.className("error")).getText();
        System.out.println(message);
    }
}
