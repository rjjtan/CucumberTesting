package BDDTesting;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;

import java.util.List;

public class verify_companyuser extends _abstract {

    WebDriver driver = getDriver();

    @Given("^admin click the add user button$")
    public void admin_click_the_add_user_button() throws Throwable {
        driver.findElement(By.cssSelector("button.btn.user-list-btn.mat-raised-button")).click();
    }

    @And("^admin will input the existing user details$")
    public void admin_will_input_the_existing_user_details(DataTable table) throws Throwable{
        List<List<String>> data = table.raw();
        driver.findElement(By.xpath("//input[@type ='email']")).sendKeys(data.get(1).get(1));
        driver.findElement(By.xpath("//input[@placeholder ='Enter first name']")).sendKeys(data.get(2).get(1));
        driver.findElement(By.xpath("//input[@placeholder ='Enter last name']")).sendKeys(data.get(3).get(1));
        driver.findElement(By.xpath("//span[.='Choose role']")).click();

    }

    @Then("^admin will not successfully add the company user$")
    public void admin_will_not_successfully_add_the_company_user() throws Throwable {
        driver.findElement(By.xpath("//span[.='Admin']")).click();
        driver.findElement(By.cssSelector("button.submit-btn.mat-raised-button")).click();
    }


    @And("^error message will display$")
    public void error_message_will_display() throws Throwable{
        String message = driver.findElement(By.className("error")).getText();
        System.out.println(message);
    }

    @Then("^admin will input new email$")
    public void admin_will_input_new_email(DataTable table) throws Throwable {
        List<List<String>> data = table.raw();
        driver.findElement(By.xpath("//input[@type ='email']")).clear();
        driver.findElement(By.xpath("//input[@type ='email']")).sendKeys(data.get(1).get(1));
        driver.findElement(By.cssSelector("button.submit-btn.mat-raised-button")).click();

    }

}
