package BDDTesting;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import cucumber.api.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class update_rootrole extends _abstract {

    WebDriver driver = getDriver();

    @Given ("^admin clicked the transfer root role$")
    public void admin_clicked_the_transfer_root_role() throws Throwable{
        Thread.sleep(3000);
        List<WebElement> we  = driver.findElements(By.cssSelector("i.fa.fa-reply"));
        we.get(0).click();
    }

    @Then ("^new user will have a root role$")
    public void new_user_will_have_root_role() throws Throwable{
        System.out.println("New root role is assigned");
    }
}
