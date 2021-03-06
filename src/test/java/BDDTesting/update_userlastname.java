package BDDTesting;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import cucumber.api.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class update_userlastname extends _abstract{
    WebDriver driver = getDriver();

    @Given("^admin clicks the edit icon to edit lastname$")
    public void admin_clicks_the_edit_icon_to_edit_lastname() throws Throwable{
        Thread.sleep(2000);
        List<WebElement> we  = driver.findElements(By.cssSelector("i.fa.fa-pencil"));
        we.get(0).click();
    }

    @And("^admin update the user lastname$")
    public void admin_update_the_user_lastname(DataTable table) throws Throwable{
        List<List<String>> data = table.raw();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder ='Enter Last name']")).clear();
        driver.findElement(By.xpath("//input[@placeholder ='Enter Last name']")).sendKeys(data.get(1).get(1));
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("^admin successfully update the user lastname$")
    public void admin_successfully_update_the_user_lastname() throws Throwable{
        System.out.println("Successfully updated the lastname");
    }
}
