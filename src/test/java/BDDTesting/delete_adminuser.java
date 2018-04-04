package BDDTesting;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class delete_adminuser extends _abstract {
    WebDriver driver = getDriver();

    @Given ("^admin clicks the delete icon to delete the created admin user$")
    public void admin_clicks_the_delete_icon_to_delete_the_created_admin_user() throws Throwable{
        Thread.sleep(2000);
        List<WebElement> del  = driver.findElements(By.cssSelector("i.fa.fa-trash-o"));
        del.get(0).click();
    }

    @Then ("^admin will successfully deleted the admin user$")
    public void admin_will_successfully_deleted_the_admin_user() throws Throwable{
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
