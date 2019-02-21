package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.EtsyHomePage;
import utilities.BrowserUtils;
import utilities.Driver;

public class EtsySearch_steps {

    EtsyHomePage ets=new EtsyHomePage();
    @Given("user on the etsy home page")
    public void user_on_the_etsy_home_page() {
        Driver.getDriver().get("https://www.etsy.com/");

    }

    @When("user search for {string}")
    public void user_search_for(String input) {
        ets.serachBoxInput.sendKeys(input);
        ets.serachButton.click();

    }

    @Then("user see should see {string} in the title>")
    public void user_see_should_see_in_the_title(String input) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(input.substring(0,1).toUpperCase()+input.substring(1)));

    }


}
