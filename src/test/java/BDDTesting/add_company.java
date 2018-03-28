package BDDTesting;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;


public class add_company extends _abstract {

    WebDriver driver = getDriver();


    @Given("^admin click the add company button$")
    public void admin_click_the_add_company_button() throws Throwable {
        driver.findElement(By.cssSelector("button.company-btn.mat-raised-button")).click();
    }

    @Then("^admin will input the company details$")
    public void admin_will_input_the_company_details(DataTable table) throws Throwable {

        List<List<String>> data = table.raw();

        driver.findElement(By.id("mat-input-2")).sendKeys(data.get(1).get(1));
        driver.findElement(By.id("mat-input-3")).click();
        driver.findElement(By.id("mat-input-3")).sendKeys(data.get(2).get(1));
        driver.findElement(By.id("mat-input-4")).click();
        driver.findElement(By.id("mat-input-4")).sendKeys(data.get(3).get(1));
        driver.findElement(By.cssSelector("div.mat-select-value")).click();
        driver.findElement(By.id("mat-option-1")).click();
    }

    @And("^admin should create a new company$")
    public void admin_should_create_a_new_company() throws Throwable {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        System.out.println("User successfully added a new company");
        Thread.sleep(3000);
    }


}
