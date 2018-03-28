package BDDTesting;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;



public class verify_existingcompany extends _abstract {
    WebDriver driver = getDriver();

    @Given("^admin enters existing company details$")
    public void admin_enters_existing_company_details(DataTable table) throws Throwable {
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button.company-btn.mat-raised-button")).click();
        Thread.sleep(2000);
        List<List<String>> data = table.raw();
        driver.findElement(By.xpath("//input[@placeholder ='Enter company name']")).sendKeys(data.get(1).get(1));
        driver.findElement(By.xpath("//input[@placeholder ='Enter company slug (minimun of 6 characters)']")).click();
        driver.findElement(By.xpath("//input[@placeholder ='Enter company slug (minimun of 6 characters)']")).sendKeys(data.get(2).get(1));
        driver.findElement(By.xpath("//input[@placeholder ='Enter root admin e-mail']")).click();
        driver.findElement(By.xpath("//input[@placeholder ='Enter root admin e-mail']")).sendKeys(data.get(3).get(1));
        driver.findElement(By.xpath("//span[.='Choose company plan']")).click();
        driver.findElement(By.xpath("//span[.='Basic']")).click();
    }

    @Then ("^validations message will appear$")
    public void validations_message_will_appear() throws Throwable {
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String message = driver.findElement(By.className("error")).getText();
        System.out.println(message);
    }

    @And ("^admin will input new details$")
    public void admin_will_input_new_details(DataTable table) throws Throwable {
        List<List<String>> data = table.raw();
        driver.findElement(By.xpath("//input[@placeholder ='Enter company slug (minimun of 6 characters)']")).clear();
        driver.findElement(By.xpath("//input[@placeholder ='Enter company slug (minimun of 6 characters)']")).sendKeys(data.get(1).get(1));
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
    }

}
