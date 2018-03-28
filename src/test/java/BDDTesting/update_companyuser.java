package BDDTesting;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import cucumber.api.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class update_companyuser extends _abstract{
    WebDriver driver = getDriver();

    @Given ("^admin clicked the edit icon$")
    public void admin_clicked_the_edit_icon() throws Throwable{
        List<WebElement> row  = driver.findElements(By.cssSelector("i.fa.fa-pencil"));
        row.get(0).click();
    }
    @And ("^admin update the email field$")
    public void admin_update_the_email_field(DataTable table) throws Throwable{
        List<List<String>> data = table.raw();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@type ='email']")).clear();
        driver.findElement(By.xpath("//input[@type ='email']")).sendKeys(data.get(1).get(1));
    }

    @Then ("^admin successfully update the company user info$")
    public void admin_successfully_update_the_company_user_info() throws Throwable{
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

}