package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.Driver;

public class googleParameters_steps {

    GooglePage googlePage=new GooglePage();

    @Given("User is on the homepage of google")
    public void user_is_on_the_homepage_of_google() {
        Driver.getDriver().get("http://google.com");

    }

    @Then("User enters {string}")
    public void user_enters(String input) {
        googlePage.searchBox.sendKeys(input+ Keys.ENTER);

    }

    @Then("User should see {string} in the title")
    public void user_should_see_in_the_title(String input) {
        Assert.assertTrue(Driver.getDriver().getTitle().equals(input+" - Google Search"));
    }

}
