package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.AmazonSearchPage;
import utilities.Driver;

public class AmazonSearch_steps {

    AmazonSearchPage amzSearch=new AmazonSearchPage();

    @Given("User is on the amazon homepage")
    public void user_is_on_the_amazon_homepage() {
        Driver.getDriver().get("http://amazon.com");
    }

    @When("User enters headphones keyword")
    public void user_enters_headphones_keyword() {
        amzSearch.searchBox.sendKeys("headphones");


    }

    @When("User clicks to amazon search button")
    public void user_clicks_to_amazon_search_button() {
        amzSearch.searchButton.click();
    }

    @Then("User should see headphones in results")
    public void user_should_see_headphones_in_results() {
        Assert.assertTrue(amzSearch.searchResult.getText().equals("\"headphones\""));

    }
}
