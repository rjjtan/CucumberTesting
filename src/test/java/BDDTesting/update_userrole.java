package BDDTesting;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class update_userrole extends _abstract{

    WebDriver driver = getDriver();

    @Given ("^admin clicked the edit icon to edit user role$")
    public void admin_clicked_the_edit_icon_to_edit_user_role() throws Throwable{
        List<WebElement> we  = driver.findElements(By.cssSelector("i.fa.fa-pencil"));
        we.get(1).click();
    }

    @And ("^admin update the user role$")
    public void admin_update_the_user_role() throws Throwable{
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div.mat-select-value")).click();
        driver.findElement(By.xpath("//span[.='Admin']")).click();
    }

    @Then ("^admin successfully update the user role$")
    public void admin_successfully_update_the_user_role() throws Throwable{
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
