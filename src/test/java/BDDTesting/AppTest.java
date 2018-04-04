package BDDTesting;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/kinvoqa/IdeaProjects/BDDTesting/src/test/java/features",
        tags = "@log"
)

public class AppTest{

}
