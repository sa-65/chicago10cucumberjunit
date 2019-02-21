package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.WikipediaPage;
import utilities.BrowserUtils;
import utilities.Driver;

public class WikipwediaSearch_Steps {

    WikipediaPage wiki=new WikipediaPage();
    @Given("User is on the wikipedia home page")
    public void user_is_on_the_wikipedia_home_page() {
        Driver.getDriver().get("https://en.wikipedia.org/wiki/Wikipedia");
    }

    @When("User enters Steve Jobs to search bar nd clicks enter")
    public void user_enters_Steve_Jobs_to_search_bar_nd_clicks_enter() {
        wiki.searchBox.sendKeys("Steve Jobs"+ Keys.ENTER);

    }

    @Then("User should see first header is displaying Steve Jobs")
    public void user_should_see_first_header_is_displaying_Steve_Jobs() {
        Assert.assertTrue(BrowserUtils.isElementsTextAMatch(wiki.firstHeader,"Steve Jobs",2));
    }

}
