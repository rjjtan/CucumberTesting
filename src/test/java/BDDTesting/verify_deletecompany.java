package BDDTesting;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class verify_deletecompany extends _abstract {

    WebDriver driver = getDriver();

    @Given("^admin clicked the delete button$")
    public void admin_clicked_the_delete_button() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[.='test company']")).click();
    }

    @And("^admin will enter incorrect password$")
    public void admin_will_enter_incorrect_password(DataTable table) throws Throwable{
        List<List<String>> data = table.raw();
        driver.findElement(By.cssSelector("button.delete-modal.mat-raised-button")).click();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(data.get(1).get(1));
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("^password validation message will display$")
    public void password_validation_message_will_display() throws Throwable {
        String message = driver.findElement(By.className("error")).getText();
        System.out.println(message);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(Keys.ESCAPE);
    }


}
