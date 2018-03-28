package BDDTesting;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;


import java.util.List;

public class verify_updatecompanyuser extends _abstract {
    WebDriver driver = getDriver();


    @Given ("^admin clicks the edit icon$")
    public void admin_clicks_the_edit_icon() throws Throwable{
        Thread.sleep(3000);
        List<WebElement> we  = driver.findElements(By.cssSelector("i.fa.fa-pencil"));
        we.get(0).click();
    }

    @And ("^admin updates the company user info$")
    public void admin_updates_the_company_user_info(DataTable table) throws Throwable{
        List<List<String>> data = table.raw();
        driver.findElement(By.xpath("//input[@type ='email']")).clear();
        driver.findElement(By.xpath("//input[@type ='email']")).sendKeys(data.get(1).get(1));
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then ("^validation message will display$")
    public void validation_message_will_display() throws Throwable{
        String message = driver.findElement(By.className("error")).getText();
        System.out.println(message);
        //Sending ESCAPE key
        driver.findElement(By.xpath("//input[@type ='email']")).sendKeys(Keys.ESCAPE);
    }
}
