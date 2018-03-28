package BDDTesting;
import cucumber.api.DataTable;
import cucumber.api.java.en.When;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import java.util.List;

public class verify_emailaddress extends _abstract{

    @When ("^admin fills out the email address with existing email address$")
    public void admin_fills_out_the_email_address_with_existing_email_address(DataTable table) throws Throwable{
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

        //This dropdown is to select the Standard role
        driver.findElement(By.className("mat-option")).findElement(By.xpath("//span[.='Standard']")).click();

        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String message = driver.findElement(By.cssSelector("p.error")).getText();
        System.out.println(message);
    }

    @And ("^validation message for existing email address should appear$")
    public void validation_message_for_existing_email_address_should_appear() throws Throwable{
        driver.findElement(By.xpath("//input[@placeholder ='Enter First name']")).sendKeys(Keys.ESCAPE);
    }



}
