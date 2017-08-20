package regression;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;

/**
 * Created by mac on 8/19/17.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/mac/IdeaProjects/nlad/src/test/resources/features")
public class MyStepdefs {
    @Given("^I am on google page$")
    public void i_am_on_google_page(){
    }

}
