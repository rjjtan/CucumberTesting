package BDDTesting;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class delete_companyuser extends _abstract{
    WebDriver driver = getDriver();

    @Given ("^admin clicks the delete icon$")
    public void admin_clicked_the_delete_icon() throws Throwable{
        Thread.sleep(3000);
        List<WebElement> we  = driver.findElements(By.cssSelector("i.fa.fa-trash-o"));
        we.get(1).click();
    }

    @And ("^admin clicks the button to confirm$")
    public void admin_clicks_the_button_to_confirm() throws Throwable{
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    @Then("^admin successfully remove the company user$")
    public void admin_successfully_remove_the_company_user() throws Throwable{
        System.out.println("User is successfully deleted");
    }

}
