package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.GooglePage;
import utilities.Driver;

public class GoogleSearch_Steps {
    GooglePage googlePage=new GooglePage();

    @Given("User is on the google homepage")
    public void user_is_on_the_google_homepage() {
        Driver.getDriver().get("http://google.com");

    }

    @Then("User enters flowers")
    public void user_enters_flowers() {
        googlePage.searchBox.sendKeys("flowers");
    }

    @Then("User clicks search button")
    public void user_clicks_search_button() {
        googlePage.searchButton.click();
    }

    @Then("User should see results related to flowers")
    public void user_should_see_results_related_to_flowers() {
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertTrue("Keyword flower was not located in title",actualTitle.contains("flowers"));
    }
}
