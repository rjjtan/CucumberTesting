package BDDTesting;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import cucumber.api.DataTable;
import java.util.List;

public class verify_username extends _abstract {


    @When ("^admin fills out the username with existing username$")
    public void admin_fills_out_the_username_with_existing_username(DataTable table) throws Throwable{
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[.='+ Add User']")).click();
        List<List<String>> data = table.raw();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder ='Enter First name']")).sendKeys(data.get(1).get(1));
        driver.findElement(By.xpath("//input[@placeholder ='Enter Last name']")).sendKeys(data.get(2).get(1));
        driver.findElement(By.xpath("//input[@placeholder ='Enter user e-mail']")).sendKeys(data.get(3).get(1));
        driver.findElement(By.xpath("//input[@placeholder ='Enter username']")).sendKeys(data.get(4).get(1));
        driver.findElement(By.xpath("//input[@placeholder ='Enter password']")).sendKeys(data.get(5).get(1));
        driver.findElement(By.xpath("//span[.='Choose role']")).click();
        driver.findElement(By.className("mat-option")).findElement(By.xpath("//span[.='Standard']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then ("^validation message for existing username should appear$")
    public void validation_message_for_existing_username_should_appear() throws Throwable{
        String message = driver.findElement(By.className("error")).getText();
        System.out.println(message);
        driver.findElement(By.xpath("//input[@placeholder ='Enter First name']")).sendKeys(Keys.ESCAPE);
    }
}
